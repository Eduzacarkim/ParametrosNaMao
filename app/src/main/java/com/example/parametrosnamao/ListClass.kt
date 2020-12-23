package com.example.parametrosnamao

 data class TitleInfo (val marca: String, val image: Int) {
     override fun toString(): String {
         return marca
     }
 }

data class Equipamentos (val name: String, val image1: Int){
    override fun toString(): String {
        return name
    }
}


/*
val Weg = Titles("Weg", R.mipmap.logo_weg_foreground)
val Schineider = Titles("Schineider Eletric", R.mipmap.logo_schinider_foreground)
val Siemens = Titles("SIEMENS", R.mipmap.logo_schinider_foreground)



val cfw100 = EquipamentsWeg("CFW100", R.mipmap.logo_weg_foreground)
val cfw500 = EquipamentsWeg("CFW500", R.mipmap.logo_weg_foreground)
val cfw700 = EquipamentsWeg("CFW700", R.mipmap.logo_weg_foreground)

data class EquipamentsSchineider (val nameSchineider: String, val imageSchineider: Int)

val altivar12 = EquipamentsSchineider("ALTIVAR 12", R.mipmap.logo_schinider_foreground)
val altivarEasy310 = EquipamentsSchineider("ALTIVAR EASY 310", R.mipmap.logo_schinider_foreground)
val altivarMachineATV320 = EquipamentsSchineider("ALTIVAR MACHINE ATV320", R.mipmap.logo_schinider_foreground)
val altivarMachineATV340 = EquipamentsSchineider("ALTIVAR MACHINE ATV340", R.mipmap.logo_schinider_foreground)

data class EquipamentsSiemens (val nameSiemens: String, val imageSiemens: Int)

val sinamicsV20 = EquipamentsSiemens("SINAMICS V20", R.mipmap.logo_schinider_foreground)
val sinamicsG120C = EquipamentsSiemens("SINAMICS G120C", R.mipmap.logo_schinider_foreground)
val sinamicsG120 = EquipamentsSiemens("SINAMICS G120", R.mipmap.logo_schinider_foreground)
val sinamicsG130 = EquipamentsSiemens("SINAMICS G130", R.mipmap.logo_schinider_foreground)
val sinamicsG110 = EquipamentsSiemens("SINAMICS G110", R.mipmap.logo_schinider_foreground)
val sinamicsG120D = EquipamentsSiemens("SINAMICS G120D", R.mipmap.logo_schinider_foreground)

*/
