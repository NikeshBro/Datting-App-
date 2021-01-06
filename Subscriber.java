package com.company;

import java.util.ArrayList;
public class Subscribers  extends  Profile{


    ArrayList<String> subscribers = new ArrayList<String>();
   private String subscriber;

    public Subscribers( String  subscriber) {
        super();
        this.subscriber = subscriber;
    }

    public boolean swipeLeft(){


        if ( getAge() < 18){
            System.out.println(" Awww, i dont like you ");
        }
        return false;


    }

    public boolean swipeRight(){
        if ( getAge() > 19){
            System.out.println(" Aww, i like you ");
        }
        return  true;


    }

    public void addSubscriber( String name){
        subscribers.add(name);
        System.out.println(" Newly swiped person is " + name );
    }



}
