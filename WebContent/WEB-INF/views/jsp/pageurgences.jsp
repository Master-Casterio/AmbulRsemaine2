<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<div class="bandeausup">
<h1>Ambul'R</h1>
<div class="titre">
<h2>Urgence</h2>
</div>
</div>
<div id="typeaccident">
<form id="pagemalaise" action="malaise" method="post">
<div>
<input id="malaise" type="submit" value="Malaise">
</div>
</form>
    <form id="pageaccident" action="#" method="post">
<div class="accident">
    <button class="accidentcorp">Accident corporelle</button>
</div>
</form>
</div>
<div class="choixaccident">
    <Select class="choix" name="choix[]" multiple>
        <optgroup label="Haut du corps">
            <option value="tete">tête</option>
            <option value="ventre">ventre</option>
            <option value="dos">dos</option>
            <option value="bras">bras</option>
            <option value="mains">mains</option>
        </optgroup>
        <optgroup label="Bas du corps">
            <option value="Jambes">Jambes</option>
            <option value="pieds">pieds</option>
            <option value="cheville">cheville</option>
        </optgroup>
    </Select>
</div>
<div>
    <input id="valider" type="submit" value="Valider">
</div>