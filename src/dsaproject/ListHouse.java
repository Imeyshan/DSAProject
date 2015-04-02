/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dsaproject;

/**
 *
 * @author Imeyshan
 */
public class ListHouse implements IListTable{

    private int LotNumber = 0;
    private String FirstName = null;
    private String LastName = null;
    private double Price = 0;
    private int SquareFeet = 0;
    private int NoOFBedRooms = 0;

    /**
     * @return the LotNumber
     */
    public int getLotNumber() {
        return LotNumber;
    }

    /**
     * @param LotNumber the LotNumber to set
     */
    public void setLotNumber(int LotNumber) {
        this.LotNumber = LotNumber;
    }

    /**
     * @return the FirstName
     */
    public String getFirstName() {
        return FirstName;
    }

    /**
     * @param FirstName the FirstName to set
     */
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    /**
     * @return the LastName
     */
    public String getLastName() {
        return LastName;
    }

    /**
     * @param LastName the LastName to set
     */
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    /**
     * @return the Price
     */
    public double getPrice() {
        return Price;
    }

    /**
     * @param Price the Price to set
     */
    public void setPrice(double Price) {
        this.Price = Price;
    }

    /**
     * @return the SquareFeet
     */
    public int getSquareFeet() {
        return SquareFeet;
    }

    /**
     * @param SquareFeet the SquareFeet to set
     */
    public void setSquareFeet(int SquareFeet) {
        this.SquareFeet = SquareFeet;
    }

    /**
     * @return the NoOFBedRooms
     */
    public int getNoOFBedRooms() {
        return NoOFBedRooms;
    }

    /**
     * @param NoOFBedRooms the NoOFBedRooms to set
     */
    public void setNoOFBedRooms(int NoOFBedRooms) {
        this.NoOFBedRooms = NoOFBedRooms;
    }

    @Override
    public ListHouse Copy() {
            
       ListHouse list=new ListHouse();
       return list;
        
        
    }


    
    @Override
    public int compareTo(ListHouse list) {
       
        if (list.getLotNumber()>this.getLotNumber()) {
            
            return -1;
        }
        else if (list.getLotNumber()==this.getLotNumber()) {
            
            return 0;
        }
        else
        {
            return  1;
        }
                  
        
 
       
    }
    
 

}

