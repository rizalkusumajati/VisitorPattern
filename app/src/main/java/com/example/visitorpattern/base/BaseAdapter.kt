package com.example.visitorpattern.base

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.visitorpattern.ui.visitors.VisitorElement

class BaseAdapter constructor(
    /* as viewType identifier */
    private val viewTypeElement: VisitorElement,
    /* the items data */
    private val items: ArrayList<VisitorUIModel> = arrayListOf(),
) : RecyclerView.Adapter<AbstractViewHolder<VisitorUIModel>>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AbstractViewHolder<VisitorUIModel> {
       val layoutView = LayoutInflater.from(parent.context).inflate(viewType, parent, false)
        return viewTypeElement.createViewHolder(layoutView, viewType) as AbstractViewHolder<VisitorUIModel>
    }

    override fun onBindViewHolder(holder: AbstractViewHolder<VisitorUIModel>, position: Int) {
        holder.onBind(items[position])
    }

    override fun getItemViewType(position: Int): Int {
        return items[position].type(viewTypeElement)
    }

    override fun getItemCount(): Int = items.size

    fun addItem(item: VisitorUIModel){
        this.items.add(item)
        notifyDataSetChanged()
    }

    fun addItems(item: List<VisitorUIModel>){
        this.items.addAll(item)
        notifyDataSetChanged()
    }
}
