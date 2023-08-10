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
        findEmployee();
        for (int i = 0; i < vacancies.size(); i++)
            jobAgency.sendOffer(name, vacancies.get(i).getSalary(), vacancies.get(i).getSpecialty());

    }
    public void findEmployee(){
        for (int i = 0; i < vacancies.size(); i++)
            if (jobAgency.sendOffer(name, vacancies.get(i).getSalary(), vacancies.get(i).getSpecialty())){
                System.out.println(name + ": Мы нашли сотрудника! Удаляем свою вакансию: " + vacancies.get(i).getSpecialty());
                vacancies.remove(i);
            }
    }

    public void addVacancies(){
        vacancies.add(new Vacancy());
    }

    @Override
    public String toString() {
        System.out.println();
        System.out.println("Доступные вакансии компании " + name + ":\n ");
        for (int i = 0; i < vacancies.size(); i++) {
            System.out.print(i + 1 + ". " + vacancies.get(i).toString().replaceAll("[,\\[\\]]", ""));
        }
        if (vacancies.isEmpty()){
            System.out.println("=".repeat(26) +" У данной компании пока нет доступный вакансий. " + "=".repeat(26));
        }
        return "=".repeat(100) + "\n";
    }

}
