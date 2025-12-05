import com.jspiders.esm.services.EmployeeServiceimp;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("please select the option");

        System.out.println("1. Save  employee");
        System.out.println("2. View employee");
        System.out.println("3. Update employee");
        System.out.println("4. Delete employee");
        System.out.println("5. EXIT");

        EmployeeServiceimp empsrv = new EmployeeServiceimp();

        Scanner s1 = new Scanner(System.in);
        int choice = s1.nextInt();

        switch (choice) {
            case 1:
                empsrv.addEmployee();
                break;
            case 2:
                System.out.println("View employee");
                break;
            case 3:
                System.out.println("Update employee");
                break;
            case 4:
                System.out.println("delete employee");
                break;
            default:
                System.exit(0);
        }

    }

    }
