package com.example.navigationtransitionanimations

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigationtransitionanimations.databinding.FragmentTransitionTypesBinding

class TransitionTypesFragment : Fragment() {
    private var _binding: FragmentTransitionTypesBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTransitionTypesBinding.inflate(inflater, container, false)

        binding.fromRightTextView.setOnClickListener {
            findNavController().navigate(R.id.action_transitionTypesFragment_to_nav_graph_from_right)
        }

        binding.rightToLeftTextView.setOnClickListener {
            findNavController().navigate(R.id.action_transitionTypesFragment_to_nav_graph_right_to_left)
        }

        binding.bottomToTopTextView.setOnClickListener {

        }


        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}