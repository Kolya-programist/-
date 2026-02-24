package bank;
public class LegalEntity extends Bank{

    @Override
    public void putMoney(){
        System.out.println("Введите сколько денег хотите положить ");
        if(scan.hasNextInt()){
            int putMoney = scan.nextInt();
            scan.nextLine();
            allMoney = allMoney + putMoney - (putMoney / 100);
            System.out.println("Деньги внесены! Комиссия: " + (putMoney/100));
        }
        else {
            System.out.println("Введите целые числа!");
        }
    }

    @Override
    public void takeMoney(){
        System.out.println("Введите сколько денег хотите снять ");
        if(scan.hasNextInt()){
            int takeMoney = scan.nextInt();
            scan.nextLine();

            int total = takeMoney + (takeMoney / 100);

            if(allMoney >= total) {
                allMoney -= total;
                System.out.println("Деньги сняты! Комиссия: " + (takeMoney/100));
                System.out.println("Остаток: " + allMoney);
            } else {
                System.out.println("Недостаточно средств! Нужно: " + total + " (с комиссией)");
            }
        }
        else {
            System.out.println("Введите целые числа!");
        }
    }
}