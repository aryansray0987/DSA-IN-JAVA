package BinarySearch;

public class RowWithMaxOne {
    public static void main(String[] args) {
        int[][] arr = {{0, 0, 1, 1}, {1, 1, 1, 0}, {0, 0, 0, 0}};
        int n = arr.length;
        int m = arr[0].length;
        int finalRow = -1;
        int finalCount = 0;

        for (int rowNo = 0; rowNo < n; rowNo++) {
            int start = 0;
            int end = m - 1;
            int firstOneIndex = -1;

            // Binary search for the first 1 in the current row
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[rowNo][mid] == 1) {
                    firstOneIndex = mid;
                    end = mid - 1; // Look for an earlier 1
                } else {
                    start = mid + 1;
                }
            }

            // If a 1 was found, calculate the number of 1s in the current row
            if (firstOneIndex != -1) {
                int countOfOnes = m - firstOneIndex;
                if (countOfOnes > finalCount) {
                    finalCount = countOfOnes;
                    finalRow = rowNo;
                }
            }
        }

        System.out.println(finalRow);
    }
}
