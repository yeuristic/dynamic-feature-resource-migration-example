package com.yeuristic.example.dynamicfeature

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import com.yeuristic.example.dynamicfeature.databinding.ActivityDynamicBinding

class DynamicActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityDynamicBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(ActivityDynamicBinding.inflate(layoutInflater).run {
            binding = this
            root
        })

        binding.textView.text = getString(R.string.title_dynamicfeature)
        binding.imageView1.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_dynamic_feed_24px))
        binding.imageView2.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_foundation_24px))

        binding.button.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v) {
            binding.button -> startActivity(Intent(this, DynamicJavaActivity::class.java))
        }
    }
}