package com.example.hiltroomtest.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hiltroomtest.R
import com.example.hiltroomtest.adater.toDoAdapter
import com.example.hiltroomtest.viewModel.ListFragmentViewModel
import kotlinx.android.synthetic.main.fragment_list.*


class ListFragment : Fragment() {

    private lateinit var viewModel: ListFragmentViewModel
    private lateinit var adapter: toDoAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(requireActivity()).get(ListFragmentViewModel::class.java)

        viewModel.readAllData.observe(this, Observer {
            adapter = toDoAdapter(it)
            recyclerView.layoutManager = LinearLayoutManager(context)
            recyclerView.adapter = adapter
        })

    }
}