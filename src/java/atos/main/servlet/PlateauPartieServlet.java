package atos.main.servlet;

import atos.main.entity.Joueur;
import atos.main.entity.Partie;
import atos.main.service.JoueurService;
import atos.main.service.PartieService;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Administrateur
 */

@WebServlet(name = "PlateauPartieServlet", urlPatterns = {"/plateau-partie-servlet"})
public class PlateauPartieServlet extends HttpServlet {
    PartieService partieService = new PartieService();
    JoueurService joueurService = new JoueurService();
    
    Long idPartie;
    Joueur joueurALaMain;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        idPartie = (Long) req.getSession().getAttribute("idPartieRejoint");
        
        Partie partie = partieService.getPartie(idPartie);

        partieService.demarrer(idPartie);
        
        req.setAttribute("partie", partie);
        
        joueurALaMain = partieService.getJoueurALaMain(idPartie);
        req.setAttribute("joueurALaMain", joueurALaMain);
        
        partieService.distribuer(idPartie);
        req.getRequestDispatcher("PLATEAU_PARTIE.jsp").forward(req, resp);
    }
}
