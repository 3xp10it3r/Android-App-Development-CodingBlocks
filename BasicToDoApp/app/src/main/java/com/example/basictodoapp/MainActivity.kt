package com.example.basictodoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.basictodoapp.adapters.TodoAdapter
import com.example.basictodoapp.models.Todo

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         val todos : ArrayList<Todo> = ArrayList()

         val rvTodos: RecyclerView = findViewById(R.id.rvTodos)
         val btnAdd: Button = findViewById(R.id.btnAdd)

        val etNewTodo = findViewById<EditText>(R.id.etNewTask)

        todos.add(Todo("New Task1 " , false))

        rvTodos?.layoutManager = LinearLayoutManager(this)
        val todoAdapter  = TodoAdapter(todos)

        rvTodos?.adapter = todoAdapter

        btnAdd.setOnClickListener{
            val newTodo = etNewTodo.text.toString()
            todos.add(Todo(newTodo,false))
            todoAdapter.notifyDataSetChanged()
        }
    }
}