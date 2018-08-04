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
public class Coordinate {
    int x;
    int y;
    char value;
    
    
    public Coordinate(int x, int y){
        this.x=x;
        this.y=y;
        value='#';
    }
    public Coordinate(int x, int y, char value){
        this.x=x;
        this.y=y;
        this.value=value;
    }
    public void setValue(char value){
        this.value=value;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getValue(){
        return value;
    }
    public int getDistance(Coordinate c){
        return (Math.abs(c.getX()-this.x)+Math.abs(c.getY()-this.y));
    }
}
