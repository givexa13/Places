package com.example.places

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class PlacesAdapter(private val places: List<Places>)
    : RecyclerView.Adapter<PlacesAdapter.PlacesViewHolder>() {

        class PlacesViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

            val imageView: ImageView = itemView.findViewById(R.id.imageView)

        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlacesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.places_item, parent, false)
        return PlacesViewHolder(view)
    }

    override fun onBindViewHolder(holder: PlacesViewHolder, position: Int) {

        val p = places[position]

        val currentUrl: String = p.url

        Glide.with(holder.imageView.context)
                .load(currentUrl)
                .placeholder(R.drawable.ic_launcher_foreground)
                .centerCrop()
                .into(holder.imageView)

    }

    override fun getItemCount(): Int = places.size

}

