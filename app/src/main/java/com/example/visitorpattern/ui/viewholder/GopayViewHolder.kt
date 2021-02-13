package com.example.visitorpattern.ui.viewholder

import android.view.View
import android.widget.TextView
import androidx.annotation.LayoutRes
import com.example.visitorpattern.R
import com.example.visitorpattern.base.AbstractViewHolder
import com.example.visitorpattern.data.Gopay
import com.example.visitorpattern.databinding.ItemGopayBinding

class GopayViewHolder(view: View): AbstractViewHolder<Gopay>(view) {
//    private val txtAmount: TextView = view.findViewById(R.id.txt_amount)
    private val binding = ItemGopayBinding.bind(view)

    override fun onBind(data: Gopay) {
        binding.txtAmount.text = "Rp. ${data.amount}"
    }

    companion object{
        @LayoutRes const val LAYOUT = R.layout.item_gopay
    }
}
