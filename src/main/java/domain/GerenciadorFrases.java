package main.java.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GerenciadorFrases {
    private List<String> frases;


    public GerenciadorFrases(){
        this.frases = new ArrayList<>(List.of("O sucesso é a soma de pequenos esforços repetidos dia após dia.",
                "A melhor maneira de prever o futuro é criá-lo.",
                "A persistência é o caminho êxito."));
    }

    public void adicionarFrase(String frase){
        frases.add(frase);
    }

    public String sortearFrase(){
        if(frases.size() == 0){
            return "SEM FRASES";
        }

        Random random = new Random();

        int indiceAleatorio = random.nextInt(frases.size());

        return frases.get(indiceAleatorio);
    }
}
