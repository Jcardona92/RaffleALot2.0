package edu.csudh.jcardona2toromail.rafflealot20;

/**
 * Created by akajo on 3/4/2017.
 */

public class Ticket {

    private int Numoftickets, ticketid, ticketnumber;
    private Date purchase;

    public Ticket(int numoftickets, int ticketid, int ticketnumber, Date purchase) {
        Numoftickets = numoftickets;
        this.ticketid = ticketid;
        this.ticketnumber = ticketnumber;
        this.purchase = purchase;
    }
}
