public class Program {
    public static void Main(String[] args) {
        //Bai 1
        Circle cir = new Circle(2.0, "green");
        cir.display();
        //Bai 2
        Rectangle rect = new Rectangle(3, 4);
        rect.display();
        //Bai 3
        Employee emp = new Employee(1350080034, "Dung", "Nguyen The", 50000);
        emp.display();
        //Bai 4
        Account acc1 = new Account("12345A", "A", 2000);
        Account acc2 = new Account("6789B", "B", 500);

        acc1.display();
        acc2.display();

        acc1.transferTo(acc2, 200);

        System.out.println("=======================");
        acc1.display();
        acc2.display();
        //Bai 5
        Date date = new Date(16, 2, 2025);
        System.out.println("Date: " + date.toString());
        System.out.println("co phai la nam nhuan: " + date.isLeapYear());
    }
}
