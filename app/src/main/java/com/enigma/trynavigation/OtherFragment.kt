package com.enigma.trynavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_history.*
import kotlinx.android.synthetic.main.fragment_history.btnBack_to_add_item
import kotlinx.android.synthetic.main.fragment_list_item.*
import kotlinx.android.synthetic.main.fragment_other.*

class OtherFragment : Fragment(), View.OnClickListener {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_other, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        btnBack_to_add_item.setOnClickListener(this)
    }

    companion object {

        @JvmStatic
        fun newInstance() = OtherFragment()
    }

    override fun onClick(v: View?) {
//        when(v){
//            btnBack_to_add_item -> navController.navigate(R.id.action_otherFragment_to_addItemFragment)
//        }
    }
}
