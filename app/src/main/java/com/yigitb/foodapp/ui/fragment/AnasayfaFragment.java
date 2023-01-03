package com.yigitb.foodapp.ui.fragment;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yigitb.foodapp.R;
import com.yigitb.foodapp.data.entity.Yemekler;
import com.yigitb.foodapp.databinding.FragmentAnasayfaBinding;
import com.yigitb.foodapp.ui.adapter.YemekAdapter;

import java.util.ArrayList;

import retrofit2.Retrofit;


public class AnasayfaFragment extends Fragment {
    private FragmentAnasayfaBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentAnasayfaBinding.inflate(inflater, container, false);


        ((AppCompatActivity) getActivity()).setSupportActionBar(binding.toolbarAnasayfa);

        binding.buttonSepeteGit.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.anasayfadanSepeteGecis);

        });

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));

        ArrayList<Yemekler> yemeklerListesi = new ArrayList<>();
        Yemekler y1 = new Yemekler(1, "ayran", "R.drawable.ayran", 3);
        Yemekler y2 = new Yemekler(2, "ayran2", "R.drawable.ayran", 3);
        Yemekler y3 = new Yemekler(3, "ayran3", "R.drawable.ayran", 3);

        yemeklerListesi.add(y1);
        yemeklerListesi.add(y2);
        yemeklerListesi.add(y3);

        YemekAdapter adapter = new YemekAdapter(requireContext(), yemeklerListesi);
        binding.recyclerView.setAdapter(adapter);





        return binding.getRoot();

    }
}