import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String soz = scanner.nextLine();

        Week week = Week.valueOf(soz.toUpperCase());

        switch (week){
            case MONDAY -> System.out.println("Дуйшонбу куну жава окуйм");
            case TUESDAY -> System.out.println("Шейшенби куну практика");
            case WEDNESDAY -> System.out.println("Шаршенби куну техникалык сабак");
            case THURSDAY -> System.out.println("Бейшенби куну жава окуйм");
            case FRIDAY -> System.out.println("Жума куну англис тил сабагы");
            case SATURDAY -> System.out.println("Ишенби куну практика ");
            case SUNDAY -> System.out.println("Жекшенби куну окуу жок");
        }
    }
}