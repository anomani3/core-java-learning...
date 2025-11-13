package ashraf.encapsulation;

public class Main {
    public static void main(String[] args) {
            BankAccount ba=new BankAccount(10000);
        System.out.println("INitial Balance"+ba.getBalance());
        System.out.println("after deposit"+ba.depisit(5000));
    }
}
