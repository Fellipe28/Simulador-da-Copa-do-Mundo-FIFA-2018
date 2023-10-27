<?php
    $hostname = "localhost";
    $user = "root";
    $password = "Mysql28fyms1.";
    $database = "cadastro_usuario";
    $conexao = mysqli_connect($hostname,$user,$password,$database);
    
    if(!$conexao){
        print "Falha na conexão com o banco de dados";
    }
?>