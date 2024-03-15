import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner objScanner = new Scanner(System.in);
        Main objMain = new Main();
        HandlerEmployee handlerEmployee = new HandlerEmployee();
        int option = 0;

        do {
            objMain.menu();
            option = objScanner.nextInt();

            switch (option){
                case 1:
                    handlerEmployee.addEmployee();
                    break;
                case 2:
                    handlerEmployee.showEmployee();
                    break;
                case 3:
                    System.out.print("Enter the employee id that you want to delete:");
                    int id = objScanner.nextInt();
                    handlerEmployee.deleteEmployee(id);
                    break;
                case 4:
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("This option is not valid");
            }
        }while (option!=4);
    }

    public void menu(){
        System.out.println("""
                ---- MENU ----
                1. Add employee.
                2. Show employees.
                3. Delete employee.
                4. Exit.
                """);
    }
}