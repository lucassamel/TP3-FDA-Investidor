package lucassamel.br.tp3_fda_investidor.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import lucassamel.br.tp3_fda_investidor.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnIniciar.setOnClickListener {

            //Recebe o valor da variavel da tela
            var nomeUsuario = edtTxtNome.text.toString()
            var alterHomeActivit = Intent(
                this,
                PerguntasActivity::class.java
            )
            //Envia a informacao
            alterHomeActivit.putExtra("usuarioNome",nomeUsuario)

            println(nomeUsuario.toString())

            startActivity(alterHomeActivit)
        }
    }
}