package br.com.etec.myapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class BikesNovasFragment extends Fragment {

    private List<BikeNova> lstBikeNova;
    RecyclerView idRecBikesNovas;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bikes_novas, container, false);

        idRecBikesNovas = view.findViewById(R.id.idRecBikesNovas);

        //Carregando os objetos na lista
        lstBikeNova = new ArrayList<>();
        lstBikeNova.add(new BikeNova("Vintage",R.drawable.vintage));
        lstBikeNova.add(new BikeNova("Bikea",R.drawable.bikea));
        lstBikeNova.add(new BikeNova("Bikeb",R.drawable.bikeb));
        lstBikeNova.add(new BikeNova("Bikec",R.drawable.bikec));
        lstBikeNova.add(new BikeNova("Biked",R.drawable.biked));
        lstBikeNova.add(new BikeNova("Bikee",R.drawable.bikee));
        lstBikeNova.add(new BikeNova("Bikef",R.drawable.bikef));
        lstBikeNova.add(new BikeNova("Bikeg",R.drawable.bikeg));
        lstBikeNova.add(new BikeNova("Bikeh",R.drawable.bikeh));
        lstBikeNova.add(new BikeNova("Bikei",R.drawable.bikei));
        lstBikeNova.add(new BikeNova("Bikej",R.drawable.bikej));

        //Carregando o adaptador
        RecyclerAdapterBikeNova adapterBikeNova = new RecyclerAdapterBikeNova(getContext(),lstBikeNova);

        idRecBikesNovas.setLayoutManager(new GridLayoutManager(getContext(),2));

        idRecBikesNovas.setAdapter(adapterBikeNova);




        return view;
    }
}