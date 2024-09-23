package com.example.firstproject

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtNom: EditText = findViewById(R.id.TxtNom)
        val btnOk: Button = findViewById(R.id.BtnOk)
        val lblNom: TextView = findViewById(R.id.LblNom)
        val rdMetro: RadioButton = findViewById(R.id.metro)
        val rdPatinet: RadioButton = findViewById(R.id.patinet)
        val rdMoto: RadioButton = findViewById(R.id.moto)


        btnOk.setOnLongClickListener{
            var text = txtNom.text.toString()
            if(!text.equals("")) {
                txtNom.setBackgroundColor(Color.WHITE)
                lblNom.text = "Hola " + text + "!"
            } else {
                lblNom.text = ""
                txtNom.setBackgroundColor(Color.RED)
                Toast.makeText(this, "No han introduit el teu nom", Toast.LENGTH_LONG).show()
            }
            true
        }

        rdMetro.setOnClickListener{
            val nom = rdMetro.text.toString()
            Toast.makeText(this, "Et desplaçes en " + nom, Toast.LENGTH_LONG).show()
        }
        rdPatinet.setOnClickListener{
            val nom = rdPatinet.text.toString()
            Toast.makeText(this, "Et desplaçes en " + nom, Toast.LENGTH_LONG).show()

        }
        rdMoto.setOnClickListener{
            val nom = rdMoto.text.toString()
            Toast.makeText(this, "Et desplaçes en " + nom, Toast.LENGTH_LONG).show()

        }



    }
}