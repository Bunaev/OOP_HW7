import java.util.Random;

public class Company {

    private final Random random = new Random();

    Publisher jobAgency;

    private final String name;

    private final Vacancy vacancy;

    public Company(Publisher jobAgency, String name, Vacancy vacancy) {
        this.jobAgency = jobAgency;
        this.name = name;
        this.vacancy = vacancy;
    }

    public void needEmployee(){
        jobAgency.sendOffer(name, vacancy.getSalary(), vacancy.getSpecialty());
    }

}
