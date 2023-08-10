public class Program {

    /**
     * TODO: Доработать приложение, которое разрабатывалось на семинаре, поработать с шаблоном проектирования Observer,
     *  добавить новый тип соискателя.
     *  Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  Только после этого вы можете усложнить ваше приложение (при желании), например, добавить тип вакансии (enum), учитывать тип вакансии при отправке предложения соискателю.
     * @param args
     */
    public static void main(String[] args) {
        Publisher jobAgency = new JobAgency();
        Company google = new Company(jobAgency, "Google");
        Company yandex = new Company(jobAgency, "Yandex");
        Company geekBrains = new Company(jobAgency, "GeekBrains");
        google.addVacancies();
        google.addVacancies();
        yandex.addVacancies();
        geekBrains.addVacancies();
        System.out.println(google);
        System.out.println(yandex);
        System.out.println(geekBrains);

        jobAgency.registerObserver(new Applicant("Петров Иван", 60000, "Security"));
        jobAgency.registerObserver(new Applicant("Иванов Сергей", 100000, "IT"));
        jobAgency.registerObserver(new Applicant("Сидоров Николай", 50000, "Handyman"));
        jobAgency.registerObserver(new Applicant("Лопаткин Вячеслав", 45000, "Cleaner"));
        jobAgency.registerObserver(new Applicant("Ломаченко Софья", 15000, "Student"));

        google.needEmployee();
        yandex.needEmployee();
        geekBrains.needEmployee();

        System.out.println(google);
        System.out.println(yandex);
        System.out.println(geekBrains);
    }
}
