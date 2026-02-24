package bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Создаём всех клиентов
        NaturalPerson boris = new NaturalPerson();
        LegalEntity macDuck = new LegalEntity();
        IndividualEntrepreneur kolya = new IndividualEntrepreneur();

        // Начальные балансы
        boris.allMoney = 1000;
        macDuck.allMoney = 5000;
        kolya.allMoney = 2000;

        while (true) {
            System.out.println("\n💰 БАЛАНСЫ:");
            System.out.println("1) Борис (физлицо): " + boris.allMoney);
            System.out.println("2) МакДак (юрик): " + macDuck.allMoney);
            System.out.println("3) Коля (ИП): " + kolya.allMoney);

            System.out.println("\n📋 ВЫБЕРИТЕ КЛИЕНТА:");
            System.out.println("1) Борис");
            System.out.println("2) МакДак");
            System.out.println("3) Коля");
            System.out.println("4) Выйти");
            System.out.print("Ваш выбор: ");

            String choice = scan.nextLine();

            switch (choice) {
                case "1":
                    workWithClient(boris, "Борис", scan);
                    break;
                case "2":
                    workWithClient(macDuck, "МакДак", scan);
                    break;
                case "3":
                    workWithClient(kolya, "Коля", scan);
                    break;
                case "4":
                    System.out.println("До свидания!");
                    return;
                default:
                    System.out.println("Неверный выбор!");
            }
        }
    }

    public static void workWithClient(Bank client, String name, Scanner scan) {
        while (true) {
            System.out.println("\n👤 Работа с клиентом: " + name);
            System.out.println("1) Положить деньги");
            System.out.println("2) Снять деньги");
            System.out.println("3) Посмотреть баланс");
            System.out.println("4) Вернуться к выбору клиента");
            System.out.print("Выбор: ");

            String choice = scan.nextLine();

            switch (choice) {
                case "1":
                    client.putMoney();
                    break;
                case "2":
                    client.takeMoney();
                    break;
                case "3":
                    client.allMoney();
                    break;
                case "4":
                    return;
                default:
                    System.out.println("Неверная команда!");
            }
        }
    }
}