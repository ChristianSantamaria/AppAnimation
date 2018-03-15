package com.example.christian.appanimation

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.christian.appanimation.Main2Activity.Companion.darCont
import kotlinx.android.synthetic.main.fragment_dashboard.*


class FragmentDashboard : Fragment() {

    companion object {
        fun newInstance(key: String): FragmentDashboard {

            var fragmentDas = FragmentDashboard()
            var args = Bundle()
            args.putString("key",key)


            fragmentDas.arguments = args
            return fragmentDas
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater!!.inflate(R.layout.fragment_dashboard, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var contador : Int = 0
        contador = darCont()
        contadorMonstruos.setText("${contador}")
    }

}
