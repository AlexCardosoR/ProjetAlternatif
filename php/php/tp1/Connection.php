<?php

/**
 * Created by PhpStorm.
 * User: tosanchez
 * Date: 18/11/17
 * Time: 09:49
 */
class Connection extends PDO
{
    private $stmt;

    public function__construct($dsn,$username,$password){
    parent::__construct($dsn,$username,$password);
    $this->setAttribute(PDO::A);
}






}