package com.example.demo;


import org.springframework.cglib.core.Local;

import java.util.ArrayList;


public class TallerFuncional {

    static double suma (double s1 , double s2){
        return (s1 + s2);
    }

    static double resta (double r1 , double r2){
        return (r1 - r2);
    }

    static double multiplicar (double m1,double m2){

       double resultado = 0;

        for (int i = 0 ; i < m2 ; i ++){
            resultado = suma(resultado,m1);
        }

        return resultado;
    }

    static ArrayList dividir (double d1 , double d2){
        double resultado = 0.0;
        double resto = 0;
        int count = 0;
        ArrayList list = new ArrayList<>();



        for (int i = 0; multiplicar(d2,i) <= d1; i++) {

            if ( resta( multiplicar(d2,i+1), d1)== 0) {

                 resultado = i + 1;
                list.add(resultado);
                list.add(resto);
                return list;


            }

            if (resta( multiplicar(d2,i+1), d1)> 0){

                resultado = i;

                resto = resta(d1,multiplicar(d2,i));

                list.add(resultado);
                list.add(resto);
                return list;
            }


        }

        return list;

    }



    public static void main(String[] args) {
        System.out.println(dividir(5,2));
    }


}