<?php
    include_once("conexao.php");
    $nome = $_POST['name'];
    $endereco = $_POST['address'];
    $email = $_POST['email'];
    $cpf = $_POST['cpf'];
    $rg = $_POST['rg'];
    $data = $_POST['date'];
    $telefone = $_POST['telephone'];
    $senha = $_POST['password'];
    $sql = "insert into usuario (Nome,Endereco,Email,RG,CPF,Data_de_nascimento,Telefone,Senha) values ('$nome','$endereco','$email','$cpf','$rg','$data','$telefone','$senha')";
    $salvar = mysqli_query($conexao,$sql);
    mysqli_close($conexao);
?>