package com.example.packingvalet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
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

        val items = getItems()
        val adapter = ArrayAdapter(requireContext(),
                                   R.layout.support_simple_spinner_dropdown_item,
                                   items)

        binding?.itemList?.adapter = adapter
    }

    private fun getItems() = listOf("Pants",
                                    "Toothbrush",
                                    "Charger",
                                    "Vifon",
                                    "Pants",
                                    "Toothbrush",
                                    "Charger",
                                    "Vifon",
                                    "Pants",
                                    "Toothbrush",
                                    "Charger",
                                    "Vifon",
                                    "Pants",
                                    "Toothbrush",
                                    "Charger",
                                    "Vifon",
                                    "Pants",
                                    "Toothbrush",
                                    "Charger",
                                    "Vifon",
                                    "Pants",
                                    "Toothbrush",
                                    "Charger",
                                    "Vifon")
}