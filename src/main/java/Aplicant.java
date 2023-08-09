public class Aplicant implements Observer {

    private final String name;
    private final String specialty;
    int minSalary;

    public Aplicant(String name, int minSalary, String speciality){
        this.name = name;
        this.specialty = speciality;
        this.minSalary = minSalary;
    }

    public String getSpecialty() {
        return specialty;
    }

    public int getMinSalary(){
        return minSalary;
    }

    public String getName(){
        return name;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary, String specialty) {
        if (this.minSalary <= salary) {
            System.out.printf("Соискатель %s: Мне нужна эта работа! (company: %s; salary: %d; speciality: %s)\n", name,
                    nameCompany, salary, specialty);
            this.minSalary = salary;
        } else {
            System.out.printf("Соискатель %s: Я найду работу получше! (company: %s; salary: %d; speciality: %s)\n", name,
                    nameCompany, salary, specialty);
        }
    }

    @Override
    public String toString() {
        return "{Соискатель по имени: " + name  +
                ", специальность: " + specialty +
                ", ожидаемый уровень дохода: " + minSalary +
                "} ";
    }
}
