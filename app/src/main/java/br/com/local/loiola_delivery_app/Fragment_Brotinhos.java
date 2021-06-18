package br.com.local.loiola_delivery_app;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class Fragment_Brotinhos extends Fragment {

   View v;
   private RecyclerView myrecyclerview;
   private List<PizzasBrotinhos> listPizzasBrotinhos;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment__brotinhos, container, false);
        myrecyclerview = (RecyclerView) v.findViewById(R.id.pizzaBro_recyclerview);
        RecyclerPBAdapter recyclerPBAdapter = new RecyclerPBAdapter(getContext(),listPizzasBrotinhos);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerPBAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        listPizzasBrotinhos = new ArrayList<>();
        listPizzasBrotinhos.add(new PizzasBrotinhos("Muçarela","MOLHO DE TOMATE, MUÇARELA, ORÉGANO E AZEITONAS","R$15,90", R.drawable.pizzademussarela));
        listPizzasBrotinhos.add(new PizzasBrotinhos("Nordestina","MOLHO DE TOMATE, CARNE SECA, CEBOLA, MUÇARELA E BACON","R$25,00", R.drawable.pizzanordestina));
        listPizzasBrotinhos.add(new PizzasBrotinhos("Escarola","MOLHO DE TOMATE, ESCAROLA, CEBOLA, CHAMPINGNON E MUÇARELA","R$19,80", R.drawable.pizzadeescarola));
        listPizzasBrotinhos.add(new PizzasBrotinhos("A Moda da Casa","MOLHO DE TOMATE, PRESUNTO, AZEITONAS FATIADAS, BACON E MUÇARELA","R$16,80", R.drawable.modadacasa));
        listPizzasBrotinhos.add(new PizzasBrotinhos("Brócolis","MOLHO DE TOMATE, BRÓCOLIS, CEBOLA, PALMITO E MUÇARELA","R$17,50", R.drawable.pizzadebrocolis));
        listPizzasBrotinhos.add(new PizzasBrotinhos("Peperone","MOLHO DE TOMATE, PEPERONE E MUÇARELA","R$18,00", R.drawable.pizzadepeperoni));

    }
}