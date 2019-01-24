package eu.laramartin.navigationplayground

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.Navigation

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        view.findViewById<Button>(R.id.button_home).setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_homeFragment_to_firstLevelFragment)
        )

        view.findViewById<TextView>(R.id.text_bottom_nav).setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_homeFragment_to_profileFragment)
        )

        return view
    }
}
