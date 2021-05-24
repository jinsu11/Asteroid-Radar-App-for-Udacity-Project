package com.udacity.asteroidradar

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.udacity.asteroidradar.databinding.AsteroidItemBinding

class RecyclerAdapter(val onClickListener: OnClickListener): RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    var items = listOf<Asteroid>()

    class ViewHolder(val binding: AsteroidItemBinding): RecyclerView.ViewHolder(binding.root){}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = AsteroidItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.textTitle.text = items[position].codename
        holder.binding.textDate.text = items[position].closeApproachDate
        holder.binding.imageIcon.setImageResource(
                if(items[position].isPotentiallyHazardous) R.drawable.ic_status_potentially_hazardous else R.drawable.ic_status_normal
        )
        holder.binding.root.setOnClickListener {
            onClickListener.onClick(items[position])
        }
    }

    override fun getItemCount(): Int = items.size

    class OnClickListener(val clickListener: (asteroid: Asteroid) -> Unit){
        fun onClick(asteroid: Asteroid) = clickListener(asteroid)
    }
}