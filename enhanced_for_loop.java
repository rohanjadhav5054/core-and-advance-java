public class enhanced_for_loop {
    public static void main() {
        // here is the enhanced for loop

        // for one dimensional array
        int[] numbers = { 1, 2, 3, 4, 5 };
        for (int num : numbers) {
            System.out.println(num);
        }

        // for two dimensional array
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        for (int row[] : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

    }
}