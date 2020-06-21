package com.utn.Cerveceria;

public class BeerProducer extends Thread{

    BeerHouse beerHouse;
    private int number;

    public BeerProducer(BeerHouse beerHouse, int number) {
        this.beerHouse = beerHouse;
        this.number = number;
    }


    @Override
    public void run() {

        for (int i = 1; i <= 100; i++) {
            beerHouse.put(i);
        }

    }
}
