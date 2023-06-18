package HW_7;

public class Company {

    private String companyName;

    private Publisher jobAgency;

    public Company(String companyName, Publisher jobAgency) {
        this.companyName = companyName;
        this.jobAgency = jobAgency;
    }

    public void needEmployee(String title, VacancyType type, double salary) {
        Vacancy vacancy = new Vacancy(title, type, salary);
        jobAgency.sendOffer(companyName, vacancy);
    }
}
