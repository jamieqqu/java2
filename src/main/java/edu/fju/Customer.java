package edu.fju;

public class Customer {
    public static void main(String[] args) {
        Main[] main = {
                new Main("0013", 490,0),
                new Main("0052", 1000,100),
                new Main("0081", 290,0),
                new Main("2122", 2000,200)
        };

        for (int i = 0; i < main.length; i++) {
            main[i].print();
        }
    }
}
