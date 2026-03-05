package Homework5;

public class WorkWithArray {

    static void fillArray(String[][] arr) {

        int num = 5;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                
                
                String str = String.valueOf(num++);
                arr[i][j] = str;
            }
        }
    }

    static void fillArrayWithExc(String[][] arr) {

        int num = 5;

        for (int i = 0; i <= arr.length; i++) {
            for (int j = 0; j <= arr.length; j++) {
                
                
                String str = String.valueOf(num++);
                arr[i][j] = str;
            }
        }
    }
    
}
