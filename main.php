<?php
/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
    $hostname = "localhost";
    $user = "root";
    $password = "";
    $database = "cadastro_usuario";
    $conexao = mysqli_connect($hostname,$user,$password,$database);
    
    if(!$conexao){
        print "Falha na conexão com o banco de dados";
    }
?>
