package Homework5;

public class MyArraySizeException extends RuntimeException {

    MyArraySizeException(String message) {

        super(message);
        
    }
    
    static int checkArraySize(String[][] arr) {

        if (arr.length != 4) {

            throw new MyArraySizeException("Массив должен быть 4х4!");

        }

        for (int i = 0; i < arr.length; i++) {

            if(arr[i].length != 4) {

                throw new MyArraySizeException("Массив должен быть 4х4!");

            }
        }

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                try { 
                        String str = arr[i][j];
                        int num = Integer.parseInt(str);
                        sum += num;

                    } catch (NumberFormatException e) {

                        throw new MyArrayDataException("Ошибка преобразования в ячейке: [" + i + "][" + j + "]");

                    }
            
            }
        }

        return sum;

    }
}
