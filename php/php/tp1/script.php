

<?php
/**
 * Created by PhpStorm.
 * User: tosanchez
 * Date: 15/11/17
 * Time: 17:53
 */

$num=1;
$nom='Tom';
$groupe=1;
$date=date("d-m-Y");
echo '<p> Aujourd\'hui: '.$date. ' nous travaillons sur le TP numéro ' .$num.' réalisé par '.$nom.' du groupe '.$groupe. '<p>';
echo '-----------------------------------<br>';



function pourcentageAvis(array $typeAvis, int $nbAvisFav, int $nbAvisDefav ) : void {
        if ($nbAvisDefav+$nbAvisFav==0){
            throw new DivisionByZeroError("attention calcul du pourcentage impossible - division par zéro");
        }
        if ($typeAvis[0] == 'favorable') {
            $result = ($nbAvisFav / ($nbAvisDefav + $nbAvisFav)) * 100;
        } else {
            $result = ($nbAvisDefav / ($nbAvisDefav + $nbAvisFav)) * 100;
        }
        echo 'le pourcentage d\'avis de type ' . $typeAvis[0] . ' est de : ' . $result . ' %.';

}

$TMessage=[];
$avis = array ("favorable");
$x = 0;
$y = 0;
try {
    pourcentageAvis($avis, $y, $x);
}
catch(Error $exception ){
    $TMessage= [$exception->getMessage()];
    require 'erreur.php';
    echo '<br>-----------------------------------<br>';
}






?>