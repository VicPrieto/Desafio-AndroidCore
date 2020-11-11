package com.digitalhouse.desafio_androidcore.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.res.ResourcesCompat
import com.digitalhouse.desafio_androidcore.R
import kotlinx.android.synthetic.main.activity_cadastro.*

class CadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        btnRegister2.setOnClickListener {
            callMain()
        }

        val toolbar = setSupportActionBar(cadastroToolbar)
    }

    fun callMain(){
        var intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}