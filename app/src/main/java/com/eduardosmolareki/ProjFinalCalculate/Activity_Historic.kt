package com.eduardosmolareki.ProjFinalCalculate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.eduardosmolareki.ProjFinalCalculate.databinding.ActivityHistoricBinding
import com.eduardosmolareki.ProjFinalCalculate.model.ResultAdapter
import com.eduardosmolareki.ProjFinalCalculate.repository.ResultRepository

class Activity_Historic : AppCompatActivity() {
    private lateinit var binding: ActivityHistoricBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHistoricBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onStart() {
        super.onStart()
        val repository = ResultRepository(applicationContext)
        val results = repository.findAll()
        binding.rvHistoric.adapter = ResultAdapter(results)
        binding.rvHistoric.hasFixedSize()
        binding.rvHistoric.layoutManager = LinearLayoutManager(applicationContext)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home)
            finish()
        return super.onOptionsItemSelected(item)
    }
}