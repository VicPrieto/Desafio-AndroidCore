package com.digitalhouse.desafio_androidcore.ui

class Restaurante(var nome: String, var endereco: String, var horario: String, var foto: Int) {
    override fun toString(): String {
        return "Restaurante(nome='$nome', endereco='$endereco', horario='$horario', foto=$foto)"
    }
}