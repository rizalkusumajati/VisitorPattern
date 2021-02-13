package com.example.visitorpattern.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.visitorpattern.base.BaseAdapter
import com.example.visitorpattern.data.Banner
import com.example.visitorpattern.data.Gopay
import com.example.visitorpattern.data.MainMenu
import com.example.visitorpattern.data.Menu
import com.example.visitorpattern.databinding.ActivityMainBinding
import com.example.visitorpattern.ui.visitors.VisitorElementFactory

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null
    private val _adapter by lazy { BaseAdapter(VisitorElementFactory(
        onClick = ::onBannerClicked
    )) }

    private fun onBannerClicked(banner: Banner){
        Toast.makeText(baseContext, "Hello", Toast.LENGTH_SHORT).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        //init
        initReyclerView()
        initView()
    }

    private fun initReyclerView() {
        binding?.listGojek?.let {
            it.layoutManager = LinearLayoutManager(this)
            it.adapter = _adapter
        }

    }

    private fun initView(){
        val gopay = Gopay(1000000)
        val banner = Banner("")

        val menus = MainMenu(listOf(
            Menu(0, "Send"),
            Menu(0, "Receive"),
            Menu(0, "Receive"),
            Menu(0, "Receive"),
            Menu(0, "Receive"),
            Menu(0, "Receive"),
            Menu(0, "Receive"),
            Menu(0, "Receive"),
            Menu(0, "Receive"),
            Menu(0, "Receive"),
            Menu(0, "Receive"),
            Menu(0, "Receive"),
            Menu(0, "Receive"),
            Menu(0, "History")
        ))

        _adapter.addItems(listOf(gopay, menus, banner))
    }
}
