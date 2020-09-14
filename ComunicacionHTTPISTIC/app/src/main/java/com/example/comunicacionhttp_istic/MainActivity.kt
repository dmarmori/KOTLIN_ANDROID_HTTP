package com.example.comunicacionhttp_istic

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.StrictMode
import android.util.Log
import android.widget.Button
import android.widget.Toast
import org.json.JSONArray
import org.json.JSONObject
import java.io.IOException
import java.io.InputStream
import java.net.HttpURLConnection
import java.net.URL

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        val btnVerificar=findViewById<Button>(  R.id.btnVerificar)
        val btnConsultaSimple=findViewById<Button>(  R.id.btnConsultaSimple)
        val btnIrListado=findViewById<Button>(  R.id.btnIrListado)
        btnIrListado.setOnClickListener{
            val intento1 = Intent(this, ListadoPaises::class.java)
            startActivity(intento1)
        }



        btnVerificar.setOnClickListener{
            if (ControlDeConexion.hayConexion(this))
            {
                Toast.makeText(this,"Estamos conectados",Toast.LENGTH_SHORT).show()

            }else
            {
                Toast.makeText(this,"Sin Conexión",Toast.LENGTH_SHORT).show()
            }
        }
        btnConsultaSimple.setOnClickListener{

        }

    }
/*
* TESTIN API REST
* https://www.mockaroo.com/ GENERAR DATOS
* https://mocki.io/fake-json-api API REST FAKE
* https://api.mocki.io/v1/0b4979ea
* */
    override fun onStart() {
        super.onStart()
        if (ControlDeConexion.hayConexion(this))
        {
            Toast.makeText(this,"Estamos conectados",Toast.LENGTH_SHORT).show()

        }else
        {
            Toast.makeText(this,"Sin Conexión",Toast.LENGTH_SHORT).show()
        }
    }

}
