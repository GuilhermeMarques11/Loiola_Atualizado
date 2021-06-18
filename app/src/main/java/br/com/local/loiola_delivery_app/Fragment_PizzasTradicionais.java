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


public class Fragment_PizzasTradicionais extends Fragment {

    View v;
    private RecyclerView myrecyclerview;
    private List<PizzasTradicionais> listPizzasTradicionais;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment__pizzas_tradicionais, container, false);
        myrecyclerview = (RecyclerView) v.findViewById(R.id.pizzaTra_recyclerview);
        RecyclerPTAdapter recyclerPTAdapter = new RecyclerPTAdapter(getContext(),listPizzasTradicionais);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerPTAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        listPizzasTradicionais = new ArrayList<>();
        listPizzasTradicionais.add(new PizzasTradicionais("Muçarela","MOLHO DE TOMATE, MUÇARELA, ORÉGANO E AZEITONAS","R$35,90",R.drawable.pizzademussarela));
        listPizzasTradicionais.add(new PizzasTradicionais("Marguerita","MOLHO DE TOMATE, MUÇARELA, MANJERICÃO, PARMESÃO RALADO E TOMATE","R$44,50",R.drawable.pizzademarguerita));
        listPizzasTradicionais.add(new PizzasTradicionais("4 Queijos","MOLHO DE TOMATE, CATUPIRY, MUÇARELA, PROVOLONE E PARMESÃO RALADO","R$39,90",R.drawable.pizzaquatroqueijos));
        listPizzasTradicionais.add(new PizzasTradicionais("Bacon","MOLHO DE TOMATE, MUÇARELA E BACON","R$42,00",R.drawable.pizzadebacon));
        listPizzasTradicionais.add(new PizzasTradicionais("Calabresa","MOLHO DE TOMATE, CALABRESA E CEBOLA","R$35,50",R.drawable.pizzadecalabresa));
        listPizzasTradicionais.add(new PizzasTradicionais("Baiana","MOLHO DE TOMATE, CALABRESA MOÍDA, OVOS, CEBOLA E PIMENTA","R$38,90",R.drawable.pizzabaiana));
        listPizzasTradicionais.add(new PizzasTradicionais("Americana","MOLHO DE TOMATE, PRESUNTO MOÍDO, OVOS, MUÇARELA E BACON","R$40,00",R.drawable.pizzaamericana));
        listPizzasTradicionais.add(new PizzasTradicionais("Bauru","MOLHO DE TOMATE, PRESUNTO, MUÇARELA E TOMATE","R$36,60",R.drawable.pizzadebauru));
        listPizzasTradicionais.add(new PizzasTradicionais("Portuguesa","MOLHO DE TOMATE, PRESUNTO, OVOS, MILHO, ERVILHA, PALMITO, MUÇARELA E BACON","R$34,50",R.drawable.pizzaportuguesa));
        listPizzasTradicionais.add(new PizzasTradicionais("Peperone","MOLHO DE TOMATE, PEPERONE E MUÇARELA","R$38,00",R.drawable.pizzadepeperoni));
        listPizzasTradicionais.add(new PizzasTradicionais("Lombo","MOLHO DE TOMATE, LOMBO E MUÇARELA","R$40,00",R.drawable.pizzadelombo));
        listPizzasTradicionais.add(new PizzasTradicionais("Peru","MOLHO DE TOMATE, PEITO DE PERU E MUÇARELA","R$45,80",R.drawable.pizzadeperu));
        listPizzasTradicionais.add(new PizzasTradicionais("Nordestina","MOLHO DE TOMATE, CARNE SECA, CEBOLA, MUÇARELA E BACON","R$50,00",R.drawable.pizzanordestina));
        listPizzasTradicionais.add(new PizzasTradicionais("Atum","MOLHO DE TOMATE, ATUM E MUÇARELA","R$30,00",R.drawable.pizzadeatum));
        listPizzasTradicionais.add(new PizzasTradicionais("Camarão","MOLHO DE TOMATE, CAMARÃO, PALMITO E MUÇARELA","R$45,00",R.drawable.pizzadecamarao));
        listPizzasTradicionais.add(new PizzasTradicionais("Escarola","MOLHO DE TOMATE, ESCAROLA, CEBOLA, CHAMPINGNON E MUÇARELA","R$39,80",R.drawable.pizzadeescarola));
        listPizzasTradicionais.add(new PizzasTradicionais("Brócolis","MOLHO DE TOMATE, BRÓCOLIS, CEBOLA, PALMITO E MUÇARELA","R$37,50",R.drawable.pizzadebrocolis));
        listPizzasTradicionais.add(new PizzasTradicionais("Palmito","MOLHO DE TOMATE, PALMITO E MUÇARELA","R$50,90",R.drawable.pizzadepalmito));
        listPizzasTradicionais.add(new PizzasTradicionais("Frango com Catupiry","MOLHO DE TOMATE, FRANGO E CATUPIRY","R$34,50",R.drawable.pizzadefrangocomcatupiry));
        listPizzasTradicionais.add(new PizzasTradicionais("A Moda da Casa","MOLHO DE TOMATE, PRESUNTO, AZEITONAS FATIADAS, BACON E MUÇARELA","R$36,80",R.drawable.modadacasa));
    }
}