package com.dogeisdope.memoryleaksample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.dogeisdope.memoryleaksample.databinding.FragmentFirstBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null
    val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnFirst.setOnClickListener {
            findNavController().navigate(R.id.action_to_second)
        }

//        viewLifecycleOwner.lifecycleScope.launch {
//            delay(150L)
//            binding.btnFirst.performClick()
//        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}