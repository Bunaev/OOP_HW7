public interface Observer {

    void receiveOffer(String nameCompany, int salary, String specialty);
    String getSpecialty();
    int getMinSalary();
    String getName();


}
