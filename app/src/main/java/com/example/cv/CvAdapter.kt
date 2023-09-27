package com.example.cv
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.cv.databinding.ItemCvBinding


import androidx.recyclerview.widget.RecyclerView

class CVAdapter(private val cvData: CVData) : RecyclerView.Adapter<CVAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: ItemCvBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemCvBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.data = cvData
    }

    override fun getItemCount() = 1 // puisque c'est un CV, il n'y a qu'un seul item
}
