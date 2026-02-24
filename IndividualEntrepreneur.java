package bank;

import java.util.Scanner;

public class IndividualEntrepreneur extends Bank {
    public static void main(String[] args) {
        System.out.println("Привет Коля");
        Scanner scan = new Scanner(System.in);
        IndividualEntrepreneur kolya = new IndividualEntrepreneur();

        for (;;) {
            System.out.println("Выберите команду: 1) Положить деньги 2) Снять деньги 3) Посмотреть все деньги");
            String answer = scan.nextLine();

            switch (answer) {
                case "1":
                    kolya.putMoney();
                    break;
                case "2":
                    kolya.takeMoney();
                    break;
                case "3":
                    kolya.allMoney();
                    break;
                default:
                    System.out.println("Я вас не понял!");
            }
        }
    }

    @Override
    public void putMoney() {
        System.out.println("Введите сколько денег хотите положить ");
        if (scan.hasNextInt()) {
            int putMoney = scan.nextInt();
            scan.nextLine();
            if (putMoney < 1000) {
                allMoney = allMoney + putMoney - (putMoney / 100);
                System.out.println("Деньги внесены! Комиссия 1%");
            } else {
                allMoney = allMoney + putMoney - (putMoney / 200);
                System.out.println("Деньги внесены! Комиссия 0.5%");
            }
        } else {
            System.out.println("Введите целые числа!");
        }
    }
}