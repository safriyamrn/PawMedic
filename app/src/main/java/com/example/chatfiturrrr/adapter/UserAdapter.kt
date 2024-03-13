package com.example.chatfiturrrr.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.chatfiturrrr.R
import com.example.chatfiturrrr.activity.SignInActivity
import com.example.chatfiturrrr.model.User

class UserAdapter (var list: List<User>) : RecyclerView.Adapter<UserAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        var namee: TextView
        var email: TextView
        init {
            namee = view.findViewById(R.id.etName)
            email = view.findViewById(R.id.etEmail)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_container_user, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.namee.text = list[position].toString()
        holder.email.text = list[position].toString()
    }
}