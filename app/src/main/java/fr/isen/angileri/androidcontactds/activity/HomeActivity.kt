package fr.isen.angileri.androidcontactds.activity

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import fr.isen.angileri.androidcontactds.R
import fr.isen.angileri.androidcontactds.model.Contact
import fr.isen.angileri.androidcontactds.model.RecycleViewAdapter

class HomeActivity : AppCompatActivity() {
    lateinit var contacts: List<Contact>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)





        val rvActiveElement = findViewById<View>(R.id.recyclerViewContacts) as RecyclerView
        contacts = Contact.createContact()
        val adapter = RecycleViewAdapter(contacts)
        rvActiveElement.adapter = adapter
        rvActiveElement.layoutManager = LinearLayoutManager(this)


    }



    /*
    companion object {
        const val URL = "https://randomuser.me/api/?results=10&nat=fr"
    }
    private lateinit var binding: ActivityHomeBinding
    private lateinit var adapter: ContactsViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //adapter = ContactsViewAdapter(mutableListOf(), this::changeActivityDetail)
        binding.recyclerCategory.adapter = adapter
        binding.recyclerCategory.layoutManager = LinearLayoutManager(this)
        binding.recyclerCategory.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
*/
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



    }


/*
    private fun getContactsAPI() {
        val queue = Volley.newRequestQueue(this.applicationContext)

        val requestBody = JSONObject()
        requestBody.get("results")

        val jsonRequest = JsonObjectRequest(
            Request.Method.POST,
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

    }
}*/