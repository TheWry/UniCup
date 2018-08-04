
package minerproblem;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ryan
 */
public class MinerProblem {
    static int workers=0;
    static char[][] map;
    static ArrayList<Coordinate> mines;
    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        mines = new ArrayList<Coordinate>();
        Scanner sc= new Scanner(System.in);
        workers = Integer.parseInt(sc.nextLine());
        String currentLine = sc.nextLine();
        int lineNo=0;
        while (!currentLine.equals("")){
            //char[] widthChars=currentLine.toCharArray();
            map[lineNo]=currentLine.toCharArray();
            lineNo++;
            currentLine=sc.nextLine();
        }
        
        for (int i=0;i<map.length/2;i++){
            char[] temp = map[i];
            map[i]=map[map.length-i-1];
            map[map.length-i-1]=temp;            
        }
        for (int i=0;i<map.length;i++){
            for (int j=0;j<map[0].length;j++){
                if (map[i][j]!='#'){
                    mines.add(new Coordinate(i, j, map[i][j]));
                    
                }
            }
        }
        
    }
    
}
