package com.example.lesson_6_2hw.adapter


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.example.lesson_6_2hw.databinding.ItemPhotoBinding
import com.example.lesson_6_2hw.utils.loadImage

class PhotoAdapter(private val list: ArrayList<String>) :
    RecyclerView.Adapter<PhotoAdapter.PhotoViewHolder>() {
    private val data = arrayListOf<String>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoViewHolder {
        return PhotoViewHolder(
            ItemPhotoBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: PhotoViewHolder, position: Int) {
        holder.bind(list[position])
    }

    fun addList(data: ArrayList<String>) {
        this.list.clear()
        this.list.addAll(data)
        notifyDataSetChanged()
    }

    fun getData(): ArrayList<String> {
        return data
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class PhotoViewHolder(private val binding: ItemPhotoBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(photo: String) {
            binding.ivPhoto.loadImage(photo)
            itemView.setOnClickListener {
                binding.ivPicture.isVisible = true
                data.add(photo)
            }
        }
    }
}