package sudoku;

class SudokuSolver {
    //args should be a string with a number for a given numbers and an 'x' for an empty space
    //*original puzzle should be read row-majorem
    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        Grid puzzle = new Grid(args[0]);
        puzzle.solve(0);
        System.out.println(puzzle);
        System.out.println(System.currentTimeMillis() - a + " milliseconds");
    }
}

