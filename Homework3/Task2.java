/*
2) Создать массив из 5 товаров. 

Пример:

// вначале объявляем массив объектов

Product[] productsArray = new Product[5];

// потом для каждой ячейки массива задаем объект

productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025",

               "Samsung Corp.", "Korea", 5599, true);

productsArray[1] = new Product(...);

...

productsArray[4] = new Product(...);
*/

package Homework3;

public class Task2 {

    public static void main(String[] args) {

        Product[] products = productsArray();

        printProductArray(products);

        
    }
    
static Product[] productsArray() {

        Product[] products = new Product[5];

        products[0] = new Product("Samsung S25 Ultra", 
                                    "01.02.2025", 
                                    "Samsung Corp.", 
                                    "Korea", 
                                    5599.00, 
                                    "Denied");

        products[1] = new Product("acer Nitro V Gaming Laptop", 
                                    "12.03.2023", 
                                    "Acer", 
                                    "Taiwan", 
                                    80000.00, 
                                    "Confirmed");

        products[2] = new Product("Sony Xperia 1 VII", 
                                    "24.11.2025", 
                                    "SONY", 
                                    "Japan", 
                                    95990.00, 
                                    "Awaiting departure");
                                    
        products[3] = new Product("PlayStation5 Digital Edition (slim)", 
                                    "24.11.2024", 
                                    "SONY", 
                                    "Japan", 
                                    43576.99, 
                                    "New");

        products[4] = new Product("Apple Watch Series 10", 
                                    "02.04.2025", 
                                    "Apple", 
                                    "USA", 
                                    19800.00, 
                                    "In processing");
        
        return products;
}

static void printProductArray(Product[] products) {

    for(Product p: products) {

        System.out.println(p);
        System.out.println();
    }
}
}

    
