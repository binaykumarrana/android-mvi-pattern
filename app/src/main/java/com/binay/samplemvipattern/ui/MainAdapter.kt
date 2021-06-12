package com.binay.samplemvipattern.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.binay.samplemvipattern.R
import com.binay.samplemvipattern.data.User
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.home_item.view.*

/**
 * Created by Binay on 12/6/21.
 */
class MainAdapter(private val users: ArrayList<User>) :
    RecyclerView.Adapter<MainAdapter.DataViewHolder>() {
    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(user: User) {
            itemView.titleTextView.text = user.name
            itemView.descTextView.text = user.desc
            Glide.with(itemView.articleImageView.context)
                .load(user.avatar)
                .transition(DrawableTransitionOptions.withCrossFade())
                .apply(RequestOptions.centerCropTransform())
                .into(itemView.articleImageView)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = DataViewHolder(
        LayoutInflater.from(parent.context).inflate(
            R.layout.home_item, parent, false
        )
    )

    override fun getItemCount(): Int = users.size
    override fun onBindViewHolder(
        holder: DataViewHolder,
        position: Int
    ) =
        holder.bind(users[position])

    fun addData(list: List<User>) {
        users.addAll(list)
    }
}