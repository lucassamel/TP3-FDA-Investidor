package lucassamel.br.tp3_fda_investidor.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_perfil.*
import kotlinx.android.synthetic.main.activity_perguntas.*
import lucassamel.br.tp3_fda_investidor.R

class PerfilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil)

        var usuarioNome = intent.getStringExtra("usuarioNome")

        var pontuacao = 0

        textViewNomeUsuario.text = usuarioNome
    }
}