package com.example.christian.appanimation

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.coroutines.experimental.Job


class FragmentHome : Fragment() {

    companion object {
        fun newInstance(key: String): FragmentHome {

            Log.d("Mensajes", "En el fragment Home recibo: ${key}")

            var fragmentHome = FragmentHome()
            var args = Bundle()
            args.putString("key",key)

            fragmentHome.arguments = args
            return fragmentHome
        }
    }


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater!!.inflate(R.layout.fragment_home, container, false)
    }

    var jobHome: Job? = null

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        textView.setText(arguments.getString("key"))
        var cont: Int = 100

        imageView.setOnClickListener(){
            cont = cont - 1
            progressBar2.setProgress(cont)
        }

        /*

         // Definimos una tarea en este fragment
         jobHome = launch(UI) { // launch coroutine in UI context
             for (i in 10 downTo 1) { // countdown from 10 to 1
                 textArg.text = "Countdown $i ..." // update text
                 delay(500) // wait half a second
             }
             textArg.text = "Done!"
             // Cuando acaba la tarea usamos la clase Mensaje para enviar un log
             Mensajes.say("Desde Launch del Fragment Home")
         }
         jobHome?.start()
         Mensajes.say("Desde Fragment Home")
         textArg.setText(arguments.getString("key"))
         */
    }


    override fun onDestroyView() {
        super.onDestroyView()
        jobHome?.cancel()
    }


}
