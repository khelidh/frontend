/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atos.main.servlet;

import atos.main.entity.Partie;
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
@WebServlet(name = "LobbyPartieServlet", urlPatterns = {"/lobby-partie-servlet"})
public class LobbyPartieServlet extends HttpServlet {
    
    PartieService partieService = new PartieService();
    Long idPartie;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        idPartie = (Long) req.getSession().getAttribute("idPartieRejoint");
        Partie partie = partieService.getPartie(idPartie);
        
        req.setAttribute("partie", partie);
        
        req.getRequestDispatcher("LOBBY_PARTIE.jsp").forward(req, resp);
    }
}
