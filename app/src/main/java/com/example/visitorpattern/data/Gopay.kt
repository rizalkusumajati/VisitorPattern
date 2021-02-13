package com.example.visitorpattern.data

import com.example.visitorpattern.base.VisitorUIModel
import com.example.visitorpattern.ui.visitors.VisitorElement

data class Gopay(
    val amount: Int
) : VisitorUIModel(){
    override fun type(type: VisitorElement): Int {
        return type.visit(this)
    }
}
