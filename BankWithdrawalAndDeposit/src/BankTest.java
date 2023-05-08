/*
Student Name: Terence Chu
Student ID: 301220117
*/

public class BankTest {
    public static void main(String[] args) {
        SavingsAccount savAct1 = new SavingsAccount("S101", "James Finch", 222210212, 3400.90);
        SavingsAccount savAct2 = new SavingsAccount("S102", "Kell Forest", 222214500, 42520.32);
        ChequingAccount chqAct1 = new ChequingAccount("C104", "Kaitlin Ross", 333315002, 91230.45);
        ChequingAccount chqAct2 = new ChequingAccount("C105", "Adem First", 333303019, 43987.67);

        System.out.println("----------");

        System.out.println("Before withdraw transaction : " + savAct1);
        savAct1.withdraw(3500.00);
        savAct1.withdraw(400.91);
        savAct1.withdraw(400);
        System.out.println("After withdraw transaction : " + savAct1);

        System.out.println("----------");

        System.out.println("Before deposit transaction : " + savAct2);
        savAct2.deposit(-100.00);
        savAct2.deposit(100.00);
        System.out.println("After deposit transaction : " + savAct2);

        System.out.println("----------");

        System.out.println("Before withdraw transaction : " + chqAct1);
        chqAct1.withdraw(93231.45);
        chqAct1.withdraw(93230.45);
        System.out.println("After withdraw transaction : " + chqAct1);

        System.out.println("----------");

        System.out.println("Before deposit transaction : " + chqAct2);
        chqAct2.deposit(-10000.00);
        chqAct2.deposit(10000.00);
        System.out.println("After deposit transaction : " + chqAct2);
    }
}