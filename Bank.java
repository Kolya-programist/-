package bank;

import java.util.Scanner;

public class Bank extends Clients {
    protected Scanner scan = new Scanner(System.in);
    protected int allMoney = 0;

    @Override
    public void allMoney() {
        System.out.println(allMoney);
    }

    @Override
    public void putMoney() {
        System.out.println("Введите сколько денег хотите положить ");
        if (scan.hasNextInt()) {
            int putMoney = scan.nextInt();
            scan.nextLine();
            allMoney += putMoney;
            System.out.println("Деньги внесены!");
        } else {
            System.out.println("Введите целые числа!");
        }
    }

    @Override
    public void takeMoney() {
        System.out.println("Введите сколько денег хотите снять ");
        if (scan.hasNextInt()) {
            int takeMoney = scan.nextInt();
            scan.nextLine();
            if (allMoney < takeMoney) {
                System.out.println("На балансе недостаточно средств!");
            } else {
                allMoney -= takeMoney;
                System.out.println("Деньги сняты!");
            }
        } else {
            System.out.println("Введите целые числа!");
        }
    }
}
