import java.util.Random;

public class Vacancy{
    String specialty;
    private final int salary;
    private int id;

    public Vacancy() {
        String[] specialtyList = new String[]{"IT", "Courier", "Handyman", "Security", "Cleaner", "Manager", "Copywriter"};
        Random random = new Random();
        this.specialty = specialtyList[random.nextInt(0,specialtyList.length)];
        switch (specialty) {
            case "IT" -> this.salary = random.nextInt(80000, 300000);
            case "Courier", "Handyman" -> this.salary = random.nextInt(15000, 40000);
            case "Security" -> this.salary = random.nextInt(30000, 65000);
            case "Cleaner" -> this.salary = random.nextInt(30000, 50000);
            case "Manager" -> this.salary = random.nextInt(65000, 100000);
            default -> this.salary = random.nextInt(25000, 50000);
        }
    }
    public String getSpecialty() {
        return specialty;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Вакансия - " +
                "Специальность: " + specialty +
                "; заработная плата: " + salary +
                " руб.\n";
    }
}
