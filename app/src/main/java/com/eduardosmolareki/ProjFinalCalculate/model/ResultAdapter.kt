package com.eduardosmolareki.ProjFinalCalculate.model

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.eduardosmolareki.ProjFinalCalculate.R

class ResultAdapter(private val results:List<Result>) : RecyclerView.Adapter<ResultHolder> () {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ResultHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.historic_item, parent, false)

        return ResultHolder(view)
    }

    override fun onBindViewHolder(holder: ResultHolder, position: Int) {
        holder.tvCount.text = results[position].count
        holder.tvResult.text = results[position].result
    }

    override fun getItemCount(): Int = results.size
}

class ResultHolder(private val view: View) : RecyclerView.ViewHolder(view) {
    var tvCount:TextView = view.findViewById(R.id.tvCount)
    var tvResult:TextView = view.findViewById(R.id.tvResult)
}