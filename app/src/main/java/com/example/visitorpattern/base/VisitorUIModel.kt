package com.example.visitorpattern.base

import com.example.visitorpattern.ui.visitors.VisitorElement

abstract class VisitorUIModel {
    abstract fun type(type: VisitorElement) : Int
}
