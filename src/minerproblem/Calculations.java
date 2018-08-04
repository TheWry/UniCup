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
    
     int totaldistance = 0;
    
    public int getDistance(int x1, int y1, int x2, int y2){
        int dist = (Math.abs(x1 +x2) + Math.abs(y1 + y2));
        return dist;
    }
    
    public Node nextDestination (Miner miner,ArrayList<Node> list){
        Node currentNode = null;
         Node currentNode2 = null;
        
            if (miner.getResourceCount()==0){
               int dist=0;
               
               int i = 0;
               while (list.get(i)!=null){
                   
                   if (list.get(i).type.equals("mine")){
                   if(list.get(i).resources !=0){
                     
                      int newdist = getDistance(miner.xLoc, miner.yLoc,list.get(i).xLoc,list.get(i).yLoc);
                     if (dist ==0){
                            dist = newdist;
                            currentNode = list.get(i);
                            
                        }
                     if(dist>newdist){
                            dist = newdist;
                            currentNode = list.get(i);
                            
                     }
                    
                   
                   
                   
                   
                   }
               
               }
                   
                   
                   i++;
            }
               
        totaldistance = totaldistance + dist;
        
    }
            
            
            
            
            if (miner.getResourceCount()==miner.getMax()){
               int dist=0;
               
               int i = 0;
               while (list.get(i)!=null){
                   
                   if (list.get(i).type.equals("factory")){
                   if(miner.currentResources.contains(list.get(i).tag)){
                     
                      int newdist = getDistance(miner.xLoc, miner.yLoc,list.get(i).xLoc,list.get(i).yLoc);
                     if (dist ==0){
                            dist = newdist;
                            currentNode = list.get(i);
                        }
                     if(dist>newdist){
                            dist = newdist;
                            currentNode = list.get(i);
                            
                     }
                    
                   
                   
                   
                   
                   }
               
               }
                   
                   
                   i++;
            }
               
        
        totaldistance = totaldistance + dist;
    }
            else if(miner.getResourceCount()<miner.getMax() && miner.getResourceCount()!=0){
               int dist=0;
               
               int i = 0;
               int dist2 = 0;
               while (list.get(i)!=null){
                   
                   if (list.get(i).type.equals("mine")){
                   if(list.get(i).resources !=0){
                     
                      int newdist = getDistance(miner.xLoc, miner.yLoc,list.get(i).xLoc,list.get(i).yLoc);
                     if (dist ==0){
                            dist = newdist;
                            currentNode = list.get(i);
                            
                        }
                     if(dist>newdist){
                            dist = newdist;
                            currentNode = list.get(i);
                            
                     }
                    
                   
                   
                   
                   
                   }
               
               }
                   if(list.get(i).type.equals("factory")){
                       int newdist = getDistance(miner.xLoc, miner.yLoc,list.get(i).xLoc,list.get(i).yLoc);
                     if (dist2 ==0){
                            dist2 = newdist;
                            currentNode2 = list.get(i);
                            
                        }
                     if(dist2>newdist){
                            dist2 = newdist;
                            currentNode2 = list.get(i);
                            
                     }
                       
                   }
                   
                   if (dist<dist2){
                       currentNode = currentNode;
                   }else{
                       dist=dist2;
                       currentNode = currentNode2;
                   }
                   i++;
            }
               
        totaldistance = totaldistance + dist;
        
    }
        
            return currentNode;
        
}
}
