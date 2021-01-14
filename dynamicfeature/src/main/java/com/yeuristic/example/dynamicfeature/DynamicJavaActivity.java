package com.yeuristic.example.dynamicfeature;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;

import com.yeuristic.example.dynamicfeature.databinding.ActivityDynamicJavaBinding;

public class DynamicJavaActivity extends AppCompatActivity {

    private ActivityDynamicJavaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDynamicJavaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.imageView1.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_dynamic_feed_24px));
        binding.imageView2.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_foundation_24px));
        binding.textView.setText(R.string.title_dynamicfeature);
    }
}