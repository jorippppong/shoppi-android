package com.example.shoppi_android.ui.category

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.shoppi_android.R
import com.example.shoppi_android.databinding.FragmentCategoryBinding
import com.example.shoppi_android.ui.common.ViewModelFactory

class CategoryFragment:Fragment() {

    private val viewModel:CategoryViewModel by viewModels{ViewModelFactory(requireContext())}
    private lateinit var binding:FragmentCategoryBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCategoryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val categoryAdapter = CategoryAdapter()
        binding.tvCategoryList.adapter = categoryAdapter
        viewModel.items.observe(viewLifecycleOwner){
            categoryAdapter.submitList(it)
        }
    }
}