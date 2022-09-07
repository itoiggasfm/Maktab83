package banking;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        CreditCard creditCard = new CreditCard();
        Customer customer = new Customer();
        Branch branch = new Branch();

        //1.1. Customer name is provided for Customer Class
        customer.setName("Ali Akrami");

        //2.1. Account number is provided Account Class
        account.setAccountNumber("00010745006");

        //3. Credit card and credit are provided for CreditCard class
        creditCard.setCardNumber("1234-5689-5896-9642");
        creditCard.setCredit(1000000);

        //2.2. CreditCard is provided for Account class
        creditCard = new CreditCard(creditCard.getCardNumber(), creditCard.getCredit());
        account.setCreditCard(creditCard);

        //1.2. Account is provided for Customer class
        account = new Account(account.getAccountNumber(), account.getCreditCard());
        customer.setAccount(account);

        //4.
        branch.setBranchCode(1);
        branch.setCity("Tehran");
        branch.setGrade(GradeType.GRADE3);

        System.out.println(customer.toString());
        System.out.println(creditCard.toString());
        System.out.println(branch.toString());



    }
}
