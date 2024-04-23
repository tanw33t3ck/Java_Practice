// Simple car loan calculator that checks for certain conditions before calculating the monthly payment.

public class CarLoan {
    int carLoan = 10000;
    int loanLength = 3;
    int interestRate = 5;
    int downPayment = 2000;

    public static void main(String[] args) {
        CarLoan carLoan1 = new CarLoan();
        if(carLoan1.loanLength <= 0 || carLoan1.interestRate <= 0) {
            System.out.println("Error! You must take out a valid car loan.");
        } else if (carLoan1.downPayment >= carLoan1.carLoan) {
            System.out.println("The car can be paid in full.");
        } else {
            int remainingBalance = carLoan1.carLoan - carLoan1.downPayment;
            int months = carLoan1.loanLength * 12;
            int monthlyBalance = remainingBalance/months;
            int interest = (monthlyBalance * carLoan1.interestRate)/100;
            int monthlyPayment = monthlyBalance + interest;
            System.out.println(monthlyPayment);

        }
    }
}