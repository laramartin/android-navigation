package eu.laramartin.navigationplayground

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_container) as NavHostFragment
//
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_nav_view)
            .setupWithNavController(navController = navHostFragment.navController)

        navHostFragment.navController.addOnDestinationChangedListener { _, destination, _ ->

            supportActionBar!!.title = destination.label
        }
    }

}
