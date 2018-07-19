<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="mainJoueur">
    <div class="carte">
        <img class="cartes" src="image/carte_aile_de_chauve_souris.png" alt="aile chauve souris"/>
        <p>${TypeCarte.AILE_DE_CHAUVE_SOURIS}</p>
    </div>
    <div class="carte">
        <img class="cartes" src="image/carte_corne_de_licorne.png" alt="bave"/>
        <p>${BAVE_DE_CRAPAUD}</p>
    </div>
    <div class="carte">
        <img class="cartes" src="image/carte_corne_de_licorne.png" alt="corne"/>
        <p>${CORNE_DE_LICORNE}</p>
    </div>
    <div class="carte">
        <img class="cartes" src="image/carte_mandragore.png" alt="lapis"/>
        <p>${LAPIS_LAZULI}</p>
    </div>
    <div class="carte">
        <img class="cartes" src="image/carte_mandragore.png" alt="mandragore"/>
        <p>${MANDRAGORE}</p>
    </div>
</div>

<div id="mainJoueur">
    <c:forEach items="${cartes}" var="carte">

        <c:if test="${carte.getType() eq AILE_DE_CHAUVE_SOURIS}">
            <div class="carte">
               <img class="cartes" src="image/carte_aile_de_chauve_souris.png" alt="aile chauve souris"/>
            </div>
        </c:if>

    </c:forEach>

</div>

