package HUONG3;

public class Account {
    private String id;
    private String name;
    private int balance;
    
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getBalance() {
        return balance;
    }
    
    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void credit(int amount) {
        if(amount > 0) {
            balance = balance + amount;
            System.out.println("Nạp tiền thành công.");
        } else {
            System.out.println("Số tiền nạp vào phải là so duong.");
        }
    }

    public void debit(int amount) {
        if(amount < 0) {
            System.out.println("Lỗi: tham số không hợp lệ.");
        } else if(amount > balance) {
            System.out.println("Thanh toán không thành công. Số dư tài khoản không đủ.");
        } else {
            balance = balance - amount;
            System.out.println("Thanh toán thành công.");
        }
    }

    public void transferTo(Account account, int amount) {
        if(amount > balance) {
            System.out.println("Chuyển tiền không thành công. Số dư tài khoản không đủ.");
        } else {
            balance -= amount;
            account.credit(amount);
            System.out.println("Chuyển tiền thành công.");
        }
    }
}