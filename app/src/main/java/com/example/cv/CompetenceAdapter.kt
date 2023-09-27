package com.example.cv

import android.widget.ProgressBar
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CompetenceAdapter(private val competences: List<Competence>) :
    RecyclerView.Adapter<CompetenceAdapter.CompetenceViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CompetenceViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_competence, parent, false)
        return CompetenceViewHolder(view)
    }

    override fun onBindViewHolder(holder: CompetenceViewHolder, position: Int) {
        holder.bind(competences[position])
    }

    override fun getItemCount() = competences.size

    class CompetenceViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val competenceTextView: TextView = itemView.findViewById(R.id.competenceTextView)
        private val competenceProgressBar: ProgressBar = itemView.findViewById(R.id.competenceProgressBar)

        fun bind(competence: Competence) {
            competenceTextView.text = competence.nom
            competenceProgressBar.progress = competence.pourcentage
        }
    }
}
