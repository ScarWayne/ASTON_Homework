/*
1) Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4. 
При подаче массива другого размера необходимо бросить исключение MyArraySizeException. 

2) Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать. 
Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа), 
должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные. 

3) В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException 
и вывести результат расчета.                              

4)Напишите код для генерации и поимки ArrayIndexOutOfBoundsException. 
*/

package Homework5;

public class Main {
    public static void main(String args[]) {

        String[][] arr = new String[4][4];

        WorkWithArray.fillArray(arr);

        //arr[2][3] = "Упс";
                
        try
            {int sum = MyArraySizeException.checkArraySize(arr);
            
            System.out.println("Полученная сумма чисел = " + sum); 

            } catch(MyArrayDataException | MyArraySizeException e) {

                e.printStackTrace();}
            
        try
            {
                WorkWithArray.fillArrayWithExc(arr);

            } catch(ArrayIndexOutOfBoundsException e) {

                e.printStackTrace();
                
            }
    

    }
  
    
}

