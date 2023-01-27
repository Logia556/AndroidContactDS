package fr.isen.angileri.androidcontactds.model

class Contact( val name: String, val firstName: String,val mail: String,val address: String) {
    companion object {

        fun createContact(): List<Contact> {


            return listOf(Contact("jean","jak","mail@mail.mail","166 rue rue"), Contact("jean","jak","mail@mail.mail","166 rue rue"), Contact("jean","jak","mail@mail.mail","166 rue rue"))
        }
    }

}

