package banking;

public class Account {
    private String accountNumber;
    private CreditCard creditCard;

    public Account(){}
    public Account(String accountNumber, CreditCard creditCard){
        this.accountNumber = accountNumber;
        this.creditCard = creditCard;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }
}