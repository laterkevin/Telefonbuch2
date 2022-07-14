package de.syntax_institut.telefonbuch.data

import de.syntax_institut.telefonbuch.R
import de.syntax_institut.telefonbuch.data.model.Contact

/**
 * Diese Klasse bereitet die Informationen vor
 */
class Datasource {

    /**
     * Diese Funktion liefert eine Liste von Contact Objekten zurück,
     * in denen die Namen und die Telefonnummern gespeichert sind
     */
    fun loadContacts(): MutableList<Contact> {
        return mutableListOf(
            Contact(1, "Lionel Messi", "+49 1595 9367862"),
            Contact(2, "Cristiano Ronaldo", "+49 15047 284702"),
            Contact(3, "Franz Beckenbauer", "+49 1598 7361226"),
            Contact(4, "Pelé", "+49 1513 5007043"),
            Contact(5, "Lothar Matthäus", "+49 15596 033203"),
            Contact(6, "Paul Breitner", "+49 15027 785378"),
            Contact(7, "Neymar", "+49 15574 793889"),
            Contact(8, "Bastian Schweinsteiger", "+49 163 55846780"),
            Contact(9, "Luis Suárez", "+49 15655 478518"),
            Contact(10, "Diego Maradona", "+49 15868 293585"),
            Contact(11, "Sergio Ramos", "+49 1526 6618426"),
            Contact(12, "Robert Lewandowski", "+49 162 6334069"),
            Contact(13, "Philipp Lahm", "+49 15880 654128"),
            Contact(14, "Mesut Özil", "+49 172 32469523"),
            Contact(15, "Marco Reus", "+49 1521 3291920"),
            Contact(16, "Manuel Neuer", "+49 1577 5161260"),
            Contact(17, "Zinédine Zidane", "+49 162 7285734"),
            Contact(18, "Thomas Müller", "+49 15818 559583"),
            Contact(19, "Toni Kroos", "+49 162 6544672"),
            Contact(20, "Mats Hummels", "+49 173 30423354")
        )
    }
}
