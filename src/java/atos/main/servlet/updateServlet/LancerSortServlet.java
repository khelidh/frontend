/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atos.main.servlet.updateServlet;

import atos.main.entity.Carte;
import atos.main.service.PartieService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrateur
 */
@WebServlet(name = "LancerSortServlet", urlPatterns = {"/lancer-sort-servlet"})
public class LancerSortServlet extends HttpServlet {
    
    PartieService partieService = new PartieService();
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Carte.TypeCarte selection1, selection2;
        
        Long idJoueur = (Long) req.getSession().getAttribute("idJoueur");
//        partieService.determinerSort(selection1, selection2);
    }
    
    
}
