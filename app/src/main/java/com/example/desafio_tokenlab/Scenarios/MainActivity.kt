package com.example.desafio_tokenlab.Scenarios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.desafio_tokenlab.Entities.Movie
import com.example.desafio_tokenlab.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainContract.View {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val presenter: MainContract.Presenter = MainPresenter(this)
        presenter.onLoadList()
    }

    override fun showList(movies: List<Movie>){
        val adapter = MovieAdapter(this, movies)

        rvMovies.adapter = adapter
        rvMovies.layoutManager = LinearLayoutManager(this)
    }

    override fun showMessage(mensagem: String){
        Toast.makeText(this,mensagem, Toast.LENGTH_SHORT).show()
    }

    override fun hideLoading() {
        pbLoading.visibility = ProgressBar.INVISIBLE
    }

    override fun showLoading() {
        pbLoading.visibility = ProgressBar.VISIBLE
    }
}
