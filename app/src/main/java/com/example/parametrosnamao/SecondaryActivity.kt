package com.example.parametrosnamao

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.driver_card_view.*

class SecondaryActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: DriverRecyclerAdapter
    private lateinit var viewManager: RecyclerView.LayoutManager

    override fun onCreate (saveInstanceState: Bundle?) {
        super.onCreate(saveInstanceState)
        setContentView(R.layout.activity_driver)
        intent.extras?.get("position")
        viewManager = LinearLayoutManager(this)

        viewAdapter = DriverRecyclerAdapter()

        recyclerView = findViewById<RecyclerView>(R.id.viewDriver).apply {
            setHasFixedSize(true)
            layoutManager = viewManager
            adapter = viewAdapter


        }
       /* fun ItemList(saveInstanceState: Bundle?) {
            lateinit var driver: List<String>
            var logoDriver: Int = 0
            if (position1 == 0) {
                driver = listOf("CFW100", "CFW500", "CFW700")
                logoDriver = R.mipmap.logo_weg_foreground
            } else {
                if (position1 == 1) {
                    driver = listOf(
                        "ALTIVAR 12",
                        "ALTIVAR EASY 310",
                        "ALTIVAR MACHINE ATV320",
                        "ALTIVAR MACHINE ATV340"
                    )
                    logoDriver = R.mipmap.logo_schinider_foreground
                } else {
                    if (position1 == 2) {
                        driver = listOf(
                            "SINAMICS V20",
                            "SINAMICS G120C",
                            "SINAMICS G120",
                            "SINAMICS G130",
                            "SINAMICS G110",
                            "SINAMICS G120D"
                        )
                        logoDriver = R.mipmap.ic_launcher_round

                    }
                }
            }
        }*/
    }
}
