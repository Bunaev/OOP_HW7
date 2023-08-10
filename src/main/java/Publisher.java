/**
 * Интерфейс рассылки вакансий.
 *
 */
public interface Publisher {

    boolean sendOffer(String companyName, int salary, String specialty);

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);


}
