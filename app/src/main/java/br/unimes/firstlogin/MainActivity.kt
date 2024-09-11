package br.unimes.firstlogin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val edttLogin = findViewById<EditText>(R.id.edttLogin)
        val edttSenha = findViewById<EditText>(R.id.edttSenha)
        val btnEntra = findViewById<Button>(R.id.btnEntra)

        btnEntra.setOnClickListener{
            val login = edttLogin.text.toString()
            val senha = edttSenha.text.toString()

            if(login == "admin" && senha == "123")
            {
               val intent = Intent (this, LoginActivity::class.java)
                intent.putExtra("Usuario", login)
                startActivity(intent)
            }else
            {
                Toast.makeText(this, "Login incorreto", Toast.LENGTH_SHORT).show()

            }
    }
    }
}