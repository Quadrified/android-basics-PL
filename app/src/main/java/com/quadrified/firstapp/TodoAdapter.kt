package com.quadrified.firstapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Adapter => bridge between a dataset and the RecyclerView,
// managing the creation and binding of data to views that are displayed as scrollable list items
// Adapter is renderItem is made from Adapter

class TodoAdapter(
    private var todos: List<Todo>
) : RecyclerView.Adapter<TodoAdapter.TodoViewHolder>() {
    inner class TodoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        // New item is created here
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_todo, parent, false)
        return TodoViewHolder(view)
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        // Set view to each item properties
        holder.itemView.apply {
            val tvTitle = findViewById<TextView>(R.id.tvItemTitle)
            val cbCheckItemDone = findViewById<CheckBox>(R.id.cbCheckItemDone)

            tvTitle.text = todos[position].title
            cbCheckItemDone.isChecked = todos[position].isChecked
        }
    }

    override fun getItemCount(): Int {
        // Count of items in RecyclerView
        return todos.size
    }
}