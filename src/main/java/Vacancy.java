import java.util.Random;

public class Vacancy{
    private final Random random = new Random();
    String specialty;
    private int salary;


    public Vacancy() {
        String[] specialtyList = new String[]{"IT", "Courier", "Handyman", "Security", "Cleaner", "Manager", "Copywriter"};
        this.specialty = specialtyList[random.nextInt(0,specialtyList.length)];
        if (specialty.equals("IT")) {
            this.salary = random.nextInt(80000, 300000);
        } else if (specialty.equals("Courier") || specialty.equals("Handyman")) {
            this.salary = random.nextInt(15000, 40000);
        } else if (specialty.equals("Security")) {
            this.salary = random.nextInt(30000, 65000);
        } else if (specialty.equals("Cleaner")) {
            this.salary = random.nextInt(30000, 50000);
        } else if (specialty.equals("Manager")) {
            this.salary = random.nextInt(65000, 100000);
        } else {
            this.salary = random.nextInt(25000, 50000);
        }
    }

    public String getSpecialty() {
        return specialty;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Vacancy - " +
                "specialty='" + specialty + '\'' +
                ", salary=" + salary +
                '}';
    }
}
