package egsasia2;
import java.util.Arrays;
import java.util.Scanner;
public class Maze {
	private static final char WALL = '#';
	private static final char PATH = 'x';
	private static final char EXIT = 'E';
	int maze= new maze[][12];
	int i=0;
	private static int exitX, exitY;

private static void traverse(char[][12] maze, int startX, int startY, int nextMove) {
			while i<=maze.length {
				i++;
				// ektyponoume tin thesi tou x sto shmeio poy vriskomaste
				System.out.println("x");
				System.out.println(maze);
				}
			if i>maze.length {
				System.out.println("out of bounds");
				else if (i=0) {
					System.out.println("first position");
					return i;
				}
			}
			if char[i][12]!="#" {
					i++;
					else {
						return 0;
					}
			}
		// TODO Auto-generated method stub
		
	}
	private static void printMaze(char[][12]) {
		System.out.println(maze);
		// TODO Auto-generated method stub
		
	}
	
	public static validMove(char[][12], int x, int y, int nextMove) {
		if x<maze.length || y< maze.length {
			System.out.println("you can move on ");
			return 0;
		}
	}
		private static boolean isSolved(int startX, int startY) {
		
		// TODO Auto-generated method stub
		return false;
	}

	public static void main(String[] args) {
		char[][] maze= {
				 {'#','#','#','#','#','#','#','#','#','#','#','#'},
		            {'#',' ',' ',' ','#',' ',' ',' ',' ',' ',' ','#'},
		            {'#',' ','#',' ','#',' ','#','#','#','#',' ','#'},
		            {'#',' ','#',' ','#',' ',' ',' ',' ','#',' ','#'},
		            {'#','#','#',' ','#','#','#','#',' ','#',' ','#'},
		            {'#',' ',' ',' ',' ',' ',' ','#',' ','#',' ','#'},
		            {'#','#','#','#','#','#',' ','#',' ','#',' ','#'},
		            {'#',' ',' ',' ',' ',' ',' ',' ',' ','#',' ','#'},
		            {'#','#','#','#','#','#','#','#','#','#',' ','#'},
		            {'#',' ',' ',' ',' ',' ',' ',' ',' ','#',' ','#'},
		            {'#','#','#','#','#','#','#','#','#','#','#','#'}
		        };
		
		int startX = 1, startY = 1;
		
		exitX = 4;
		exitY = 10;
		
		System.out.println("initial maze:");
		printMaze(maze);
		
		traverse(maze, startX, startY, 1);
	
		if (isSolved(startX, startY)) {
			System.out.println("Maze solved");
		} else {
			System.out.println("maze not solvable");
		}
	}

	
}


