package com.example.italian_englishgames.memory

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.italian_englishgames.R

class GridAdapter(var context: Context, val dataSet: MutableList<MemCard>, val listener
    : OnItemClickListener) : RecyclerView.Adapter<GridAdapter.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.grid_element, viewGroup, false)

        return ViewHolder(view)
    }


    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        var word = dataSet[position].word
        viewHolder.card.setBackgroundColor(Color.parseColor("#fdd835"))
        viewHolder.front.text = word
        viewHolder.front.visibility = View.INVISIBLE
    }

    override fun getItemCount() = dataSet.size

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view),
        View.OnClickListener {
        var front: TextView = view.findViewById<TextView>(R.id.card_front)
        var card: CardView = view.findViewById<CardView>(R.id.cardView)
        override fun onClick(v: View?) {
            val position = adapterPosition
            if (position != RecyclerView.NO_POSITION) {
                listener.onItemClick(position)
            }
        }

        init {
            view.setOnClickListener(this)
        }
    }

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }
}

