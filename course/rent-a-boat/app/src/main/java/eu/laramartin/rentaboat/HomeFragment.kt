package eu.laramartin.rentaboat


import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v7.widget.Toolbar
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val navHostFragment = childFragmentManager.findFragmentById(R.id.fragment) as NavHostFragment

        view.findViewById<BottomNavigationView>(R.id.bottomNavigationView)
            .setupWithNavController(navController = navHostFragment.navController)

        val toolbar = view.findViewById<Toolbar>(R.id.toolbar)

        navHostFragment.navController.addOnDestinationChangedListener { _, destination, _ ->
            toolbar.title = destination.label
        }

        return view
    }
}
