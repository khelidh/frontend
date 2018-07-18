package atos.main.servlet;

import atos.main.entity.Joueur;
import atos.main.service.JoueurService;
import atos.main.service.PartieService;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
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
        idPartie = Long.parseLong(req.getParameter("idPartie"));
        
        partieService.demarrer(idPartie);

        req.setAttribute("partie", partieService.getPartie(idPartie));
        
        joueurALaMain = partieService.getJoueurALaMain(idPartie);
        req.setAttribute("joueurALaMain", joueurALaMain);
        
        partieService.distribuer((Long) req.getSession().getAttribute("idPartieRejoint"));
        
        req.getRequestDispatcher("PLATEAU_PARTIE.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        partieService.piocherCarte(joueurALaMain.getId());
        
        resp.sendRedirect("afficher-cartes-servlet");
    }
    
}
