package banking;

public class CreditCard {
    private String cardNumber;
    private double credit;
    private double withdrawal;


    public CreditCard(){}
    public CreditCard(String cardNumber, double credit){
        this.cardNumber = cardNumber;
        this.credit = credit;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public double getCredit() {
        return credit;
    }

    public void setWithdrawal(double withdrawal) {
        this.withdrawal = withdrawal;
    }

    public void withdraw() {
        if(withdrawal<=credit)
            credit = credit-withdrawal;
        else
            System.out.println("Your credit is not enough.");
    }

    public String toString(){
        return "The credit in your credit card with credit card number \""+this.cardNumber+"\" is "+this.credit;
    }
}