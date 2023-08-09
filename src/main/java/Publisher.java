/**
 * Интерфейс рассылки вакансий.
 *
 */
public interface Publisher {

    void sendOffer(String companyName, int salary, String specialty);

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);


}
