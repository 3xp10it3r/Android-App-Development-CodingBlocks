package com.example.basictodoapp.adapters
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.basictodoapp.R
//import androidx.viewpager.R
import com.example.basictodoapp.models.Todo

class TodoAdapter(val todos : ArrayList<Todo> )     : RecyclerView.Adapter<TodoAdapter.TodoViewHolder>() {
    class TodoViewHolder(val item : View) : RecyclerView.ViewHolder(item){
        val tvTodoTask = item.findViewById<TextView>(R.id.tvTodoTask)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        val li = parent?.context?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val itemView = li.inflate(R.layout.list_item_todo,parent,false)
        return TodoViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        holder?.tvTodoTask?.text = todos[position].Task
    }

    override fun getItemCount(): Int {
        return todos.size
    }


}