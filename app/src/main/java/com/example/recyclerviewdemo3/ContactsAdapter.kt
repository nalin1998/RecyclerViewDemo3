package com.example.recyclerviewdemo3

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactsAdapter (private val mContacts : MutableList<Contact>) : RecyclerView.Adapter<ContactsAdapter.ViewHolder>() {

    //creates a viewholder and returns it ....
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var context : Context = parent.context
        var inflater : LayoutInflater= LayoutInflater.from(context)

        var contactView :View = inflater.inflate(R.layout.contact_item,parent,false)
        var viewholder : ViewHolder = ViewHolder(contactView)
        return viewholder
    }

//binds the viewHolder to data....
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var contact : Contact = mContacts.get(position)
        var textView :TextView = holder.nameTextView
        var button : Button = holder.messageButton
    textView.text = contact.mName
    if(contact.mOnline){
        button.text = "Message"
    }else {
        button.text = "Offline"
    }

    }

    override fun getItemCount(): Int {
        return mContacts.size
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //our viewholder has member variables for all views in a row.....
        var nameTextView: TextView = itemView.findViewById(R.id.contact_name)
        var messageButton: Button = itemView.findViewById(R.id.message_button)

    }
}