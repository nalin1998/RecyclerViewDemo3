package com.example.recyclerviewdemo3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity :AppCompatActivity () {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvContacts.adapter = ContactsAdapter(createList())
        rvContacts.layoutManager=LinearLayoutManager(this)
    }
    private fun createList(): MutableList<Contact>{
        val contactList = mutableListOf<Contact>()
        contactList.add( Contact("Tam",true))
        contactList.add( Contact("Sam",true))
        contactList.add( Contact("Sam",true))
        contactList.add( Contact("Sam",true))
        contactList.add( Contact("Sam",true))
        contactList.add( Contact("Sam",true))
        contactList.add( Contact("Sam",true))
        contactList.add( Contact("Sam",true))
        return  contactList

    }

}