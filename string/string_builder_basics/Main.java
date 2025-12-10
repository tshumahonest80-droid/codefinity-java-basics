package com.example;

public class Main {
    public static String buildProductList(String[][] products) {
        // Correct initialization: removes **
        StringBuilder productList = new StringBuilder(); 
        // Correct append method call: removes **
        productList.append("Product List:\n"); 

        // Correct for-each loop syntax: removes **
        for (String[] product : products) { 
            // Correct variable assignment: removes **
            String name = product[0]; 
            // Correct variable assignment: removes **
            String price = product[1]; 
            
            // Correct method call and string concatenation: removes **
            productList.append(name + " - $" + price + "\n"); 
        }

        // Correct return statement: removes **
        return productList.toString(); 
    }

    public static void main(String[] args) {
        String[][] products = {
                {"Laptop", "999.99"},
                {"Phone", "499.49"},
                {"Tablet", "299.99"}
        };

        String result = buildProductList(products);
        System.out.println(result);
    }
}