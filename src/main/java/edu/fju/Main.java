package edu.fju;

public class Main {
    String id;
    int money;
    int discount;

    public Main(String id, int money, int discount) {
        this.id = id;
        this.money = money;
        this.discount = discount;
    }

    public void print() {
        System.out.println(id + " " + money + " " + discount + " " + (money-discount));
    }
}
