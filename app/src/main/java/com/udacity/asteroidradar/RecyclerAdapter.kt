package com.udacity.asteroidradar

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.udacity.asteroidradar.databinding.AsteroidItemBinding

class RecyclerAdapter(val onClickListener: OnClickListener): ListAdapter<Asteroid, RecyclerAdapter.ViewHolder>(AsteroidDiffCallback()) {
//    var items = listOf<Asteroid>()

    class ViewHolder(val binding: AsteroidItemBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = AsteroidItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = getItem(position)

        holder.binding.textTitle.text = item.codename
        holder.binding.textDate.text = item.closeApproachDate
        holder.binding.imageIcon.setImageResource(
                if(item.isPotentiallyHazardous) R.drawable.ic_status_potentially_hazardous else R.drawable.ic_status_normal
        )
        holder.binding.root.setOnClickListener {
            onClickListener.onClick(item)
        }
    }

//    override fun getItemCount(): Int = items.size

    class OnClickListener(val clickListener: (asteroid: Asteroid) -> Unit){
        fun onClick(asteroid: Asteroid) = clickListener(asteroid)
    }
}

class AsteroidDiffCallback: DiffUtil.ItemCallback<Asteroid>() {
    override fun areItemsTheSame(oldItem: Asteroid, newItem: Asteroid): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Asteroid, newItem: Asteroid): Boolean {
        return oldItem == newItem
    }
}