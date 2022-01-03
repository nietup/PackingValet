package com.example.packingvalet

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.core.view.get
import androidx.navigation.findNavController
import com.example.packingvalet.databinding.FragmentTripCreationBinding

class TripCreationFragment : Fragment() {

    private val items = mutableListOf("Pants", "Toothbrush", "Charger", "Vifon")
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

        val adapter = ArrayAdapter(requireContext(),
                                   android.R.layout.simple_list_item_multiple_choice,
                                   items)

        val itemList = binding!!.storedItemList

        itemList.adapter = adapter

        binding?.newItemEditText?.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun afterTextChanged(p0: Editable?) {
                p0.toString().let {
                    if (it.contains('\n')) {
                        items.add(it.trim())
                        p0?.clear()
                    }
                }
            }
        })
    }
}