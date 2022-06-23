package com.example.androidlearn.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.findNavController
import com.example.androidlearn.TopicFragmentDirections
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.androidlearn.R
import com.example.androidlearn.model.Topics


class TopicAdapter  (private val dataSet: List<Topics>, private val topicClicked: (Topics)-> Unit):
    RecyclerView.Adapter<TopicAdapter.ItemViewHolder>(){

    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val topicNameText: TextView = itemView.findViewById(R.id.topic_name)
        val topicImage: ImageView= itemView.findViewById(R.id.topic_image)
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
            val adapterLayout= LayoutInflater.from(parent.context).inflate(R.layout.list_topic, parent, false)
            return ItemViewHolder(adapterLayout)
        }

        override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
            val item = dataSet[position]
            holder.topicNameText.text = item.topicName
            holder.topicImage.setImageResource(item.topicImage)

            holder.topicImage.setOnClickListener {
                topicClicked(item)
            }

            holder.topicNameText.setOnClickListener{
                topicClicked(item)
            }

        }
        override fun getItemCount(): Int =dataSet.size
}