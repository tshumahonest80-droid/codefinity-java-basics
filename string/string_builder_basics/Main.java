package com.example;

public class Main {
    public static String buildProductList(String[][] products) {
        // 2. Initialize a StringBuilder and append the header
        StringBuilder productList = **new StringBuilder()**;
        productList.**append**("Product List:\n");

        // 3. Loop through the products array using a for-each loop.
        for (**String[] product : products**) {
            // 4. For each product:
            // Extract the name (product[0])
            String name = **product[0]**;
            // Extract the price (product[1])
            String price = **product[1]**;
            
            // Append a line to the StringBuilder in the format: ProductName - $Price\n
            productList.**append**(name + " - $" + price + "\n");
        }

        // 5. Return the full String from the StringBuilder.
        return **productList.toString()**;
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