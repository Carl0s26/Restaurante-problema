
// Imports
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Starting Setup
public class baratie {
    static Boolean isInTheReservationList(List<String> reservation_list, String user_name) {
        for (String name : reservation_list) {
            if (name.toLowerCase().equals(user_name.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    static void Restaurant(String user_name) {
        Scanner axel = new Scanner(System.in);
        List<Choose> choose = new ArrayList<>();
        int choice;
        do {
            System.out.println("");
            System.out.println("#1 hamburger: 40");
            System.out.println("#2 Fish: 35");
            System.out.println("#3 Sandwich: 25");
            System.out.println("#4 Lagsaña: 40");
            System.out.println("#5 Water: 5");
            System.out.println("#6 Pizza: 20");
            System.out.println("#7 Cocacola: 10");
            System.out.println("#8 Salida");
            System.out.println("");
            choice = axel.nextInt();

            switch (choice) {
                default:
                    break;
                case 1:
                    choose.add(new Choose("Hamburger", 40));
                    break;
                case 2:
                    choose.add(new Choose("Fish", 35));
                    break;
                case 3:
                    choose.add(new Choose("Sandwich", 25));
                    break;
                case 4:
                    choose.add(new Choose("Lagsaña", 40));
                    break;
                case 5:
                    choose.add(new Choose("Water", 5));
                    break;
                case 6:
                    choose.add(new Choose("Pizza", 20));
                    break;
                case 7:
                    choose.add(new Choose("Cocacola", 10));
                    break;
                case 8:
                    break;
            }
        } while (choice != 8);

        // dessert menu

        System.out.println("Would you like a dessert?");

        do {
            System.out.println("");
            System.out.println("#1 Icecream: 25");
            System.out.println("#2 Cake: 50");
            System.out.println("#3 Brownie: 20");
            System.out.println("#4 Cheescake: 30");
            System.out.println("#5 Flan: 25");
            System.out.println("#6 macarron: 15");
            System.out.println("#7 Mochi: 10");
            System.out.println("#8 Salida");
            System.out.println("");
            choice = axel.nextInt();

            switch (choice) {
                default:
                    break;
                case 1:
                    choose.add(new Choose("Icecream: ", 25));
                    break;
                case 2:
                    choose.add(new Choose("Cake:", 50));
                    break;
                case 3:
                    choose.add(new Choose("Brownie:", 20));
                    break;
                case 4:
                    choose.add(new Choose("Cheescake:", 30));
                    break;
                case 5:
                    choose.add(new Choose("Flan:", 25));
                    break;
                case 6:
                    choose.add(new Choose("macarron:", 15));
                    break;
                case 7:
                    choose.add(new Choose("Mochi:", 10));
                    break;
                case 8:
                    break;
            }
        } while (choice != 8);
        System.out.println("");
        System.out.println("Your total order is:");
        System.out.println("");
        double sum = 0;
        for (int i = 0; i < choose.size(); i++) {
            System.out.println(choose.get(i).getName() + " " + choose.get(i).getPrice());
            sum += choose.get(i).getPrice();
        }
        double sum_total = ((sum * 0.28) + sum);
        System.out.println("Total without taxes " + sum);
        System.out.println("Total: " + sum_total);
        System.out.println("");
        System.out.println("Have a good day " + user_name);
        axel.close();
    }

    public static void main(String[] args) {
        List<String> reservation_list = new ArrayList<>();
        reservation_list.add("Carlos");
        reservation_list.add("Ethan");
        reservation_list.add("Axel");
        reservation_list.add("Jhon");
        String user_input;
        // Reservation List
        Scanner axel = new Scanner(System.in);
        System.out.println("What is your name?");
        String user_name = axel.nextLine();
        if (isInTheReservationList(reservation_list, user_name).equals(true)) {
            Restaurant(user_name);
        } else {
            System.out.println("you aren't in the reservation list");
            System.out.println("Would you like to make a reservation? yes/no");
            user_input = axel.nextLine();
            if (user_input.equals("yes")) {
                reservation_list.add(user_name);
                Restaurant(user_name);
            } else {
                System.out.println("Then go away");
            }
        }
        axel.close();
    }
}
