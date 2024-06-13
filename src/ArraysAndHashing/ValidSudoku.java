package ArraysAndHashing;

import java.util.HashSet;

public class ValidSudoku
{
    public boolean isValidSudoku(char[][] board)
    {
        HashSet<Character>[] rowSets = new HashSet[9];
        HashSet<Character>[] colSets = new HashSet[9];
        HashSet<Character>[] boxSets = new HashSet[9];

// Initialize rowSets, colSets, and boxSets
        for (int i = 0; i < 9; i++) {
            rowSets[i] = new HashSet<>();
            colSets[i] = new HashSet<>();
            boxSets[i] = new HashSet<>();
        }

// Check rows, columns, and 3x3 subgrids
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char currentChar = board[i][j];
                if (currentChar != '.') {
                    // Check rows
                    if (!rowSets[i].add(currentChar)) {
                        return false; // Found a duplicate in the same row
                    }
                    // Check columns
                    if (!colSets[j].add(currentChar)) {
                        return false; // Found a duplicate in the same column
                    }
                    // Check 3x3 subgrids
                    int boxIndex = (i / 3) * 3 + (j / 3);
                    if (!boxSets[boxIndex].add(currentChar)) {
                        return false; // Found a duplicate in the same subgrid
                    }
                }
            }
        }

        return true;




    }
}
