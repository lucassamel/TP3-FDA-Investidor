package lucassamel.br.tp3_fda_investidor.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_pergunta3.*
import kotlinx.android.synthetic.main.fragment_pergunta9.*
import lucassamel.br.tp3_fda_investidor.R

class Pergunta9Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pergunta9, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonPerfil.setOnClickListener {
            findNavController().navigate(R.id.action_pergunta9Fragment_to_perfilActivity)
        }
    }
}