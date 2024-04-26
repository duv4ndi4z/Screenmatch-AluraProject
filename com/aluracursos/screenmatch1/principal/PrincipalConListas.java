package com.aluracursos.screenmatch1.principal;

import com.aluracursos.screenmatch1.modelos.Pelicula;
import com.aluracursos.screenmatch1.modelos.Serie;
import com.aluracursos.screenmatch1.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalConListas {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto",2021);
        miPelicula.evalua(9);
        Serie casaDragon = new Serie("La casa del Dragon",2022);
        casaDragon.evalua(7);
        Pelicula otraPelicula = new Pelicula("Matrix",1998);
        otraPelicula.evalua(8);
        var peliculaDeBruno = new Pelicula("El señor de los anillos",2001);
        peliculaDeBruno.evalua(9);
        Serie lost = new Serie("Lost", 2000);
        lost.evalua(9);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(miPelicula);
        lista.add(peliculaDeBruno);
        lista.add(otraPelicula);
        lista.add(lost);
        lista.add(casaDragon);



        for (Titulo item:lista){
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion()>2){
                System.out.println(pelicula.getClasificacion());
            }

        }

        List<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Penélope Cruz");
        listaDeArtistas.add("Antonio Banderas");
        listaDeArtistas.add("Ricardo Darín");
        System.out.println(listaDeArtistas);

        Collections.sort(listaDeArtistas);
        System.out.println("Lista de artistas ordenada: " + listaDeArtistas);

        Collections.sort(lista);
        System.out.println("Lista de titulos ordenada "+lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("Lista ordenada por fecha: "+lista);
    }
}
