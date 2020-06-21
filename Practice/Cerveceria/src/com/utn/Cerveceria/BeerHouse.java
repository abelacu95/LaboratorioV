package com.utn.Cerveceria;

import java.util.ArrayList;
import java.util.List;

public class BeerHouse {

    private List<Integer> stock = null;
    private boolean available = false;

    public BeerHouse(){
        this.stock = new ArrayList<Integer>();
    }


    public synchronized void put(int newBeer){

        while( available && stock.size() == 100 ){
            try{
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.stock.add(newBeer);
        available = true;
        notifyAll();
        System.out.println("Producer - put: " + newBeer);
    }

    public synchronized void get()
    {
        while( !available && stock.size() == 0 ){
            try{
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumer - get: " + stock.get(this.stock.size()-1));
        stock.remove(this.stock.size()-1);
        available = false;
        notifyAll();
    }



    public int size(){
        return this.stock.size();
    }

}
