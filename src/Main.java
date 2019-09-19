import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] array = null;
        int row, column;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập dòng cho mảng: ");
        row = scanner.nextInt();
        System.out.println("Nhập cột cho mảng: ");
        column = scanner.nextInt();
        array = new int[row][column];

        //Nhập phần tử cho ma trận.
        System.out.println("Nhập phần tử cho ma trận: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("array[" + i + "][" + j + "] = ");
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Ma trận: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("\n");
        }

        int sum = 0;
        System.out.println("Tổng đường chéo: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                    if (i==j){
                        sum+= array[i][j];
                    }
            }

        }
        System.out.println(sum);

    }
}
