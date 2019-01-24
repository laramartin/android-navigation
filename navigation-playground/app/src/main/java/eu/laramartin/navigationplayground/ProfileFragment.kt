package eu.laramartin.navigationplayground


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation

class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_profile, container, false)

        val isTablet = context!!.resources.getBoolean(R.bool.isTablet)

        if (isTablet) {
//            val navHostFragment = fragmentManager!!.findFragmentById(R.id.nav_container_profile)

//            val navController = navHostFragment!!.findNavController()


            view.findViewById<TextView>(R.id.settings_textview).setOnClickListener(
                Navigation.createNavigateOnClickListener(R.id.settingsFragment)
            )

            view.findViewById<TextView>(R.id.rate_textview).setOnClickListener(
                Navigation.createNavigateOnClickListener(R.id.rateFragment)
            )

        } else {
//            val navHostFragment = fragmentManager!!.findFragmentById(R.id.nav_container)

            view.findViewById<TextView>(R.id.settings_textview).setOnClickListener(
                Navigation.createNavigateOnClickListener(R.id.settingsFragment)
            )
            view.findViewById<TextView>(R.id.rate_textview).setOnClickListener(
                Navigation.createNavigateOnClickListener(R.id.rateFragment)
            )
        }

        return view
    }
}
