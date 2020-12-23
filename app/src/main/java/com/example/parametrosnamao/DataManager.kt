package com.example.parametrosnamao

import kotlinx.android.synthetic.main.driver_card_view.view.*

class DataManager (
    val titles: HashMap<String, Int> = HashMap<String, Int>(),
    val equips: HashMap<String, Int> = HashMap<String, Int>(),
    val logoWeg: Int = R.mipmap.logo_weg_foreground,
    val logoSchineider: Int = R.mipmap.logo_schinider_foreground,
    val logoSiemens: Int = R.mipmap.ic_launcher_round){

    init {
        initializeTitle()
        initializeEquips()
    }
    fun initializeTitle(){
        var title = TitleInfo("Weg", logoWeg)
        titles[title.marca] = logoWeg

        title = TitleInfo("Schineider", logoSchineider)
        titles[title.marca] = logoSchineider

        title = TitleInfo("SIEMENS", logoSiemens)
        titles[title.marca] = logoSiemens

    }

   fun initializeEquips(){
        var equip = Equipamentos("CFW100", logoWeg)
       equips[equip.name] = logoWeg

       equip = Equipamentos("CFW500", logoWeg)
       equips[equip.name] = logoWeg

       equip = Equipamentos("CFW700", logoWeg)
       equips[equip.name] = logoWeg

       equip = Equipamentos("ALTIVAR 12", logoSchineider)
       equips[equip.name] = logoSchineider

        equip = Equipamentos("ALTIVAR EASY 310", logoSchineider)
       equips[equip.name] = logoSchineider

       equip = Equipamentos("ALTIVAR MACHINE ATV320", logoSchineider)
       equips[equip.name] = logoSchineider

        equip = Equipamentos("ALTIVAR MACHINE ATV340", logoSchineider)
       equips[equip.name] = logoSchineider

       equip = Equipamentos("SINAMICS V20", logoSiemens)
       equips[equip.name] = logoSiemens

        equip = Equipamentos("INAMICS G120C", logoSiemens)
       equips[equip.name] = logoSiemens

       equip = Equipamentos("SINAMICS G120", logoSiemens)
       equips[equip.name] = logoSiemens

       equip = Equipamentos("SINAMICS G130", logoSiemens)
       equips[equip.name] = logoSiemens

       equip = Equipamentos("SINAMICS G110", logoSiemens)
       equips[equip.name] = logoSiemens

       equip = Equipamentos("SINAMICS G120D", logoSiemens)
       equips[equip.name] = logoSiemens
   }
}