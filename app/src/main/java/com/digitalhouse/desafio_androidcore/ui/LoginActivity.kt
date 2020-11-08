package com.digitalhouse.desafio_androidcore.ui

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

//        btnLogin.setOnClickListener {
//            navController.navigate(R.id.action_loginActivity_to_mainActivity)
//        }
//
//        btnRegister.setOnClickListener {
//            navController.navigate(R.id.action_loginActivity_to_cadastroActivity)
//        }
    }
}