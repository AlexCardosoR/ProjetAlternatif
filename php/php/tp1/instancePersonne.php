<?php
/**
 * Created by PhpStorm.
 * User: tosanchez
 * Date: 15/11/17
 * Time: 19:21
 */

class Personne
{
    public $nom;
    public $prenom;
    public $annee;
    public $email;

    public function __construct(string $nom,string $prenom,string $annee='2000',string $email='aucune'){
    $this->nom=$nom;
    $this->prenom=$prenom;
    $this->annee=$annee;
    $this->email=$email;
    }

    public function __toString():string
    {
    return  $this->nom.' <br> '.$this->prenom.' <br> '.$this->annee.' <br> '.$this->email;
    }

}

$tabPersonne= array(
[0] => new Personne('Dupond','Jean-Eudes');
[1] => new Personne('Dupond','Jean-Eudes');
[2] => new Personne('Dupond','Jean-Eudes');
)
require ('vuedesPersonne.php');