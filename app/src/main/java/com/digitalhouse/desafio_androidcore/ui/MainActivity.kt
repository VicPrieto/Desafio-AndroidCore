package com.digitalhouse.desafio_androidcore.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.digitalhouse.desafio_androidcore.R
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), RestauranteAdapter.OnRestauranteClickListener  {
    var listaRestaurantes = getRestaurantes()
    var adapter = RestauranteAdapter(listaRestaurantes, this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvRestaurantes.adapter = adapter
        rvRestaurantes.layoutManager = LinearLayoutManager(this)
        rvRestaurantes.setHasFixedSize(true)
    }

    fun getRestaurantes(): ArrayList<Restaurante> {
        val rest1 = Restaurante("Tony Roma's", "Av. Lavandisca, 717 - Indianópolis, São Paulo", "Fecha às 22:00", R.drawable.image1)
        val rest2 = Restaurante("Aoyama - Moema", "Alameda dos Arapanés, 532 - Moema", "Fecha às 00:00", R.drawable.image4)
        val rest3 = Restaurante("Outback - Moema", "Av. Moaci, 187, 187 - Moema, São Paulo", "Fecha às 00:00", R.drawable.image2)
        val rest4 = Restaurante("Sí Señor!", "Alameda Jauaperi, 626 - Moema", "Fecha às 01:00", R.drawable.image3)

        return arrayListOf(rest1, rest2, rest3, rest4)
    }

    override fun restauranteClick(position: Int) {
        var intent = Intent(this, CardapioActivity::class.java)
        var restaurante: Restaurante = listaRestaurantes.get(position)

        intent.putExtra("imagem", restaurante.foto)
        intent.putExtra("nome", restaurante.nome)

        startActivity(intent)
    }
}