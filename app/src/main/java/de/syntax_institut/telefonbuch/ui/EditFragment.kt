package de.syntax_institut.telefonbuch.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import de.syntax_institut.telefonbuch.R
import de.syntax_institut.telefonbuch.databinding.FragmentEditBinding


class EditFragment : Fragment() {

    private lateinit var binding: FragmentEditBinding
    private var telName = ""
    private var telNr = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // TODO: lade die benötigten IDs aus den Navigationsargumenten
        arguments?.let {
            telName = it.getString("telName").toString()
            telNr = it.getString("telNr").toString()

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // TODO: lade das Layout in die BindingVariable
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_edit, container, false
        )

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvItemNameDetail.text = telName
        binding.tvItemNumberDetail.text = telNr

        binding.btnSave.setOnClickListener {
            view.findNavController().navigate(EditFragmentDirections.actionEditFragmentToDetailFragment(telName = telName, telNr = telNr))
        }
    }
}
