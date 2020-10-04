package br.ufrn.imd;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("Singleton 1");
        System.out.println("Chamando singleton 1 !!!");
        System.out.println(singleton.value);

        Singleton outroSingleton = Singleton.getInstance("Singleton 2");
        System.out.println("Chamando singleton 2 !!!");
        System.out.println(outroSingleton.value);

    }
}
