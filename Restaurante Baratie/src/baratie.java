// Imports
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

// Starting Setup
public class baratie {
    /**
     * @param args
     * 
     */


    public static void main(String[] args) {
        Scanner axel = new Scanner(System.in);        
        List<Choose> choose = new ArrayList<>();
        List<Dessert> dessertsList = new ArrayList<>();
        List<Menu> MenuList = new ArrayList<>();
        dessertsList.add(new Dessert("Hamburgesa", 50));
        dessertsList.add(new Dessert("Pescado", 70));
        dessertsList.add(new Dessert("Sandwich_de_jamon", 50));
        dessertsList.add(new Dessert("Lagsaña", 50));
        dessertsList.add(new Dessert("Agua", 70));
        dessertsList.add(new Dessert("Pizza", 50));
        dessertsList.add(new Dessert("Cocacola", 50));
        MenuList.add(new Menu("Icecream", 50));
        MenuList.add(new Menu("Cake", 70));
        MenuList.add(new Menu("Brownie", 20));
        MenuList.add(new Menu("Cheescake", 20));
        MenuList.add(new Menu("Flan", 15));
        MenuList.add(new Menu("macarron", 50));
        MenuList.add(new Menu("Mochi", 50));

        
        // Reservation List
        
             String[] reservation_list = { "Carlos", "Ethan", "Axel", "Jhon" };
            System.out.println("What is your name?");
            String user_name = axel.nextLine();

            for (String name : reservation_list) {
                if (name.equals(user_name)) {
                    System.out.println("You are in the reservation list !!!");



                    
                {
                    System.out.println("Thanks for your order" + user_name);
                }
        
        

        // menu display 
        int choice;
        do {
       
            System.out.println("#1 Hamburgesa");
            System.out.println("#2 Pescado");
            System.out.println("#3 Sandwich_de_jamon");
            System.out.println("#4 Lagsaña");
            System.out.println("#5 Agua");
            System.out.println("#6 Pizza");
            System.out.println("#7 Cocacola");
            System.out.println("#8 Salida");
            System.out.println("");
            choice = axel.nextInt();

            switch (choice) {
                default:
                    break;
                case 1:
                    choose.add(new Choose("Hamburgesa", 50));
                    break;
                case 2:
                    choose.add(new Choose("Pescado", 70));
                    break;
                case 3:
                    choose.add(new Choose("Sandwich_de_jamon", 50));
                    break;
                case 4:
                    choose.add(new Choose("Lagsaña", 70));
                    break;
                case 5:
                    choose.add(new Choose("Agua", 50));
                    break;
                case 6:
                    choose.add(new Choose("Pizza", 70));
                    break;
                case 7:
                    choose.add(new Choose("Cocacola", 50));
                    break;
                case 8:
                    break;
            }
        } while (choice != 8);
        
        

        // dessert menu
        
        System.out.println("Would you like a dessert?");
        
        do {
       
            System.out.println("#1 Icecream");
            System.out.println("#2 Cake");
            System.out.println("#3 Brownie");
            System.out.println("#4 Cheescake");
            System.out.println("#5 Flan");
            System.out.println("#6 macarron");
            System.out.println("#7 Mochi");
            System.out.println("#8 Salida");
            System.out.println("");
            choice = axel.nextInt();

            switch (choice) {
                default:
                    break;
                case 1:
                    choose.add(new Choose("Icecream", 50));
                    break;
                case 2:
                    choose.add(new Choose("Cake", 70));
                    break;
                case 3:
                    choose.add(new Choose("Brownie", 50));
                    break;
                case 4:
                    choose.add(new Choose("Cheescake", 70));
                    break;
                case 5:
                    choose.add(new Choose("Flan", 50));
                    break;
                case 6:
                    choose.add(new Choose("macarron", 70));
                    break;
                case 7:
                    choose.add(new Choose("Mochi", 50));
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
        double sum_percentage = sum / 100; 
        double sum_taxed = sum_percentage * 0.28;
        System.out.println("Total: " + sum_taxed );

    }
            }
        }
    }