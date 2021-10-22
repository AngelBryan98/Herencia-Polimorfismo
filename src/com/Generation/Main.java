package com.Generation;

import com.Generation.animales.Animal;
import com.Generation.animales.Ave;
import com.Generation.animales.Perro;

public class Main {

    public static void main(String[] args) {

        System.out.println("-------------------------Ave 1-------------------------------");
        Ave ave = new Ave("Petirrojo");
        ave.comer();
        ave.comunicarse();
        ave.ponerHuevo();
        ave.hacerNido();

        System.out.println("-------------------------Ave 2-------------------------------");
        Ave ave2 = new Ave("Kazooie");
        System.out.println(ave2.getNombre());

        System.out.println("-------------------------Perro-------------------------------");
        Perro lomito = new Perro("Pulgas");
        lomito.jugar();
        lomito.comer();
        lomito.ladrar();
    }
}
