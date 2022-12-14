package Case_study_new.controllers;

import java.util.Scanner;

public class FuramaController {
    public static Scanner scanner = new Scanner(System.in);

    public void displayMainMenu() {
        boolean check = true;
        while (check){
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management ");
            System.out.println("4. Booking Managerment");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            System.out.println("Enter choice: ");
            int choice = 0;
            boolean checkLoop = false;
            while (!checkLoop){
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    checkLoop = true;
                } catch (NumberFormatException ex) {
                    System.out.println("Nhập số cho chính xác");
                }
            }
            switch (choice) {
                case 1:
                    new EmployeeManagement().employeesMenu();
                    break;
                case 2:
                    new CustomerManagement().customerMenu();
                    break;
                case 3:
                    new FacilityManagement().facilityMenu();
                    break;
                case 4:
                    new BookingManagement().bookingMenu();
                    break;
                case 5:
                    new PromotionManagement().promotionMenu();
                    break;
                case 6:
                    check = false;
            }
        }
    }


}
