package com.yeuristic.example.dynamicfeature

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.yeuristic.example.dynamicfeature.databinding.ActivityDynamicDataBindingBinding

class DynamicDataBindingActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var activityDynamicDataBindingBinding: ActivityDynamicDataBindingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityDynamicDataBindingBinding = ActivityDynamicDataBindingBinding.inflate(layoutInflater).apply {
            viewModel = DynamicDataBindingViewModel()
        }
        setContentView(activityDynamicDataBindingBinding.root)

        activityDynamicDataBindingBinding.buttonToggle.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v) {
            activityDynamicDataBindingBinding.buttonToggle -> activityDynamicDataBindingBinding.viewModel!!.toggle = !activityDynamicDataBindingBinding.viewModel!!.toggle
        }
    }
}