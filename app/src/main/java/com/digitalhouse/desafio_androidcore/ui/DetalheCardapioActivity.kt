package com.digitalhouse.desafio_androidcore.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.digitalhouse.desafio_androidcore.R
import kotlinx.android.synthetic.main.activity_cadastro.*
import kotlinx.android.synthetic.main.activity_cadastro.cadastroToolbar
import kotlinx.android.synthetic.main.activity_detalhe_cardapio.*

class DetalheCardapioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhe_cardapio)

        val toolbar = setSupportActionBar(detalheToolbar)
        getSupportActionBar()?.setDisplayShowTitleEnabled(false)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}