package com.example.visitorpattern.ui.viewholder

import android.view.View
import androidx.annotation.LayoutRes
import com.example.visitorpattern.R
import com.example.visitorpattern.base.AbstractViewHolder
import com.example.visitorpattern.data.Banner
import com.example.visitorpattern.databinding.ItemBannerBinding

class BannerViewHolder(
    view: View,
    private val onCLick : (Banner) -> Unit
): AbstractViewHolder<Banner>(view) {
    private val binding = ItemBannerBinding.bind(view)
    override fun onBind(data: Banner) {
       itemView.setOnClickListener {
           onCLick(data)
       }
    }

    companion object{
        @LayoutRes const val LAYOUT = R.layout.item_banner
    }
}
