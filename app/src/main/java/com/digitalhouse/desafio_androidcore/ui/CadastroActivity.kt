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

        //todo toolbar backbutton
        val toolbar = setSupportActionBar(cadastroToolbar)
//        toolbar.setNavigationIcon(ResourcesCompat.getDrawable(R.drawable.ic_arrow_back))
    }

    fun backLogin(){
        var intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
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