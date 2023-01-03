package com.yigitb.foodapp.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.yigitb.foodapp.R;
import com.yigitb.foodapp.databinding.FragmentDetayBinding;

import java.util.ArrayList;

public class DetayFragment extends Fragment {
    private FragmentDetayBinding binding;
    private String[] adetSayisi2 = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"};
    private Spinner spinnerAdet;
    private ArrayAdapter<Integer> dataAdapterForAdet;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentDetayBinding.inflate(inflater, container, false);




        return binding.getRoot();
    }


}