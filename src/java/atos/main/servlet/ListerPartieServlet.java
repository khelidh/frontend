package atos.main.servlet;

import atos.main.entity.Partie;
import atos.main.service.PartieService;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Administrateur
 */
@WebServlet(name = "ListerPartieServlet", urlPatterns = {"/lister-partie-servlet"})
public class ListerPartieServlet extends HttpServlet {
    PartieService partieService = new PartieService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        List<Partie> parties = partieService.getPartiesEnPrepapration();
        if (parties != null)
            req.setAttribute("parties", parties);
        
        req.getRequestDispatcher("LISTE_PARTIE.jsp").forward(req, resp);
    }
}
