package com.example.packingvalet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.navigation.findNavController
import com.example.packingvalet.databinding.FragmentPackingActionBinding
import com.example.packingvalet.databinding.FragmentTripCreationBinding

class PackingActionFragment : Fragment() {

    private var binding: FragmentPackingActionBinding? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        binding = FragmentPackingActionBinding.inflate(inflater, container, false)

        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val items = getItems()
        val adapter = ArrayAdapter(requireContext(),
                                   android.R.layout.simple_list_item_activated_1,
                                   items)

        binding?.selectedItemList?.adapter = adapter
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