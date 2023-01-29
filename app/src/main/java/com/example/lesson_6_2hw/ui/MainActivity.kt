package com.example.lesson_6_2hw.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lesson_6_2hw.adapter.PhotoAdapter
import com.example.lesson_6_2hw.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var adapter: PhotoAdapter
    private lateinit var binding: ActivityMainBinding
    private var photoList = arrayListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        loadData()
        adapter = PhotoAdapter(photoList)
        binding.recycler.adapter = adapter

        binding.btnSend.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra(RESULT, adapter.getData())
            startActivity(intent)
        }
    }

    private fun loadData() {
        photoList.add("https://images.unsplash.com/photo-1568609854939-e6c10445b547?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTR8fGN1dGUlMjBjYXR8ZW58MHx8MHx8&w=1000&q=80")
        photoList.add("https://images.squarespace-cdn.com/content/v1/5a2c764af43b551b489c752d/1519112079060-LH100KCQE4NMOKODMBAN/javacats03Feb20180261.jpg?format=1500w")
        photoList.add("https://cdn.pixabay.com/photo/2016/03/28/12/35/cat-1285634__340.png")
        photoList.add("https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/cute-cat-photos-1593441022.jpg?crop=0.670xw:1.00xh;0.167xw,0&resize=640:*")
        photoList.add("https://cdn.britannica.com/91/181391-050-1DA18304/cat-toes-paw-number-paws-tiger-tabby.jpg")
        photoList.add("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3a/Cat03.jpg/1200px-Cat03.jpg")
        photoList.add("https://www.humanesociety.org/sites/default/files/styles/1240x698/public/2020-07/kitten-510651.jpg?h=f54c7448&itok=ZhplzyJ9")
        photoList.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSM1cDnT1Q5ZrkfLfxiSgFvC2ZsjpngynJGvg&usqp=CAU")
        photoList.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRD_hhL8nu3WjO8gCK-5gCFKJSk-f2ALVSCFCbt49N8k6ywQg4QgCgbdoXR6jiv38qRiXo&usqp=CAU")
        photoList.add("https://c.files.bbci.co.uk/14429/production/_118158928_gettyimages-507245091.jpg")
        photoList.add("https://image.petmd.com/files/styles/863x625/public/orange-tabby-kitten-walking-across-floor.jpg")
        photoList.add("https://i.ytimg.com/vi/jH7e1fDcZnY/maxresdefault.jpg")
        photoList.add("https://image.petmd.com/files/styles/863x625/public/orange-tabby-kitten-walking-across-floor.jpg")
        photoList.add("https://www.hartz.com/wp-content/uploads/2016/12/how_to_stop_your_cat_from_biting_2000x786.jpg")
        photoList.add("https://imagesvc.meredithcorp.io/v3/mm/image?q=60&c=sc&poi=%5B780%2C453%5D&w=2000&h=1000&url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F47%2F2020%2F06%2F26%2Forange-kitten-955480082-2000.jpg")
    }

    companion object {
        const val RESULT = "key"
    }

}