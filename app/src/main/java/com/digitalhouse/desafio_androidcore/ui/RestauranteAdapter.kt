package com.digitalhouse.desafio_androidcore.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.desafio_androidcore.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_restaurante.view.*

class RestauranteAdapter(private val listRestaurantes: ArrayList<Restaurante>, val listener: OnRestauranteClickListener): RecyclerView.Adapter<RestauranteAdapter.RestauranteViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RestauranteAdapter.RestauranteViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_restaurante, parent, false);
        return RestauranteViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: RestauranteAdapter.RestauranteViewHolder, position: Int) {
        var restaurante = listRestaurantes.get(position)
//        Picasso.get().load(listRestaurantes[position].foto).into(holder.ivRestaurante)

        holder.tvNome.text = restaurante.nome
        holder.tvEndereco.text = restaurante.endereco
        holder.tvHorario.text = restaurante.horario
        holder.ivRestaurante.setImageResource(restaurante.foto)
    }

    interface OnRestauranteClickListener{
        fun restauranteClick(position: Int)
    }

    override fun getItemCount() = listRestaurantes.size

    inner class RestauranteViewHolder(itemView: View): RecyclerView.ViewHolder(itemView), View.OnClickListener {
        val tvNome: TextView = itemView.findViewById(R.id.tvNome)
        val tvEndereco: TextView = itemView.findViewById(R.id.tvEndereco)
        val tvHorario: TextView = itemView.findViewById(R.id.tvHorario)
        val ivRestaurante: ImageView = itemView.findViewById(R.id.ivRestaurante)

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            val position = adapterPosition
            if (RecyclerView.NO_POSITION != position)
                listener.restauranteClick(position)
        }
    }
}
