import java.util.*;
public class Board{

  public static void main(String[] args){
    int[][] board = new int[4][4];
    int[] number = new int[]{0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

    fillBoard(board, number);
    showBoard(board);

  }


  //private static int[][] the_frame(int[][] vector){

  //}

  public static int[][] fillBoard(int[][] vector, int[] numb){
    numb = shuffle(numb);
    int counter = 0;
    for(int i=0; i<vector.length; i++){
      for(int j=0; j<vector.length; j++){
        vector[i][j] = numb[counter];
        counter++;
      }
    }
    return vector;
  }

  private static int[] shuffle(int[] vector){
    int temp1 =0 ; int temp2 = 0;
    for(int i=0; i<vector.length; i++){
      int rand = (int)(Math.random()*15);
      temp1 = vector[i];
      temp2 = vector[rand];
      vector[i] = temp2;
      vector[rand] = temp1;
    }
    return vector;
  }
//Methods are all currently set to VOID until known method types are determined.
  public static void readInitialBoard(String fileName){

  }

  public static void makeMove(int number){

  }

  public static void showBoard(int[][] vector){
    for(int i=0; i<vector.length; i++){
      System.out.println("|----+----+----+----|");
      for(int j=0; j<vector.length; j++){
        if(j==0) System.out.print("|");
        if(vector[i][j]<10) System.out.print(" ");
        if(vector[i][j] == 0){
          System.out.print("  ");
          if(j<4){
            System.out.print(" |");
          }
        }else{System.out.print(" " + vector[i][j]+" |");}
      }
      System.out.println();
    }
    System.out.println("|----+----+----+----|");
    System.out.println("Legal Commands:");
    System.out.println("help, quit, move #");
  }

  public static void isCorrect(){

  }

}
