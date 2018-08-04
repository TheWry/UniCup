/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minerproblem;

/**
 *
 * @author ryan
 */
public class Mine extends Node {
    int resources;
    boolean depleted;
    public Mine(int index, String tag, int xLoc, int yLoc, int resources) {
        super(index, tag, xLoc, yLoc);
        this.resources=resources;
        depleted=false;
    }
    
    public void deplete(){
        if (!depleted){
            resources--;
            
            if (resources==0){
              depleted=true;  
            }
        }
        else
            System.out.println("Mine already depleted");
    }
    public String getType(){
        return ("mine");
    }
    
}
