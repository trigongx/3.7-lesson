package com.example.a37_lesson

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.bumptech.glide.Glide
import com.example.a37_lesson.databinding.FragmentMainBinding
import com.example.a37_lesson.databinding.ItemPersonBinding

class PersonAdapter(val list:ArrayList<Person>,val onClick:(person:Person)->Unit):RecyclerView.Adapter<PersonAdapter.ViewHolder>() {

    inner class ViewHolder(private val binding: ItemPersonBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(){
            val item = list[adapterPosition]
            binding.tvName.text = item.name
            binding.tvAlive.text = item.life
            item.image?.let { binding.detailImgPerson.loadImage(it) }

            itemView.setOnClickListener {
                onClick.invoke(item)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemPersonBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind()
    }
}