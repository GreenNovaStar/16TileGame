# 16TileGame

Purpose:
There is a famous puzzle called the 15-puzzle. In this puzzle there is a frame that could hold up to 16 tiles in a 4x4 configuration, but the frame contains only 15 tiles where each tile is labeled with a number between 1 and 15. Since one of the location is empty, it is possible to slide another tile (from above/below/right/left of the empty location) into this location. The goal of the puzzle is to reach the point where the numbers are organized so that they read (top to bottom, left to right) 1, 2, 3, ... , 15, space.

Create a file called Board.java which will be the "guts" of the project. This class should contain a private field int[][] the_frame (a 4x4 int array), and the following public methods with exact name and parameter lists and types:
  a method readInitialBoard(String fileName)
  a method makeMove(int number)
  a method showBoard()
  a method isCorrect()

Create a file called Driver1.java which will interact with the user and "run" your program. This class would create an instance of Board.java, fill the board with information from the user.
