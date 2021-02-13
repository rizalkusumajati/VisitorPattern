package com.example.visitorpattern.ui.visitors

import android.view.View
import com.example.visitorpattern.base.AbstractViewHolder
import com.example.visitorpattern.data.Banner
import com.example.visitorpattern.data.Gopay
import com.example.visitorpattern.data.MainMenu
import com.example.visitorpattern.ui.MainMenuAdapter
import com.example.visitorpattern.ui.viewholder.BannerViewHolder
import com.example.visitorpattern.ui.viewholder.GopayViewHolder
import com.example.visitorpattern.ui.viewholder.MainMenuViewHolder

class VisitorElementFactory(val onClick : (Banner) -> Unit): VisitorElement {
    override fun visit(gopay: Gopay): Int {
        return GopayViewHolder.LAYOUT
    }

    override fun visit(mainMenu: MainMenu): Int {
        //TODO
        return MainMenuViewHolder.LAYOUT
    }

    override fun visit(banner: Banner): Int {
        return BannerViewHolder.LAYOUT
    }

    override fun createViewHolder(parent: View, type: Int): AbstractViewHolder<*> {
        return when(type){
            GopayViewHolder.LAYOUT -> GopayViewHolder(parent)
            BannerViewHolder.LAYOUT -> BannerViewHolder(parent, onClick)
            MainMenuViewHolder.LAYOUT -> MainMenuViewHolder(parent)
            else -> createViewHolder(parent, type)
        }
    }
}
