package com.example.instagramcloneapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PostRecycler(var postList: List<PostModules>) : RecyclerView.Adapter<PostViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val inflater: LayoutInflater = LayoutInflater.from(parent.context)
        var view = inflater.inflate(R.layout.item_post, parent, false)
        return PostViewHolder(view)
    }

    override fun getItemCount(): Int {
        return postList.size
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        holder.postPic.setImageResource(postList[position].post)
        holder.profilePic.setImageResource(postList[position].profilePicture)
        holder.userName.text = postList[position].userName
    }
}

class PostViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val profilePic = itemView.findViewById<ImageView>(R.id.iv_profile_picture)
    val postPic = itemView.findViewById<ImageView>(R.id.iv_post)
    val userName = itemView.findViewById<TextView>(R.id.tv_post_username)
}
