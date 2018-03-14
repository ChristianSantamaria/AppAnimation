package com.example.christian.appanimation

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_home.*

class FragmentDashboard : Fragment() {

    companion object {
        fun newInstance(key: String): FragmentDashboard {
            var fragmentDashboard = FragmentDashboard()
            var args = Bundle()
            fragmentDashboard.arguments = args
            return fragmentDashboard
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

        //textView.setText(arguments.getString("key"))
    }

}