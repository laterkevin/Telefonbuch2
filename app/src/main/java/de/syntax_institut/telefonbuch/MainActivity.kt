package de.syntax_institut.telefonbuch

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import de.syntax_institut.telefonbuch.databinding.ActivityMainBinding

/**
 * Die Main Activity
 */
class MainActivity : AppCompatActivity() {

    /**
     * Lifecycle Funktion onCreate
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)
    }
}
