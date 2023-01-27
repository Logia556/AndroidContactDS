package fr.isen.angileri.androidcontactds.activity

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.example.Results
import fr.isen.angileri.androidcontactds.R
import fr.isen.angileri.androidcontactds.model.ContactsViewAdapter

class HomeActivity : AppCompatActivity() {
    companion object {
        const val URL = "https://randomuser.me/api/?results=10&nat=fr"
    }

    private lateinit var adapter: ContactsViewAdapter
    lateinit var contacts: List<Results>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)





        val rvActiveElement = findViewById<View>(R.id.recyclerViewContacts) as RecyclerView

        rvActiveElement.adapter = adapter
        rvActiveElement.layoutManager = LinearLayoutManager(this)


    }
     /*
        val recyclerViewContacts = findViewById<View>(R.id.recyclerViewContacts) as RecyclerView
        // Initialize contacts
        contacts = Results.createContactsList(20)
        // Create adapter passing in the sample user data
        val adapter = ContactsAdapter(contacts)
        // Attach the adapter to the recyclerview to populate items
        rvContacts.adapter = adapter
        // Set layout manager to position the items
        rvContacts.layoutManager = LinearLayoutManager(this)
        // That's all!
*/
    }/*
    private fun populateContacts() {
        val queue = Volley.newRequestQueue(this)
        val request = JsonObjectRequest(
            Request.Method.GET, URL, null,
            { response ->
                val results = response.getJSONArray("results")
                val contacts = mutableListOf<Results>()
                for (i in 0 until results.length()) {
                    val contact = Results.fromJson(results.getJSONObject(i))
                    contacts.add(contact)
                }
                adapter.updateContacts(contacts)
            },
            { error ->
                Log.d("ERROR", error.toString())
            }
        )
        queue.add(request)
    }

    private fun getContactsAPI() {
        val queue = Volley.newRequestQueue(this.applicationContext)

        val requestBody = JSONObject()
        requestBody.get("results")

        val jsonRequest = JsonObjectRequest(
            Request.Method.GET,
            URL,
            requestBody,
            { response ->
                responseHandler(response)
            },
            { error ->
                Log.d("API", error.toString())
            }
        )
        queue.add(jsonRequest)
    }

    private fun responseHandler(response: JSONObject){
        val contacts = response.getJSONArray("results")

    }*/
