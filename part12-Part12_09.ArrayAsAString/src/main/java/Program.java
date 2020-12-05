
import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        int rows = 2;
        int columns = 3;
        int[][] matrix = new int[rows][columns];
        matrix[0][1] = 5;
        matrix[1][0] = 3;
        matrix[1][2] = 7;
        System.out.println(arrayAsString(matrix));
    }
    public static String arrayAsString(int[][] array){
       // StringBuilder numbers = new StringBuilder();
        String noSpace = "";
        
        
        for(int row = 0; row < array.length; row++){
            for(int col = 0; col < array[row].length; col++){
                int value = array[row][col];
                noSpace = noSpace + value ;
            }
            noSpace = noSpace + "\n";
        }
        return noSpace;
    }

}