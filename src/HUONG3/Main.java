package HUONG3;

class Main {
    public static void main(String[] args) {
        Account tkA = new Account("1", "tai khoan A", 3000);
        Account tkB = new Account("2", "tai khoan B", 5000);
        tkA.credit(2000);
        System.out.println(tkA.getBalance());
        tkA.debit(1000);
        System.out.println(tkA.getBalance());
        tkA.transferTo(tkB, 2000);
        System.out.println(tkA.getBalance());
        System.out.println(tkB.getBalance());
    }
}