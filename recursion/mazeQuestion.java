package recursion;

public class mazeQuestion {

    static void pathFinder(boolean[][] maze, int row, int column, String p) {
        if (row == maze.length - 1 && column == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[row][column]) {
            return;
        }
        maze[row][column] = false;

        if (row < maze.length - 1) {
            pathFinder(maze, row +1 , column , p + "D");
        }

        if (column < maze[0].length - 1) {
            pathFinder(maze, row , column +1 , p + "R");
        }
     
        if (row > 0) {
            pathFinder(maze, row - 1, column, p + "U");
        }
        if (column > 0) {
            pathFinder(maze, row, column - 1, p + "L");

        }
        maze[row][column] = true;

    }

    public static void main(String[] args) {
        boolean[][] maze = {
                { true, true, true,
                        true, true, true,
                        true, true, true
                }
        };

        pathFinder(maze, 0, 0, "");

    }

}
