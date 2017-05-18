package edu.csudh.jcardona2toromail.rafflealot20;

/**
 * Created by akajo on 3/3/2017.
 */

public class Item {
    private String itemNAME;
    int numberoftickets;
    Date startdate ,enddate;
    String type;

    public Item(String itemNAME, int numberoftickets, Date startdate, Date enddate, String type) {
        this.itemNAME = itemNAME;
        this.numberoftickets = numberoftickets;
        this.startdate = startdate;
        this.enddate = enddate;
        this.type = type;
    }

    public String getItemNAME() {
        return itemNAME;
    }

    public void setItemNAME(String itemNAME) {
        this.itemNAME = itemNAME;
    }

    public int getNumberoftickets() {
        return numberoftickets;
    }

    public void setNumberoftickets(int numberoftickets) {
        this.numberoftickets = numberoftickets;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemNAME='" + itemNAME + '\'' +
                ", numberoftickets=" + numberoftickets +
                ", startdate=" + startdate +
                ", enddate=" + enddate +
                ", type='" + type + '\'' +
                '}';
    }
}
