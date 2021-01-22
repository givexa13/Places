package com.example.places

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)

        val placeList = ArrayList<Places>()
        placeList.add(Places(1, "https://media.cntraveler.com/photos/5cb63a5211a45eb1f830373c/master/pass/Wulingyuan-Scenic-Area-China_GettyImages-159228516.jpg"))
        placeList.add(Places(2, "https://cdn.cnn.com/cnnnext/dam/assets/190417162012-10-earth-beautiful-places.jpg"))
        placeList.add(Places(3, "https://i.pinimg.com/originals/b8/94/53/b894532b675a98ab75380cbdb9214421.jpg"))
        placeList.add(Places(4, "https://www.journalofnomads.com/wp-content/uploads/2019/03/Tusheti-Best-places-to-visit-Georgia.jpg"))
        placeList.add(Places(5, "https://www.beautifullife.info/wp-content/uploads/2017/08/02/arches_national_park_02.jpg"))
        placeList.add(Places(6, "https://media.timeout.com/images/105679731/image.jpg"))
        placeList.add(Places(7, "https://i.pinimg.com/originals/ad/1b/6e/ad1b6e4ea812b2a79361669441532566.jpg"))
        placeList.add(Places(8, "https://bigseventravel.com/wp-content/uploads/2020/10/the-azores.jpg"))

        val placesAdapter = PlacesAdapter(placeList)

        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = placesAdapter

    }
}