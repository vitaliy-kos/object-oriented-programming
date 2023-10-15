package Homework07.observer;

public class Program {

    public static void main(String[] args) {

        Publisher jobAgency = new JobAgency();
        Company google = new Company("Google", jobAgency, 120000);
        Company yandex = new Company("Yandex", jobAgency, 95000);
        Company geekBrains = new Company("GeekBrains", jobAgency, 98000);
 
        jobAgency.registerObserver(new Student("Студент #1"));
        jobAgency.registerObserver(new Student("Студент #2"));
        jobAgency.registerObserver(new Master("Мастер #1"));
        jobAgency.registerObserver(new Master("Мастер #2"));
        jobAgency.registerObserver(new Freelancer("Фрилансер #1"));
        jobAgency.registerObserver(new Freelancer("Фрилансер #2"));

        for (int i = 0; i <= 4; i++){
            google.needEmployee();
            yandex.needEmployee();
            geekBrains.needEmployee();
        }

    }

}
