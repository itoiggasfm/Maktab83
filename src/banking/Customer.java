package banking;

public class Customer {
    private String name;
    private Account account;

    public Customer(){}

    public Customer(String name, Account account){
        this.name = name;
        this.account = account;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public String toString(){
        return "Dear customer: Mr/Mrs "  + this.name+" with account number " + this.account.getAccountNumber() + ".";
    }
}