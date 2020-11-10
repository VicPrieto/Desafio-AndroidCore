package com.digitalhouse.desafio_androidcore.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.digitalhouse.desafio_androidcore.R
import kotlinx.android.synthetic.main.activity_cardapio.*
import kotlinx.android.synthetic.main.activity_main.*

class CardapioActivity : AppCompatActivity(), PratoAdapter.OnPratoClickListener {
    var listaPratos = getPratos()
    var adapter = PratoAdapter(listaPratos, this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cardapio)

        rvPratos.adapter = adapter
        rvPratos.layoutManager = LinearLayoutManager(this)
        rvPratos.setHasFixedSize(true)
    }

    fun getPratos(): ArrayList<Prato>{
        val prato1 = Prato("Salado com Molho de Gengibre", R.drawable.image4)
        val prato2 = Prato("Salada com Molho Funghi", R.drawable.image2)

        return arrayListOf(prato1, prato2)
    }

    override fun pratoClick(position: Int) {
        var intent = Intent(this, DetalheCardapioActivity::class.java)
        startActivity(intent)
    }
}