package com.utn.Cerveceria;

public class Main {

    public static void main(String[] args) {

        BeerHouse beerHouse = new BeerHouse();

        BeerProducer bp1 = new BeerProducer(beerHouse, 1);
        //BeerProducer bp2 = new BeerProducer(beerHouse, 2);

        BeerConsumer bc1 = new BeerConsumer(beerHouse, 1);
        BeerConsumer bc2 = new BeerConsumer(beerHouse, 2);
        BeerConsumer bc3 = new BeerConsumer(beerHouse, 3);
        BeerConsumer bc4 = new BeerConsumer(beerHouse, 4);


        bp1.start();
        //bp2.start();
        bc1.start();
        bc2.start();
        //bc3.start();
        //bc4.start();






    }
}
