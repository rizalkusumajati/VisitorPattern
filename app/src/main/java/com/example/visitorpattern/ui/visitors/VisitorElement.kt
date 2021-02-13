package com.example.visitorpattern.ui.visitors

import android.view.View
import com.example.visitorpattern.base.AbstractViewHolder
import com.example.visitorpattern.data.Banner
import com.example.visitorpattern.data.Gopay
import com.example.visitorpattern.data.MainMenu

interface VisitorElement {
    fun visit(gopay: Gopay): Int
    fun visit(mainMenu: MainMenu): Int
    fun visit(banner: Banner): Int

    //factory
    fun createViewHolder(parent: View, type: Int): AbstractViewHolder<*>
}
