package com.example.packingvalet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.packingvalet.databinding.FragmentTripCreationBinding

class TripCreationFragment : Fragment() {

    private var binding: FragmentTripCreationBinding? = null

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        binding = FragmentTripCreationBinding.inflate(inflater, container, false)

        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.button?.setOnClickListener {
            binding?.root?.findNavController()?.navigate(
                TripCreationFragmentDirections
                    .actionTripCreationFragmentToPackingActionFragment()
            )
        }
    }
}