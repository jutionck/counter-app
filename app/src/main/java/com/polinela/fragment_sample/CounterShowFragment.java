package com.polinela.fragment_sample;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.polinela.fragment_sample.databinding.FragmentCounterBinding;
import com.polinela.fragment_sample.databinding.FragmentCounterShowBinding;

public class CounterShowFragment extends Fragment {
    // viewBinding
    private FragmentCounterShowBinding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentCounterShowBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void notifyShowCounter(int counter) {
        Log.i("test", "notifyShowCounter " + counter);
        binding.counterValue.setText(String.valueOf(counter));
    }
}