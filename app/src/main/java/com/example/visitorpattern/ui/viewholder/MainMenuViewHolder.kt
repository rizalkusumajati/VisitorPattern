package com.example.visitorpattern.ui.viewholder

import android.view.View
import android.widget.GridLayout
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.GridLayoutManager
import com.example.visitorpattern.R
import com.example.visitorpattern.base.AbstractViewHolder
import com.example.visitorpattern.data.MainMenu
import com.example.visitorpattern.databinding.ItemMainMenuBinding
import com.example.visitorpattern.ui.MainMenuAdapter

class MainMenuViewHolder(
    view: View
) : AbstractViewHolder<MainMenu>(view) {

    private val binding = ItemMainMenuBinding.bind(view)
    private lateinit var menuAdapter : MainMenuAdapter

    override fun onBind(data: MainMenu) {
        if (!::menuAdapter.isInitialized && data.menus.isNotEmpty()){
            menuAdapter = MainMenuAdapter(data.menus)
            binding.listMainMenu.layoutManager = GridLayoutManager(itemView.context, 3)
        }
        binding.listMainMenu.adapter = menuAdapter
    }

    companion object{
       @LayoutRes const val LAYOUT = R.layout.item_main_menu
    }
}
