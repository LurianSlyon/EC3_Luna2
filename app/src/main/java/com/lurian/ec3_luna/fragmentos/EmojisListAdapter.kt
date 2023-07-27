package com.lurian.ec3_luna.fragmentos

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lurian.ec3_luna.databinding.ItemsBinding
import com.lurian.ec3_luna.modal.Emojis

// adapter/EmojisListAdapter.kt
class EmojisListAdapter(var emojis: List<Emojis>) : RecyclerView.Adapter<EmojisViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmojisViewHolder {
        val binding = ItemsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return EmojisViewHolder(binding)
    }

    override fun getItemCount(): Int = emojis.size

    override fun onBindViewHolder(holder: EmojisViewHolder, position: Int) {
        holder.bind(emojis[position])
    }
}

class EmojisViewHolder(private val binding: ItemsBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(emoji: Emojis) {
        binding.txtName.text =  "Nombre: ${emoji.name}"
        binding.txtCategory.text = "Category: ${emoji.category}"
        binding.txtGroup.text = "Group: ${emoji.group}"
        binding.txtHtmlCode.text = "HTML Code: ${emoji.htmlCode.joinToString(", ")}"
        binding.txtUnicode.text = "Unicode: ${emoji.unicode.joinToString(", ")}"
    }
}
