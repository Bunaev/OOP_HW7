import java.util.ArrayList;
import java.util.List;

public class Company {
    Publisher jobAgency;

    private final String name;

    public List <Vacancy> vacancies = new ArrayList<>();


    public Company(Publisher jobAgency, String name) {
        this.jobAgency = jobAgency;
        this.name = name;
    }

    public void needEmployee(){
        for (Vacancy vacancy: vacancies)
            jobAgency.sendOffer(name, vacancy.getSalary(), vacancy.getSpecialty());
    }

    public void addVacancies(){
        vacancies.add(new Vacancy());
    }

    @Override
    public String toString() {
        return "Доступные вакансии компании " + name + ":\n " + vacancies.toString().replaceAll("[,\\[\\]]", "") + "\n  ";
    }
}
