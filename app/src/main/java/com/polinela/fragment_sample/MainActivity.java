package com.polinela.fragment_sample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.polinela.fragment_sample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    // defined binding
    private ActivityMainBinding activityMainBinding;
    private CounterFragment counterFragment;
    private CounterShowFragment counterShowFragment;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());
        counterFragment = new CounterFragment();
        counterShowFragment = new CounterShowFragment();
        // Memanggil fragment Counter
        getSupportFragmentManager()
                .beginTransaction()
                .add(activityMainBinding.counterFragment.getId(), counterFragment, null)
                .commit();

        // Memanggil fragment Counter Show
        getSupportFragmentManager()
                .beginTransaction()
                .add(activityMainBinding.counterShowFragment.getId(),counterShowFragment, null)
                .commit();

    }

    public void notifyIncrease() {
        counter++; // counter = counter + 1
        Log.i("test", "notifyIncrease: " + counter);
        counterShowFragment.notifyShowCounter(counter);
    }

    public void notifyDecrease() {
        counter--; // counter = counter - 1
        Log.i("test", "notifyDecrease: " + counter);
        counterShowFragment.notifyShowCounter(counter);
    }
}