package com.example.ass8


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class EmployeeAdapter(val item: List<Employee>, val context: Context): RecyclerView.Adapter <ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view_item : View = LayoutInflater.from(parent.context).inflate(R.layout.emp_item_layout,parent,false)
        return ViewHolder(view_item)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvname.text ="Name: " + item[position].emp_name
        holder.tvgender.text ="Gender: " + item[position].emp_gender
        holder.tvemail.text ="E-mail: "+ item[position].emp_email
        holder.tvsalary.text ="Salary: "+ item[position].emp_salary.toString()
    }
    override fun getItemCount(): Int {
        return item.size
    }


}