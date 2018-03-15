package com.example.christian.appanimation

import android.animation.ObjectAnimator
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.christian.appanimation.Main2Activity.Companion.cambiarCont
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.coroutines.experimental.Job
import kotlinx.coroutines.experimental.android.UI
import kotlinx.coroutines.experimental.launch
import java.util.*


class FragmentHome : Fragment() {

    companion object {
        fun newInstance(key: String): FragmentHome {

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
    var contador: Int = 10
    var monstruos: Int = Main2Activity.darCont()

    var random = Random()
    fun rand(from: Int, to: Int) : Int {
        return random.nextInt(to - from) + from
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        monster.setOnClickListener(){
            contador --
            barravida.setProgress(contador)
            contvida.setText("${contador} / 100")

            if (contador == 0) {
                contador = 100
                barravida.setProgress(contador)
                monstruos = monstruos + 1
                cambiarCont(monstruos)
            }
            var n = rand(0, 2)
            if (n == 0){
                animarHorizontal()
            }else{
                animarVertical()
            }
        }
    }

    var j : Int = 1

    private fun animarHorizontal() = launch(UI) {
        if (j == 1)
            j *= -1
        else
            j = 1
        val objectAnimator = ObjectAnimator.ofFloat(
                monster,
                "translationX",
                300f * j)
        objectAnimator.duration = 100L
        objectAnimator.interpolator
        objectAnimator.start()
    }

    private fun animarVertical() = launch(UI) {
        if (j == 1)
            j *= -1
        else
            j = 1

        val objectAnimator = ObjectAnimator.ofFloat(
                monster,
                "translationY",
                300f * j)
        objectAnimator.duration = 100L
        objectAnimator.interpolator
        objectAnimator.start()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        jobHome?.cancel()
    }


}
