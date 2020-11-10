package com.digitalhouse.desafio_androidcore.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.desafio_androidcore.R

class PratoAdapter (private val listPratos: ArrayList<Prato>, val listener: PratoAdapter.OnPratoClickListener): RecyclerView.Adapter<PratoAdapter.PratoViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PratoAdapter.PratoViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_prato, parent, false);
        return PratoViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: PratoAdapter.PratoViewHolder, position: Int) {
        var prato = listPratos.get(position)

        holder.tvNomePrato1.text = prato.nome
        holder.ivPrato1.setImageResource(prato.foto)

    }

    interface OnPratoClickListener{
        fun pratoClick(position: Int)
    }

    override fun getItemCount() = listPratos.size

    inner class PratoViewHolder(itemView: View): RecyclerView.ViewHolder(itemView), View.OnClickListener {
        val tvNomePrato1: TextView = itemView.findViewById(R.id.tvNomePrato1)
        val ivPrato1: ImageView = itemView.findViewById(R.id.ivPrato1)

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            val position = adapterPosition
            if (RecyclerView.NO_POSITION != position)
                listener.pratoClick(position)
        }
    }

}