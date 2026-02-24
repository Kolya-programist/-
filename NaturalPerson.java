package bank;

import java.util.Scanner;

public class NaturalPerson extends Bank {
    public static void main(String[] args) {
        System.out.println("Привет Борис");
        Scanner scan = new Scanner(System.in);
NaturalPerson boris = new NaturalPerson();
        System.out.println("Выберите команду: 1) Положить деньги 2) Снять деньги 3) Посмотреть все деньги");
        String answer = scan.nextLine();
        switch (answer){
            case "1":  boris.putMoney();
            break;

            case  "2": boris.takeMoney();
            break;

            case  "3": boris.allMoney();
            break;

            default:
                System.out.println("Я вас не понял!");
        }
    }
}
