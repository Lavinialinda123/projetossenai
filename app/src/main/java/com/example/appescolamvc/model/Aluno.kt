package com.example.appescolamvc.model

data class Aluno(
    val id: Int,
    val nome: String,
    val cpf: String,
    var email: String,
    val matricula: String
)
