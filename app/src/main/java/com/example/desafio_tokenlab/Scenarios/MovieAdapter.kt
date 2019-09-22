package com.example.desafio_tokenlab.Scenarios

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.desafio_tokenlab.Entities.Movie
import com.example.desafio_tokenlab.R
import kotlinx.android.synthetic.main.movie_item.view.*

class MovieAdapter (val context: Context, val movies: List<Movie>): RecyclerView.Adapter<MovieAdapter.ViewHolder>(){

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(context, movies[position])
    }

    override fun getItemCount(): Int {
        return movies.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.movie_item, parent, false)
        return ViewHolder(view)
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bindView(context: Context, movie: Movie) {
            itemView.movie.text = movie.title
        }

    }
}