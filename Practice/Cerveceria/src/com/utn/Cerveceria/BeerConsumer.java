package com.utn.Cerveceria;

public class BeerConsumer extends Thread {

    BeerHouse beerHouse;
    private int number;

    public BeerConsumer(BeerHouse beerHouse, int number) {
        this.beerHouse = beerHouse;
        this.number = number;
    }


    @Override
    public void run() {

        while (beerHouse.size() > 0){

            beerHouse.get();
        }

    }
}
