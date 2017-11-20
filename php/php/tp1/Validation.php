<?php

/**
 * Created by PhpStorm.
 * User: tosanchez
 * Date: 18/11/17
 * Time: 09:07
 */
class Validation
{
    static function validate_string($nom)
    {
        if (isset($nom)) {
            return filter_var($nom, FILTER_SANITIZE_STRING);
        }
    }

    static function validate_annee($annee)
    {
        if (isset($annee)) {
            return filter_var($annee, FILTER_VALIDATE_INT);
        }
    }

    static function validate_email($email)
    {
        if (isset($email)) {
            return filter_var($email, FILTER_VALIDATE_EMAIL);
        }
    }
}
