package com.yeuristic.example.resourcemigration

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.yeuristic.example.resourcemigration.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(ActivityMainBinding.inflate(layoutInflater).run {
            binding = this
            root
        })

        initListener()
    }

    private fun initListener() {
        binding.button.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v) {
            binding.button -> startActivity(Intent().setClassName(
                BuildConfig.APPLICATION_ID,
                "com.yeuristic.example.dynamicfeature.DynamicActivity"
            ))
        }
    }
}