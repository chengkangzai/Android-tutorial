package com.example.t2_affirmations.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.t2_affirmations.R
import com.example.t2_affirmations.model.Affirmation

class ItemAdapter(
    private val context: Context,
    private val dataSet: List<Affirmation>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }

    /**
     * This method need to generate clone of list_item file
     * This method need to generate an object of ItemViewHolder
     *
     * @param parent ViewGroup design clone to the object of itemViewHolder
     *
     * @return ItemViewHolder
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout =
            LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout);
    }

    /**
     * This will get call again and again while user scrolling the screen
     *
     * @param holder View holder that hold the content
     * @param position position that currently looking
     */
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataSet[position];
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
    }

    override fun getItemCount(): Int {
        return dataSet.size;
    }
}