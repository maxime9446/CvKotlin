package com.example.cv
import com.example.cv.databinding.ActivityMainBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Liez le CVAdapter à son RecyclerView
        val cvAdapter = CVAdapter(Database.cvInfo)
        binding.recyclerView.adapter = cvAdapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this)

        // Liez le CompetenceAdapter à son RecyclerView
        val competenceAdapter = CompetenceAdapter(Database.cvInfo.competences)
        binding.competencesRecyclerView.adapter = competenceAdapter
        binding.competencesRecyclerView.layoutManager = LinearLayoutManager(this)
    }
}


