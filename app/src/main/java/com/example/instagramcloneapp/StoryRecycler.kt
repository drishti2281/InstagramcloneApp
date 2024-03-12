package com.example.instagramcloneapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StoryRecycler(var story:List<CreateStory>): RecyclerView.Adapter<StoryRecycler.StoryViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoryViewHolder {
        var inflater: LayoutInflater = LayoutInflater.from(parent.context)
        var view = inflater.inflate(R.layout.activity_create_story, parent, false)
        return StoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: StoryViewHolder, position: Int) {
        holder.apply {  }
    }


    override fun getItemCount(): Int {
        return story.size
    }

    class StoryViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var storyImageView = view.findViewById<TextView>(R.id.storyImageView)
        var storyTextView = view.findViewById<TextView>(R.id.storyTextView)
    }
}