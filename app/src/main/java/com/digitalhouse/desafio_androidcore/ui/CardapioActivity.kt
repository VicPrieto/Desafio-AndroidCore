package com.digitalhouse.desafio_androidcore.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.digitalhouse.desafio_androidcore.R
import kotlinx.android.synthetic.main.activity_cadastro.*
import kotlinx.android.synthetic.main.activity_cardapio.*
import kotlinx.android.synthetic.main.activity_main.*

class CardapioActivity : AppCompatActivity(), PratoAdapter.OnPratoClickListener {
    var listaPratos = getPratos()
    var adapter = PratoAdapter(listaPratos, this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cardapio)

        val extras = intent.extras
        var foto = extras?.getInt("imagem")
        var nome = extras?.getString("nome")

        tvNomeRestaurante.text = nome
        if (foto != null) {
            ivRestaurante.setImageResource(foto)
        }

        rvPratos.adapter = adapter
        rvPratos.layoutManager = GridLayoutManager(this, 2)
        rvPratos.setHasFixedSize(true)

        val toolbar = setSupportActionBar(cardapioToolbar)
        getSupportActionBar()?.setDisplayShowTitleEnabled(false)
    }

    fun getPratos(): ArrayList<Prato> {
        val prato1 = Prato("Salada com Molho de Gengibre", R.drawable.image4)
        val prato2 = Prato("Sopa de Picles", R.drawable.image2)
        val prato3 = Prato("Ovo e Waffle", R.drawable.image3)
        val prato4 = Prato("Torrada com Ovo", R.drawable.image5)
        val prato5 = Prato("Camarão Assado na Pedra", R.drawable.image1)
        val prato6 = Prato("Sorvete com Calda de Pesto", R.drawable.image4)

        return arrayListOf(prato1, prato2, prato3, prato4, prato5, prato6)
    }

    override fun pratoClick(position: Int) {
        var intent = Intent(this, DetalheCardapioActivity::class.java)
        var prato: Prato = listaPratos.get(position)

        intent.putExtra("imagem", prato.foto)
        intent.putExtra("nome", prato.nome)

        startActivity(intent)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}