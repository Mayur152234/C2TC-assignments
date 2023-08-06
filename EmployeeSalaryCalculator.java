import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EmployeeSalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter base payment (4500 to 6000): ");
        double basePayment = scanner.nextDouble();
        if (basePayment < 4500 || basePayment > 6000) {
            System.out.println("Invalid base payment entered.");
            return;
        }

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        double pa = 0.1 * basePayment;
        double ta = 0.01 * basePayment;
        double hr = 0.03 * basePayment;
        double pf = 0.005 * basePayment;
        
        if (basePayment > 10000) {
            basePayment -= 1000;
        }

        double totalSalary = basePayment + pa + ta + hr - pf;

        int retirementAge = 55;
        int yearsLeft = retirementAge - age;
        LocalDate currentDate = LocalDate.now();
        LocalDate retirementDate = currentDate.plusYears(yearsLeft);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("\nEmployee Name: " + name);
        System.out.println("Base Payment: " + basePayment);
        System.out.println("PA: " + pa);
        System.out.println("TA: " + ta);
        System.out.println("HR: " + hr);
        System.out.println("PF: " + pf);
        System.out.println("Total Salary: " + totalSalary);
        System.out.println("Retirement Date: " + retirementDate.format(formatter));

        scanner.close();
    }
}
