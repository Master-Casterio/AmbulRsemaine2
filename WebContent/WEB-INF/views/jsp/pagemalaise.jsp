<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<div class="bandeausup">
    <h1>Ambul'R</h1>
    <div class="titre">
        <h2>Urgence</h2>
    </div>
</div>
<div id="typeaccident">
<form id="pagemalaise" action="#" method="post">
    <div>
        <button class="malaise">Malaise</button>
    </div>
</form>
    <form id="pageaccident" action="urgenceCorporelle" method="post">
    <div class="accident">
        <button class="accidentcorps">Accident corporelle</button>
    </div>
</form>
</div>
<div class="etat">
    <div class="texte">
    <p7>La personne est :</p7>
    </div>
        <div>
    <label for="consciente">Consciente</label>
    <input id="consciente" type="checkbox" value="html" name="consciente">
    </div>
    <div>
    <label for="respire">Respire</label>
    <input id="respire" type="checkbox" value="html" name="respire">
    </div>
</div>
<div>
    <input id="valider" type="submit" value="Valider">
</div>