<?php
    include_once("conexao.php");
    $nome = $_POST['name'];
    $preco = $_POST['price'];
    $foto = $_POST['image'];
    $estoque = $_POST['stock'];
    $comprimento = $_POST['length'];
    $largura = $_POST['width'];
    $altura = $_POST['height'];
    $peso = $_POST['weight'];
    $descricao = $_POST['description'];
    $sql = "insert into produto (Nome,Preco,Foto,Estoque,Comprimento,Largura,Altura,Peso,Descricao) values ('$nome','$preco','$foto','$estoque','$comprimento','$largura','$altura','$peso','$descricao')";
    $salvar = mysqli_query($conexao,$sql);
    mysqli_close($conexao);
?>