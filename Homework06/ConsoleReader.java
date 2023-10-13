package Homework06;

import java.util.HashMap;
import java.util.Scanner;

public class ConsoleReader {
    
    private Scanner scanner = new Scanner(System.in);

    public HashMap<String,Object> getDataForCreatingOrder(){

        HashMap<String,Object> orderData = new HashMap<String,Object>();

        orderData.put("name", prompt("Имя клиента: "));
        orderData.put("product", prompt("Продукт: "));        
        orderData.put("qnt", Integer.parseInt(prompt("Кол-во: ")));
        orderData.put("price", Double.parseDouble(prompt("Цена: ")));

        return orderData;
    }

    private String prompt(String message){
        System.out.print(message);
        return scanner.nextLine();
    }

}
