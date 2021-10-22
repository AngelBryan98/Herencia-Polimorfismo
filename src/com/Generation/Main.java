package com.Generation;

import com.Generation.animales.Animal;
import com.Generation.animales.Ave;
import com.Generation.animales.Perro;
import com.Generation.uber.UberDriver;
import com.Generation.uber.ConductorUberBlack;


public class Main {

    public static void main(String[] args) {

        UberDriver driver = new UberDriver();
        ConductorUberBlack driverBlack = new ConductorUberBlack();

        System.out.println("Uber");
        System.out.println(driver.calculatePrice(6));

        System.out.println("Uber Black");
        System.out.println(driverBlack.calculatePrice(6));

        /*
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
 */
    }
}
