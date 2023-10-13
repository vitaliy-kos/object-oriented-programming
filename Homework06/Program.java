package Homework06;

public class Program {

    /**
     * TODO: Переработать структуру приложения Order, приложение должно соответствовать
     * принципу SRP.
     * @param args
     */
    public static void main(String[] args) {

        ConsoleReader consoleReader = new ConsoleReader();
        DataSaver dataSaver = new DataSaver();

        Order order = new Order(consoleReader.getDataForCreatingOrder());

        if(dataSaver.saveToJson(order)) {
            System.out.println("Информация по заказу успешно сохранена в файл.");
        }

    }

}
