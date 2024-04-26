package com.aluracursos.screenmatch1.calculos;

public class FiltroRecomendaciones {
    public void filtrar(Clasificacion clasificacion){
        if (clasificacion.getClasificacion()>4){
            System.out.println("Clasificacion muy buena en el momento");
            } else if (clasificacion.getClasificacion() >=2){
                    System.out.println("Popular en el momento");
            } else {
                System.out.println("Colocalo en tu lista para verlo después");
            }
        }
    }

