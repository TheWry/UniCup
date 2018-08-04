/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minerproblem;

import java.util.ArrayList;

/**
 *
 * @author hmrsas001
 */
public class Calculations {
    
    public int getDistance(int x1, int y1, int x2, int y2){
        int dist = (Math.abs(x1 +x2) + Math.abs(y1 + y2));
        return dist;
    }
    
    public Node nextDestination (Miner miner,ArrayList<Node> list){
        Node currentNode = null;
        if (miner.getType().equals("miner")){
            if (miner.getResourceCount()==0){
               int dist=0;
               
               int i = 0;
               while (list.get(i)!=null){
                   
                   if (list.get(i).type.equals("mine")){
                   if(list.get(i).resources !=0){
                     
                      int newdist = getDistance(miner.xLoc, miner.yLoc,list.get(i).xLoc,list.get(i).yLoc);
                     if (dist ==0){
                            dist = newdist;
                        }
                     if(dist>newdist){
                            dist = newdist;
                            currentNode = list.get(i);
                            
                     }
                    
                   
                   
                   
                   
                   }
               
               }
                   
                   
                   i++;
            }
               
        }
        
    }
        return currentNode;
    
}
}
