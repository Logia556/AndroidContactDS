package fr.isen.angileri.androidcontactds.model

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.example.Results
import com.squareup.picasso.Picasso
import fr.isen.angileri.androidcontactds.R

class ContactsViewAdapter(private val contacts: List<Results>) : RecyclerView.Adapter<ContactsViewAdapter.ContactsViewHolder>() {


    inner class ContactsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val firstName: TextView = itemView.findViewById(R.id.contactNom)
        val lastName: TextView = itemView.findViewById(R.id.contactPrenom)
        val address: TextView = itemView.findViewById(R.id.contactAddress)
        val email: TextView = itemView.findViewById(R.id.contactMail)
        val picture: ImageView = itemView.findViewById(R.id.contactImage)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val contactLayout = inflater.inflate(R.layout.contact_item, parent, false)
        return ContactsViewHolder(contactLayout)
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        val contact = contacts[position]
        holder.firstName.text = contact.getFirstName()
        holder.lastName.text = contact.getLastName()
        holder.address.text = contact.getAddress()
        holder.email.text = contact.email

        if (contact.picture != null) {
            Picasso.get().load(contact.getPicture())
        }
    }
}