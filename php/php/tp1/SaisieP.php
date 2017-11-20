<?php
/**
 * Created by PhpStorm.
 * User: tosanchez
 * Date: 18/11/17
 * Time: 09:09
 */?>
<form action="verif.php" method="GET">
    <p>
        <label for="nom">Nom</label>
        <input type="text" name="nom" id="nom">
    </p>
    <p>
        <label for="prenom">Prénom</label>
        <input type="text" name="prenom" id="prenom">
    </p>
    <p>
        <label for="annee">Année</label>
        <input type="text" name="annee" id="annee">
    </p>
    <p>
        <label for="email">Email</label>
        <input type="email" name="email" id="email">
    </p>
    <p>
        <input type="submit" value="Envoyer">
    </p>
</form>