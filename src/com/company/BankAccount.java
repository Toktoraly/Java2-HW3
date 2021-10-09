package com.company;

public class BankAccount {
    private double amount;

    public BankAccount(double amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return (int) amount;
    }

    public void deposit(double sum){
        amount+=sum;
    }
    public void withDraw(int sum) throws LimitException {
        if (sum>amount){
            throw  new   LimitException("Запрашиваемая сумма превышает остаток. Вы можете обналичить только"+ amount,amount);
        }   else {
            amount -=sum;
        }
        }

}
