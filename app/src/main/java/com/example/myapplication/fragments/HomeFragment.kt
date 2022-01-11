package com.example.myapplication.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.myapplication.R

class HomeFragment : Fragment(R.layout.fragment_home) {
    private lateinit var editTextAmount: EditText
    private lateinit var buttonsend: Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        editTextAmount = view.findViewById(R.id.editTextAmount)
        buttonsend = view.findViewById(R.id.buttonSend)
        val controller = Navigation.findNavController(view)
        buttonsend.setOnClickListener {
            val amountText = editTextAmount.text.toString()
            if (amountText.isEmpty()) {
                return@setOnClickListener
            }
        }
    }
}
