<?php
/**
 * Created by PhpStorm.
 * User: tosanchez
 * Date: 18/11/17
 * Time: 08:24
 */
include "Validation.php";

$host_name='mysql:host=hina; dbname=dbtosanchez';
$username = "tosanchez";
$mdp = "tosanchez";

$db=new PDO($host_name,$username,$mdp);

//$Tmessage = [];
//
//$login = $_POST['login'];
//$mdp = $_POST['mdp'];
//$annee = $_POST['annee'];
//$email = $_POST['email'];
//
//try {
//        if (!Validation::validate_string($login)) {
//            $Tmessage[] = 'Erreur : Login non valide';
//        }
//        if (!Validation::validate_string($mdp)) {
//            $Tmessage[] = 'Erreur : Mot de passe non valide';
//        }
//        if (!Validation::validate_annee($annee)){
//            $Tmessage[] = 'Erreur : Année non valide';
//        }
//        if (!Validation::validate_email($email)){
//            $Tmessage[] = 'Erreur : Email non valide';
//        }
//}
//
//catch (Exception $e){
//    echo $e;
//}

if(empty($Tmessage)){
    try {

        $query = 'insert into Connection values(?,?,?,?)';
        $stmt = $db->prepare($query);
        $stmt->bindValue(1, "toto", PDO::PARAM_STR);
        $stmt->bindValue(2, "toto", PDO::PARAM_STR);
        $stmt->bindValue(3, 2017, PDO::PARAM_INT);
        $stmt->bindValue(4, "toto@tot.fr", PDO::PARAM_STR);
        $stmt->execute();
    }

    catch (Exception $e){
        echo $e;
    }
}


$query2='select * from Connection ';
$stmt2 = $db->prepare($query2);
$stmt2->execute();
$results=$stmt2->fetchAll();
foreach ($results as $row)
    echo '<br>';
    print $row['Nom'];
    echo '<br>';
    print $row['Prenom'];
    echo '<br>';
    print $row['Annee'];
    echo '<br>';
    print $row['Email'];
    echo '<br>';

?>