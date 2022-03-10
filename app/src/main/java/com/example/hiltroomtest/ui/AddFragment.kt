package com.example.hiltroomtest.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.example.hiltroomtest.R
import com.example.hiltroomtest.model.toDo
import com.example.hiltroomtest.viewModel.AddFragmentViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_add.*


class AddFragment : Fragment() {

    private lateinit var viewModel: AddFragmentViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(requireActivity()).get(AddFragmentViewModel::class.java)

        sendData.setOnClickListener {
            val text = addText.text.toString()
            val a = toDo(0,text)
            viewModel.addTodo(a)
            val navigationController = Navigation.findNavController(it)
            navigationController.navigate(R.id.action_addFragment_to_listFragment)
        }
    }
}