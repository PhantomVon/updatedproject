package com.example.myhomeapplication.ui.owners

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.myhomeapplication.databinding.FragmentOwnersBinding

class OwnersFragment : Fragment() {

    private var _binding: FragmentOwnersBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val ownersViewModel =
            ViewModelProvider(this).get(OwnersViewModel::class.java)

        _binding = FragmentOwnersBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textOwners
        ownersViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}