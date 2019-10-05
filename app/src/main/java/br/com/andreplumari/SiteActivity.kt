package br.com.andreplumari

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_site.*

class SiteActivity : AppCompatActivity() {

    private lateinit var mAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_site)

        mAuth = FirebaseAuth.getInstance()

        webView.loadUrl("https://www2.fiap.com.br")

        btSair.setOnClickListener {
            mAuth.signOut()
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}
