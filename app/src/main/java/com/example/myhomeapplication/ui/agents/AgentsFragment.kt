package com.example.myhomeapplication.ui.agents

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.myhomeapplication.databinding.FragmentAgentsBinding

class AgentsFragment : Fragment() {

    private var _binding: FragmentAgentsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val agentsViewModel =
            ViewModelProvider(this).get(AgentsViewModel::class.java)

        _binding = FragmentAgentsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textAgents
        agentsViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}