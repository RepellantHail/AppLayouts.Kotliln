package com.example.applayouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    protected var contadorMG : Int = 0 //Variable para valor Me Gusta
    protected var contadorNMG : Int = 0 //Variable para valor Me Gusta
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Recibir text de textView y cambiar el estado de la variable contador y regresarlo al txtVw en string
        val txtcuentaMG: TextView = findViewById<TextView>(R.id.txtVwMG)
        if (savedInstanceState != null)
            contadorMG = savedInstanceState.getInt("contaMG")
        txtcuentaMG.text = contadorMG.toString()

        val txtcuentaNMG: TextView = findViewById<TextView>(R.id.txtVwNMG)
        if (savedInstanceState != null)
            contadorNMG = savedInstanceState.getInt("contaNMG")
        txtcuentaNMG.text = contadorNMG.toString()
    }

    fun contarMG(view: View){
        val txtcuenta: TextView = findViewById<TextView>(R.id.txtVwMG)
        contadorMG++
        txtcuenta.text = contadorMG.toString()
    }

    fun contarNMG(view: View){
        val txtcuenta: TextView = findViewById<TextView>(R.id.txtVwNMG)
        contadorNMG++
        txtcuenta.text = contadorNMG.toString()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("contaMG",contadorMG)
        outState.putInt("contaNMG",contadorNMG)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        val txtcuentaMG: TextView = findViewById<TextView>(R.id.txtVwMG)
        val txtcuentaNMG: TextView = findViewById<TextView>(R.id.txtVwNMG)
        if (savedInstanceState != null){
            contadorMG = savedInstanceState.getInt("contaMG")
            contadorNMG = savedInstanceState.getInt("contaNMG")
        }
        txtcuentaMG.text = contadorMG.toString()
        txtcuentaNMG.text = contadorNMG.toString()
    }


}