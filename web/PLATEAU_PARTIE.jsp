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
                <h2>Information</h2>
                <p>Il reste ${partie.joueurs.size()} dans la partie ${partie.nom}</p>
                <p>Joueur qui à la main ${joueurALaMain.pseudo}</p>
                <p>A ${joueurALaMain.pseudo} de jouer !</p>

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
                    <div class="carte">
                        <img class="cartes" src="image/carte_aile_de_chauve_souris.png" alt="aile_chauve_souris"/>
                        <p>0</p>
                    </div>
                    <div class="carte">
                        <img class="cartes" src="image/carte_corne_de_licorne.png" alt="bave"/>
                        <p>0</p>
                    </div>
                    <div class="carte">
                        <img class="cartes" src="image/carte_corne_de_licorne.png" alt="corne"/>
                        <p>0</p>
                    </div>
                    <div class="carte">
                        <img class="cartes" src="image/carte_mandragore.png" alt="lip"/>
                        <p>0</p>
                    </div>
                    <div class="carte">
                        <img class="cartes" src="image/carte_mandragore.png" alt="mandragore"/>
                        <p>0</p>
                    </div>
                </div>

                <button type="submit" form="POST" >Passer</button>
                <button>Lancer</button>

            </main>
        </div>

        <c:import url="_FOOTER.jsp"/>
        <c:import url="_JAVASCRIPT.jsp"/>
    </body>
</html>