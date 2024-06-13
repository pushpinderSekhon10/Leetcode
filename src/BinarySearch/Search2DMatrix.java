package BinarySearch;

public class Search2DMatrix
{
    public boolean searchMatrix(int[][] matrix, int target) {
        int top = 0;
        int bottom = matrix.length - 1;
        int row = -1;

        // Binary search to find the correct row
        while (top <= bottom) {
            int mid = top + (bottom - top) / 2;

            // Check if target is in the current row
            if (matrix[mid][0] <= target && (mid == matrix.length - 1 || matrix[mid + 1][0] > target)) {
                row = mid;
                break;
            } else if (matrix[mid][0] < target) {
                top = mid + 1;
            } else {
                bottom = mid - 1;
            }
        }

        // If the row is not found, return false
        if (row == -1) {
            return false;
        }

        int left = 0;
        int right = matrix[0].length - 1;

        // Binary search within the found row
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (matrix[row][mid] < target) {
                left = mid + 1;
            } else if (matrix[row][mid] > target) {
                right = mid - 1;
            } else {
                return true;
            }
        }

        return false;
    }
}
