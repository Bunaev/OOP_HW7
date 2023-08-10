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
        System.out.println("Доступные вакансии компании " + name + ":\n ");
        for (int i = 0; i < vacancies.size(); i++) {
            System.out.print(i + 1 + ". " + vacancies.get(i).toString().replaceAll("[,\\[\\]]", ""));
        }
        return "=".repeat(100) + "\n";
    }
}
