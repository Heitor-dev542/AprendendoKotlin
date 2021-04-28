package com.example.replicaviewitauapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvList: RecyclerView
    private val adapter = MenuItemAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        iniciaViews()
        setItensList()

    }


    private fun iniciaViews(){
        rvList = findViewById(R.id.recy_list)
        rvList.adapter = adapter
        rvList.layoutManager = GridLayoutManager(this, 2)
    }

    private fun setItensList(){
        adapter.setItensList(
                arrayListOf(
                        MenuItemModel(
                                "cartões"
                        ),
                        MenuItemModel(
                                "fazer transferencia"
                        ),
                        MenuItemModel(
                                "recarregar celular"
                        ),
                        MenuItemModel(
                                "DDA - boleto eletrônico"
                        ),
                        MenuItemModel(
                                "pagamentos automáticos"
                        ),
                        MenuItemModel(
                                "meus comprovantes"
                        ),
                        MenuItemModel(
                                "investimentos"
                        ),
                        MenuItemModel(
                                "portabilidade de salário"
                        )
                )
        )
    }
}