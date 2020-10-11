package com.example.ass8

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.emp_item_layout.view.*

class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val tvname = view.tv_name
    val tvgender = view.tv_gender
    val tvemail = view.tv_email
    val tvsalary = view.tv_salary
}