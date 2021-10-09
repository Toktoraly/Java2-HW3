package com.company;

public class Main {

    public static void main(String[] args) throws LimitException {
        BankAccount bankAccount = new BankAccount(0);
        bankAccount.deposit(20000);
        System.out.println("Ваш остаток равен: " + bankAccount.getAmount());
        while (true) {
            try {

                bankAccount.withDraw(6000);
                System.out.println("Вы обналичили 6000 ");
                System.out.println("Ваш остаток равен: " + bankAccount.getAmount());
            } catch (LimitException e) {
                System.out.println(e.getMessage()+
                        "\nВы обналичили весь остаток: " + bankAccount.getAmount());
                bankAccount.withDraw(bankAccount.getAmount());
                System.out.println("Ваш баланс в данный момент составляет:" + bankAccount.getAmount()+ "    " +
                        "\nположите еще наличку");


                break;
            }

        }


    }
}
