package com.example.lesson_6_2hw.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lesson_6_2hw.ui.MainActivity.Companion.RESULT
import com.example.lesson_6_2hw.adapter.PhotoAdapter
import com.example.lesson_6_2hw.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    private lateinit var adapter: PhotoAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        adapter = PhotoAdapter(arrayListOf())
        binding.recycler.adapter = adapter
        val data = intent.getStringArrayListExtra(RESULT)
        if (data != null)
            adapter.addList(data)
    }
}