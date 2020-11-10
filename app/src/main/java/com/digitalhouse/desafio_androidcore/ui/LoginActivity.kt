package com.digitalhouse.desafio_androidcore.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.digitalhouse.desafio_androidcore.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
//    private var navController: NavController = findNavController(R.id.navHostfragment)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLogin.setOnClickListener {
            callMain()
        }

        btnRegister.setOnClickListener {
            callCadastro()
        }
    }

    fun callCadastro(){
        var intent = Intent(this, CadastroActivity::class.java)
        startActivity(intent)
    }

    fun callMain(){
        var intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

}