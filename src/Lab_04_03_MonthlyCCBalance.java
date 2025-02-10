public class Lab_04_03_MonthlyCCBalance {
    public static void main(String[] args) {

        double balance = 5000.0;
        double monthlyInterestRate = 0.17;

        double interestOneMonth = balance * monthlyInterestRate;
        double balanceAfterOneMonth = balance + interestOneMonth;

        double interestTwoMonths = balanceAfterOneMonth * monthlyInterestRate;
        double balanceAfterTwoMonths = balanceAfterOneMonth + interestTwoMonths;

        System.out.println("Initial credit card balance: $" + balance);
        System.out.println("Interest due after one month: $" + interestOneMonth);
        System.out.println("Balance after one month: $" + balanceAfterOneMonth);
        System.out.println("Interest due after two months: $" + interestTwoMonths);
        System.out.println("Balance after two months: $" + balanceAfterTwoMonths);


    }
}
