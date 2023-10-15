package Homework07.observer;

public class Freelancer implements Observer {

    private String name;
    private int salary = 40000;
    private WorkType type;
    private Country country;

    public Freelancer(String name) {
        this.name = name;
        this.type = WorkType.getRandom();
        this.country = Country.getRandom();
    }

    private Boolean checkCondition(Vacancy vacancy) {
        return this.salary <= vacancy.getSalary() && 
             this.country.equals(vacancy.getCountry()) && 
             this.type.equals(vacancy.getWorkType());
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Boolean receiveOffer(Vacancy vacancy) {
        if ( this.checkCondition(vacancy) ){
                System.out.printf("Фрилансер %s, страна - %s, тип - %s: Я устраиваюсь сюда! (желаемая заработная плата: %d)\n", name, country, type, salary);
                this.salary = vacancy.getSalary();
                return true;
        }

        System.out.printf("Фрилансер %s, страна - %s, тип - %s: Отказываюсь! (желаемая заработная плата: %d)\n", name, country, type, salary);
        return false;
    }
    
}
