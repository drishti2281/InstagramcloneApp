package com.example.instagramcloneapp

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil.setContentView
import androidx.navigation.NavController
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI.setupActionBarWithNavController
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.instagramcloneapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
lateinit var binding : ActivityMainBinding
lateinit var controller: NavController
lateinit var appBarConfiguration : AppBarConfiguration
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)
    var storieslist: MutableList<CreateStory> = mutableListOf()
    storieslist.add(CreateStory("Ritika"))
    storieslist.add(CreateStory("Navpreet"))
    storieslist.add(CreateStory("Tanya"))
    storieslist.add(CreateStory("Palak"))
    storieslist.add(CreateStory("Lovpreet"))
//    binding.recyclerView.adapter = StoryRecycler(storieslist)
//    binding.recyclerView.layoutManager =
//        LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

    controller = findNavController(R.id.fragment)

    appBarConfiguration = AppBarConfiguration(
        setOf(
            R.id.homeFragment,
            R.id.searchFragment,
            R.id.feedPostFragment,
            R.id.reelsFragment,
            R.id.profileFragment
        )
    )
//  setupActionBarWithNavController(controller, appBarConfiguration)

    binding.bottomNavigation.setOnItemSelectedListener {
        when (it.itemId) {
            R.id.navigation_home -> {
                controller.navigate(R.id.homeFragment)
            }

            R.id.navigation_search -> {
                controller.navigate(R.id.searchFragment)
            }

            R.id.navigation_post -> {
                controller.navigate(R.id.feedPostFragment)
            }

            R.id.navigation_reels -> {
                controller.navigate(R.id.reelsFragment)
            }

            R.id.navigation_profile -> {
                controller.navigate(R.id.profileFragment)
            }
        }
        return@setOnItemSelectedListener true
    }
    var addOnDestinationChangedListener =
        controller.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id) {
                R.id.homeFragment -> binding.bottomNavigation.menu.getItem(0).isChecked = true
                R.id.searchFragment -> binding.bottomNavigation.menu.getItem(1).isChecked = true
                R.id.feedPostFragment -> binding.bottomNavigation.menu.getItem(2).isChecked = true
                R.id.reelsFragment -> binding.bottomNavigation.menu.getItem(3).isChecked = true
                R.id.profileFragment -> binding.bottomNavigation.menu.getItem(4).isChecked = true
            }
        }
}

}