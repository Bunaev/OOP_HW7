import java.util.ArrayList;
import java.util.List;

/**
 * Агентство занимается поиском сотрудников
 */
public class JobAgency implements Publisher {


    List<Observer> observers = new ArrayList<>();

    @Override
    public void sendOffer(String companyName, int salary, String specialty) {
        for (int i = 0; i < observers.size(); i++){
            if (observers.get(i).getSpecialty().equals(specialty)) {
                observers.get(i).receiveOffer(companyName, salary, specialty);
                if (observers.get(i).getMinSalary() <= salary) {
                    System.out.printf("Соискатель %s: Эта вакансия мне подходит! Прекращаю поиск. (company: %s; salary: %d; speciality: %s)\n", observers.get(i).getName(),
                            companyName, salary, specialty);
                    removeObserver(observers.get(i));
                }
            }
            else if (observers.get(i).getSpecialty().equals("Student") && !specialty.equals("IT") && !specialty.equals("Manager") && !specialty.equals("Security") && !specialty.equals("Copywriter")) {
                observers.get(i).receiveOffer(companyName, salary, specialty);
                if (observers.get(i).getMinSalary() <= salary) {
                    System.out.printf("Соискатель %s: Эта вакансия мне подходит! Прекращаю поиск. (company: %s; salary: %d; speciality: %s)\n", observers.get(i).getName(),
                            companyName, salary, specialty);
                    removeObserver(observers.get(i));
                }
            }
        }
    }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public String toString() {
        return "Список соискателей: " +
                observers +
                '}';
    }
}
