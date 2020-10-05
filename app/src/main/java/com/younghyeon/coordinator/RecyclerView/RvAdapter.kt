package com.younghyeon.coordinator.RecyclerView

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.younghyeon.coordinator.R
import kotlinx.android.synthetic.main.rv_item.view.*

class RvAdapter : RecyclerView.Adapter<RvAdapter.RvHolder>() {

    var items: MutableList<RvModel> = mutableListOf(
        RvModel("NameA", 15,"060312"),
        RvModel("NameB", 16,"050312"),
        RvModel("NameC", 17,"040312"),
        RvModel("NameD", 18,"030312"),
        RvModel("NameE", 19,"020312"),
        RvModel("NameF", 20,"010312"),
        RvModel("NameG", 21,"000312"),
        RvModel("NameH", 22,"990312"),
        RvModel("NameI", 23,"980312"),
        RvModel("NameJ", 24,"970312"),
        RvModel("NameK", 25,"960312"),
        RvModel("NameL", 26,"950312"),
        RvModel("NameM", 27,"940312"),
        RvModel("NameN", 28,"930312"),
        RvModel("NameO", 29,"920312"),
        RvModel("NameP", 30,"910312"),
        RvModel("NameQ", 31,"900312"),
        RvModel("NameR", 32,"890312")
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = RvHolder(parent)

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: RvHolder, position: Int) {
        items[position].let { item ->
            with(holder) {
                tvName.text = item.name
                tvAge.text = item.age.toString()
                tvBirth.text = item.birthday
            }
        }
    }

    inner class RvHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.rv_item, parent, false)) {
        val tvName  =   itemView.tvName
        val tvAge   =   itemView.tvAge
        val tvBirth =   itemView.tvBirthday
    }
}