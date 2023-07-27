package com.lurian.ec3_luna.fragmentos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import androidx.lifecycle.Observer
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.lurian.ec3_luna.R
import com.lurian.ec3_luna.databinding.FragmentListBinding
import com.lurian.ec3_luna.viewmodel.EmojiListViewModel
class ListFragment : Fragment() {

    private lateinit var binding: FragmentListBinding
    private lateinit var adapter: EmojisListAdapter
    private lateinit var viewModel: EmojiListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = EmojisListAdapter(listOf())
        binding.rvEmojisList.adapter = adapter
        binding.rvEmojisList.layoutManager = LinearLayoutManager(requireContext())

        viewModel = ViewModelProvider(this).get(EmojiListViewModel::class.java) // Asegurar que ViewModel esté inicializado correctamente

        viewModel.emojis.observe(viewLifecycleOwner, Observer { emojis ->
            adapter.emojis = emojis
            adapter.notifyDataSetChanged()
        })

        viewModel.getAllEmojis()
    }
}
