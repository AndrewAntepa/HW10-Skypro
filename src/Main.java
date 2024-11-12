public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("Ф.И.О. сотрудника — " + fullName);

        System.out.println("\nЗадача 2");
        String fullNameToUpperCase = fullName.toUpperCase();
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета — " + fullNameToUpperCase);

        System.out.println("\nЗадача 3");
        fullName = "Иванов Семён Семёнович";
        String fullNameReplace = fullName.replace('ё', 'е');
        System.out.println("Данные Ф.И.О. сотрудника — " + fullNameReplace);
    }
}