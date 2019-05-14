package com.btk.viewmodelsampleapp;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.btk.viewmodelsampleapp.databinding.ActivityMainBinding;

public class LauncherActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private CounterViewModel model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        model = ViewModelProviders.of(this).get(CounterViewModel.class);
        initViews();
    }

    private void initViews() {
        binding.btnClick.setOnClickListener(view -> increatmentCounter());
    }

    private void increatmentCounter() {
        model.increamentCount();
        binding.tvCounter.setText(model.getCount()+"");
    }
}
