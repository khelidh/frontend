<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="Cache-Control" content="no-cache">
        <title>Template of Centurion</title>

        <!-- #Import Font-->
        <link href="https://fonts.googleapis.com/css?family=Eater" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Gloria+Hallelujah" rel="stylesheet">

        <!-- #Import Image-->
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css" integrity="sha384-lKuwvrZot6UHsBSfcMvOkWwlCMgc0TaWr+30HWe3a4ltaBwTZhyTEggF5tJv8tbt"
              crossorigin="anonymous">

        <c:import url="_STYLESHEET.jsp"/>
    </head>
    <body>
        <c:import url="_HEADER.jsp"/>

        <div id="contenu">     

            <br>
            <br>
            <p>Plateau</p>
            <br>
            <br>

            <header id="informationPartie">
                

            </header>

            <main>
                <div id="listeJoueurs">
                    <c:forEach items="${partie.joueurs}" var="joueur">
                        <c:if test="${joueur.id ne idJoueurPrincipal}">
                            
                            <div class="mainBot">
                                <p>${joueur.pseudo}</p>
                                <img class="dosCarte" src="image/dos_de_carte.png" width="300" height="500" alt="dos de carte"/>
                                <p>${joueur.cartes.size()}</p>
                            </div>

                        </c:if>
                    </c:forEach>
                </div>


                <div id="mainJoueur">
                </div>

                <input class="bouton boutonLancer" type="button" value="Lancer" name="LancerSORT"/>
                <input class="bouton boutonPasser" type="button" value="Passer" name="PasserTOUR"/>

            </main>
        </div>

        <c:import url="_FOOTER.jsp"/>
        <c:import url="_JAVASCRIPT.jsp"/>
    </body>
</html>