package de.syntax_institut.telefonbuch.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import de.syntax_institut.telefonbuch.R
import de.syntax_institut.telefonbuch.adapter.ItemAdapter
import de.syntax_institut.telefonbuch.data.Datasource
import de.syntax_institut.telefonbuch.data.model.Contact
import de.syntax_institut.telefonbuch.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val contacts = Datasource().loadContacts()
        binding.recyclerView.adapter = ItemAdapter(contacts)

        binding.btnAdd.setOnClickListener {

            // Hole den Inhalt aus den Textfeldern
            val name = binding.inName.text.toString()
            val number = binding.inPhoneNumber.text.toString()


            val itemAdapter = ItemAdapter(contacts)
            binding.recyclerView.adapter = itemAdapter

            if (name != "" && number != "") {
                val position = contacts.size
                contacts.add(position, Contact(0, name, number))
                itemAdapter.notifyItemInserted(position)
                binding.inName.setText("")
                binding.inPhoneNumber.setText("")
            }
        }
    }
}