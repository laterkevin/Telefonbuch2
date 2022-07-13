package de.syntax_institut.telefonbuch.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.card.MaterialCardView
import de.syntax_institut.telefonbuch.R
import de.syntax_institut.telefonbuch.data.model.Contact
import de.syntax_institut.telefonbuch.ui.HomeFragment
import de.syntax_institut.telefonbuch.ui.HomeFragmentDirections

/**
 * Diese Klasse organisiert mithilfe der ViewHolder Klasse das Recycling
 */
class ItemAdapter(
    private val dataset: List<Contact>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    /**
     * der ViewHolder umfasst die View uns stellt einen Listeneintrag dar
     */
    inner class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var mcView: MaterialCardView = itemView.findViewById(R.id.materialCardView)
        var tvName: TextView = itemView.findViewById(R.id.tvItemName)
        var tvNumber: TextView = itemView.findViewById(R.id.tvItemNumber)
    }

    /**
     * hier werden neue ViewHolder erstellt
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {

        val itemLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(itemLayout)
    }

    /**
     * hier findet der Recyclingprozess statt
     * die vom ViewHolder bereitgestellten Parameter erhalten die Information des Listeneintrags
     */
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.mcView.setOnClickListener {

            val navController = holder.itemView.findNavController()
            navController.navigate(HomeFragmentDirections.actionHomeFragmentToDetailFragment(telName = dataset[position].name, telNr = dataset[position].number))
        }
        holder.tvName.text = dataset[position].name
        holder.tvNumber.text = dataset[position].number

    }

    /**
     * damit der LayoutManager weiß, wie lang die Liste ist
     */
    override fun getItemCount(): Int {
        return dataset.size
    }
}
