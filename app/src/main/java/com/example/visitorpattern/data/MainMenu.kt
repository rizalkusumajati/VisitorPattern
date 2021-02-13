package com.example.visitorpattern.data

import com.example.visitorpattern.base.VisitorUIModel
import com.example.visitorpattern.ui.visitors.VisitorElement

data class Menu(
    val icon: Int,
    val title: String
)
class MainMenu (
    val menus: List<Menu>
): VisitorUIModel(){
    override fun type(type: VisitorElement): Int {
        return type.visit(this)
    }
}
