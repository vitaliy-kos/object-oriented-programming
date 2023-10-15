package Homework07.observer;

import java.util.ArrayList;
import java.util.List;

public class JobAgency implements Publisher {


    List<Observer> observers = new ArrayList<>();

    @Override
    public void sendOffer(Vacancy vacancy) {
        System.out.print(vacancy);

        Boolean acceptedOffer = false;

        for (Observer observer : observers){
            acceptedOffer = observer.receiveOffer(vacancy);

            if (acceptedOffer) {
                removeObserver(observer);
                System.out.printf("++ Вакансия закрыта. Устроился сосискатель: %s\n", observer.getName());
                break;
            }
        }

        if(!acceptedOffer) System.out.printf("-- Кандидат не найден.\n");

    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
}
