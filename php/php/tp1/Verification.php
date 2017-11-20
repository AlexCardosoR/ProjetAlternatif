<?php
/**
 * Created by PhpStorm.
 * User: tosanchez
 * Date: 15/11/17
 * Time: 19:16
 */
include "Personne.php";
include "Validation.php";

$Tmessage = [];

$prenom = $_GET['prenom'];
$nom = $_GET['nom'];
$annee = $_GET['annee'];
$email = $_GET['email'];


try {
        if (!Validation::validate_string($prenom)) {
            $Tmessage[] = 'Erreur : Prénom non valide';
        }
        if (!Validation::validate_string($nom)) {
            $Tmessage[] = 'Erreur : Nom non valide';
        }
        if (!Validation::validate_annee($annee)){
            $Tmessage[] = 'Erreur : Année non valide';
        }
        if (!Validation::validate_email($email)){
            $Tmessage[] = 'Erreur : Email non valide';
        }
}
catch (Exception $e){
    echo $e;
}

if(empty($Tmessage)){
    $p = new Personne($prenom, $nom, $annee, $email);

    echo $p;
}
else {
    require("erreur.php");
}
