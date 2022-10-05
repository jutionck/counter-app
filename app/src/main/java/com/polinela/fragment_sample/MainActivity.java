package com.polinela.fragment_sample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.polinela.fragment_sample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // defined binding
    private ActivityMainBinding activityMainBinding;
    private CounterShowFragment counterShowFragment;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());

        // Memanggil fragment Counter
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.counter_fragment, CounterFragment.class, null)
                .commit();

        // Memanggil fragment Counter Show
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.counter_show_fragment, CounterShowFragment.class, null)
                .commit();

        counterShowFragment = new CounterShowFragment();
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