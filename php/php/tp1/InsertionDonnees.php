<?php
/**
 * Created by PhpStorm.
 * User: tosanchez
 * Date: 18/11/17
 * Time: 09:26
 */
?>
<form action="insertionValeur.php" method="POST">
    <p>
        <label for="login">Login : </label>
        <input type="text" name="login" id="login">
    </p>
    <p>
        <label for="mdp">Mot de passe : </label>
        <input type="password" name="mdp" id="mdp">
    </p>
    <p>
        <label for="annee">Année de naissance : </label>
        <input type="text" name="annee" id="annee">
    </p>
    <p>
        <label for="email">Email : </label>
        <input type="email" name="email" id="email">
    </p>
    <p>
        <input type="submit" value="Envoyer">
    </p>
</form>