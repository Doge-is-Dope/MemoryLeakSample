package com.dogeisdope.memoryleaksample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.dogeisdope.memoryleaksample.databinding.FragmentSecondBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null
    val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentSecondBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnSecond.setOnClickListener {
            findNavController().navigate(R.id.action_to_first)
        }

//        viewLifecycleOwner.lifecycleScope.launch {
//            delay(150L)
//            binding.btnSecond.performClick()
//        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}