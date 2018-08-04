
package minerproblem;

/**
 *
 * @author ryan
 */
public class Node {
    int index;
    String tag;
    int xLoc;
    int yLoc;
    String type;
    public Node(int index, String tag, int xLoc, int yLoc){
        this.index=index;
        this.tag=tag;
        this.xLoc=xLoc;
        this.yLoc=yLoc;
    }
    public String getTag(){
        return tag;
    }
    public String getType(){
        return type;
    }
    
}
