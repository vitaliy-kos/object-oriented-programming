package Homework07.observer;

public class Vacancy {
    
    private int vacancyId;
    private String companyName;
    private int salary;
    private WorkType workType;
    private Country country;

    private static int idCounter = 1000;

    {
        vacancyId = idCounter++;
    }

    public Vacancy(String companyName, int salary, WorkType workType, Country country) {
        this.companyName = companyName;
        this.salary = salary;
        this.workType = workType;
        this.country = country;
    }

    /**
     * @return String return the companyName
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * @param companyName the companyName to set
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * @return int return the salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * @return WorkType return the workType
     */
    public WorkType getWorkType() {
        return workType;
    }

    /**
     * @param workType the workType to set
     */
    public void setWorkType(WorkType workType) {
        this.workType = workType;
    }


    /**
     * @return Country return the country
     */
    public Country getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(Country country) {
        this.country = country;
    }


    /**
     * @return int return the vacancyId
     */
    public int getVacancyId() {
        return vacancyId;
    }

    /**
     * @param vacancyId the vacancyId to set
     */
    public void setVacancyId(int vacancyId) {
        this.vacancyId = vacancyId;
    }

    @Override
    public String toString() {
        return String.format("-------------\n[Вакансия #%d] %s - %d руб. - тип: %s, страна: %s\n", this.vacancyId, this.companyName, this.salary, this.workType, this.country);
    }

}
