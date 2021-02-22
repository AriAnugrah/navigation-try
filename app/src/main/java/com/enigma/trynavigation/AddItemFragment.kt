package com.enigma.trynavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.NavHostFragment.findNavController
import kotlinx.android.synthetic.main.fragment_add_item.*
import kotlinx.android.synthetic.main.fragment_list_item.*


class AddItemFragment : Fragment(), View.OnClickListener {

    private lateinit var navController : NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_item, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = findNavController(view)
        btnList.setOnClickListener(this)
        btn_to_history.setOnClickListener(this)
        btn_to_other.setOnClickListener(this)
    }

    companion object {

        @JvmStatic
        fun newInstance() = AddItemFragment()
    }

    override fun onClick(v: View?) {
        when(v){
            btnList -> navController.navigate(R.id.action_addItemFragment_to_listItemFragment)
            btn_to_history -> navController.navigate(R.id.action_addItemFragment_to_historyFragment2)
            btn_to_other -> navController.navigate((R.id.action_addItemFragment_to_otherFragment))
        }
    }
}