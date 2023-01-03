package com.yigitb.foodapp.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.yigitb.foodapp.data.entity.Yemekler;
import com.yigitb.foodapp.databinding.CardviewSepetTasarimBinding;

import java.util.List;

public class YemekAdapter extends RecyclerView.Adapter<YemekAdapter.CardTasarimTutucu> {
    private Context mContext;
    private List<Yemekler> yemeklerListesi;

    public YemekAdapter(Context mContext, List<Yemekler> yemeklerListesi) {
        this.mContext = mContext;
        this.yemeklerListesi = yemeklerListesi;
    }


    public class CardTasarimTutucu extends RecyclerView.ViewHolder {
        private CardviewSepetTasarimBinding binding;

        public CardTasarimTutucu(CardviewSepetTasarimBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

    }


    @NonNull
    @Override
    public CardTasarimTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardviewSepetTasarimBinding binding = CardviewSepetTasarimBinding
                .inflate(LayoutInflater.from(mContext)
                        , parent, false);

        return new CardTasarimTutucu(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CardTasarimTutucu holder, int position) {
        Yemekler yemek = yemeklerListesi.get(position);
        CardviewSepetTasarimBinding t = holder.binding;
        t.urunBaslik.setText(yemek.getYemek_ad());
        t.urunFiyat.setText(yemek.getYemek_fiyat());
        t.urunFotosu.setImageResource(Integer.parseInt(yemek.getResim_adi()));

    }

    @Override
    public int getItemCount() {
        return yemeklerListesi.size();
    }


}
