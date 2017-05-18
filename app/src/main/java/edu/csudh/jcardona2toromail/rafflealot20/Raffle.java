package edu.csudh.jcardona2toromail.rafflealot20;

import java.util.Random;

/**
 * Created by akajo on 3/12/2017.
 */

public class Raffle {
    Item rafflingitem;
    Ticket []ticket;
    boolean []ticketAviable;
    Date date;

    int ticketcount;



    public Raffle(int numoftickets, int ticketid, int ticketnumber, Date purchase){
        ticket = new Ticket[numoftickets + 1];
        ticket[ticketnumber + 1 ]  = new Ticket(numoftickets, ticketid,ticketnumber, purchase);
        this.ticketcount = numoftickets;

    }


    public void PullaNumber(){
        Random random =new Random();
        int x = random.nextInt() + 1;
        if(ticketAviable[x]!=false) {
            ticketcount--;

        }
        System.out.print(ticket[x]);
    }
}
