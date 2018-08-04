/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minerproblem;

import java.util.ArrayList;

/**
 *
 * @author ryan
 */

public class Miner {
    int maxResources;
    String type;
    int xLoc;
    int yLoc;
    ArrayList<String> currentResources;
    int cost;
    public Miner(String type){
        
       xLoc=0;
       yLoc=0;
       this.type=type;
       currentResources = new ArrayList<String>();
       if (type.equals("miner")){
           maxResources=1;
           
       }
       
       else if (type.equals("excavator")){
           maxResources=3;
       }
           
       else if (type.equals("hauler")){
           maxResources=5;
       }
       else
           System.out.println("Error, incorrect miner type!");
    }
    public void Move(int xDest, int yDest){
        xLoc=xDest;
        yLoc=yDest;
        cost=cost+(Math.abs(xDest-xLoc)+Math.abs(yDest-yLoc));
    }
    public int getXLoc(){
        return xLoc;
    }
    public int getYLoc(){
        return yLoc;
    }
    public int getResourceCount(){
        return currentResources.size();
    }
    public boolean hasResource(String resource){
        return currentResources.contains(resource);
    }
    public void pickUp(String resource){
        currentResources.add(resource);
    }
    public int getMax(){
        return maxResources;
    }
    public void deposit(String resource){
        currentResources.remove(resource);
    }
    public int getCost(){
        return cost;
    }
    public String getType(){
        return type;
    }
    public ArrayList<String> getResources(){
        return currentResources;
    }
    
    
}
