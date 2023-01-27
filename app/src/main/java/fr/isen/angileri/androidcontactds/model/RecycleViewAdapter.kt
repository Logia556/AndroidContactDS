package fr.isen.angileri.androidcontactds.model

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import fr.isen.angileri.androidcontactds.R

class RecycleViewAdapter (private val mContacts: List<Contact>) : RecyclerView.Adapter<RecycleViewAdapter.ViewHolder>(){


        // Provide a direct reference to each of the views within a data item
        // Used to cache the views within the item layout for fast access
        inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            // Your holder should contain and initialize a member variable
            // for any view that will be set as you render a row
            val nameTextView = itemView.findViewById<TextView>(R.id.name)
            val firstnametextView = itemView.findViewById<TextView>(R.id.firstName)
            val addressTextView = itemView.findViewById<TextView>(R.id.address)
            val emailTextView = itemView.findViewById<TextView>(R.id.mail)

        }

        // ... constructor and member variables
        // Usually involves inflating a layout from XML and returning the holder
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecycleViewAdapter.ViewHolder {
            val context = parent.context
            val inflater = LayoutInflater.from(context)
            // Inflate the custom layout
            val contactView = inflater.inflate(R.layout.recycle_view_item, parent, false)
            // Return a new holder instance
            return ViewHolder(contactView)
        }

        // Involves populating data into the item through holder
        override fun onBindViewHolder(viewHolder: RecycleViewAdapter.ViewHolder, position: Int) {
            // Get the data model based on position
            val contact: Contact = mContacts.get(position)
            // Set item views based on your views and data model
            val textView = viewHolder.nameTextView
            textView.setText(contact.name)
            val textView2 = viewHolder.firstnametextView
            textView2.setText(contact.firstName)
            val textView3 = viewHolder.addressTextView
            textView3.setText(contact.address)
            val textView4 = viewHolder.emailTextView
            textView4.setText(contact.mail)
        }

        // Returns the total count of items in the list
        override fun getItemCount(): Int {
            return mContacts.size
        }

    }
