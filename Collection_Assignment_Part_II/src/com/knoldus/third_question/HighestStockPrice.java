package com.knoldus.third_question;

import java.util.HashMap;
import java.util.Scanner;

public class HighestStockPrice {
    public static void main(String[] args) {

        HashMap<String, Double> stockMap = new HashMap<String, Double>();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the stock symbols and their prices. Enter a blank line to stop.");
        while (true) {
            try {
                System.out.print("Symbol: ");
                String symbol = input.nextLine();
                if (symbol.equals("")) {
                    break;
                }

                System.out.print("Price: ");
                double price = Double.parseDouble(input.nextLine());

                stockMap.put(symbol, price);
            } catch (NumberFormatException exception) {
                System.out.println("Invalid Input!!");
            }
        }
        input.close();
        String highestPriceStock = null;
        double highestPrice = Double.MIN_VALUE;

        for (String symbol1 : stockMap.keySet()) {
            double price1 = stockMap.get(symbol1);
            if (price1 > highestPrice) {
                highestPrice = price1;
                highestPriceStock = symbol1;
            }
        }

        System.out.println("The stock with the highest price is: " + highestPriceStock);
    }
}

