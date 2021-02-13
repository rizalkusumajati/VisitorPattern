package com.example.visitorpattern.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.visitorpattern.R
import com.example.visitorpattern.data.Menu
import com.example.visitorpattern.databinding.ItemMenuBinding

class MainMenuAdapter constructor(
    private val items: List<Menu> = arrayListOf()
): RecyclerView.Adapter<MainMenuAdapter.MainMenuAdapterViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainMenuAdapterViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context).inflate(R.layout.item_menu, parent, false)
        return MainMenuAdapterViewHolder(layoutInflater)
    }

    override fun onBindViewHolder(holder: MainMenuAdapterViewHolder, position: Int) {
        holder.onBind(items[position])
    }

    override fun getItemCount(): Int = items.size

    inner class MainMenuAdapterViewHolder(view: View): RecyclerView.ViewHolder(view){
        private val binding = ItemMenuBinding.bind(view)
        fun onBind(menu: Menu){
            binding.txtMenu.text = menu.title
        }
    }
}
