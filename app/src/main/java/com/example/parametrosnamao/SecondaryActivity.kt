package com.example.parametrosnamao

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlin.properties.Delegates

class SecondaryActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager
    lateinit var driver: List<String>
    var logoDriver by Delegates.notNull<Int>()
    override fun onCreate(saveInstanceState: Bundle?) {
        super.onCreate(saveInstanceState)

        setContentView(R.layout.activity_driver)

        viewManager = LinearLayoutManager(this)


//        view_driver.adapter = viewAdapter
//        view_driver.layoutManager = LinearLayoutManager()
//        view_driver.setHasFixedSize(true)

        viewAdapter = DriverRecyclerAdapter(ItemList())

        recyclerView = findViewById<RecyclerView>(R.id.view_driver).apply {
//            setHasFixedSize(true)
            layoutManager = viewManager
            adapter = viewAdapter

        }

    }

    internal fun ItemList(): Array<Any> {
        val position1 = intent.getSerializableExtra("key") as Int
        if (position1 == 0) {
            driver = listOf(
                "CFW100",
                "CFW500",
                "CFW700"
            )
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
        driver
        logoDriver
        return arrayOf(listOf(driver), logoDriver)
    }
}





