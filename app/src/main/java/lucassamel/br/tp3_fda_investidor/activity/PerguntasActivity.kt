package lucassamel.br.tp3_fda_investidor.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_perguntas.*
import lucassamel.br.tp3_fda_investidor.R

class PerguntasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perguntas)

        var usuarioNome = intent.getStringExtra("usuarioNome")

        var pontuacao = 0

        txtNomeUsuario.text = usuarioNome
    }



}