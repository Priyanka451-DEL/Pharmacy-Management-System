
import java.util.Scanner;

public class PharmacyMain {
    public static void main(String[] args) {

        MedicineService service = new MedicineService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Pharmacy Management ---");
            System.out.println("1. Add Medicine");
            System.out.println("2. View Medicine by ID");
            System.out.println("3. View All Medicines");
            System.out.println("4. Update Medicine");
            System.out.println("5. Delete Medicine");
            System.out.println("6. Exit");
            System.out.print("Choice: ");

            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Price: ");
                    double price = sc.nextDouble();
                    System.out.print("Quantity: ");
                    int qty = sc.nextInt();
                    service.add(new MedicineDTO(0, name, price, qty));
                    break;

                case 2:
                    System.out.print("ID: ");
                    MedicineDTO m = service.getById(sc.nextInt());
                    if (m != null)
                        System.out.println(m.getId()+" "+m.getName()+" "+m.getPrice()+" "+m.getQuantity());
                    else
                        System.out.println("Not Found");
                    break;

                case 3:
                    for (MedicineDTO med : service.getAll())
                        System.out.println(med.getId()+" "+med.getName()+" "+med.getPrice()+" "+med.getQuantity());
                    break;

                case 4:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("New Name: ");
                    String n = sc.nextLine();
                    System.out.print("New Price: ");
                    double p = sc.nextDouble();
                    System.out.print("New Quantity: ");
                    int q = sc.nextInt();
                    service.update(new MedicineDTO(id, n, p, q));
                    break;

                case 5:
                    System.out.print("ID: ");
                    service.delete(sc.nextInt());
                    break;

                case 6:
                    System.out.println("Thank You!");
                    System.exit(0);
            }
        }
    }
}
