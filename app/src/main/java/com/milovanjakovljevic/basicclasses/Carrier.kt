package com.milovanjakovljevic.basicclasses

import android.util.Log

class Carrier (name:String){
    var name:String=""
        private set

    val type="Carrier"
    private  var hullIntegrity=100
    var attacksRemaining=1
        private set

    private var attackPower=120

    private var sunk =false

    init{
        this.name="$type $name"
    }

    fun takeDamage(damageTaken:Int){
        if(!sunk){
            hullIntegrity-=damageTaken
            Log.i("$name damage taken =","$damageTaken")
            Log.i("$name hull integrity =","$hullIntegrity")

            if(hullIntegrity<=0){
                Log.d("Carrier","$name has been sunk")
                sunk=true

            }
        }else{
            Log.d("Error","Ship dosen't exist")
        }
    }

    fun launchAerialAttack():Int{
        return if(attacksRemaining>0){
            attacksRemaining--
            attackPower
        }else{
            0
        }
    }

    fun serviceSip(){
        attacksRemaining=20
        hullIntegrity=200
    }
}