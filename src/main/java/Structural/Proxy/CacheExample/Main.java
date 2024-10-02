package Structural.Proxy.CacheExample;

public class Main {
    public static void main(String[] args) {
        DatabaseFetcher databaseFetcher = new DatabaseFetcher();
        DataFetcher dataFetcher = new CacheProxy(databaseFetcher);
        // İlk sorğu bazadan gələcək
        System.out.println("1-ci sorğu: " + dataFetcher.fetch(28));

        // Eyni sorğu ikinci dəfə çağrılarkən keştən gələcək
        System.out.println("2-ci sorğu: " + dataFetcher.fetch(28));

        // Yeni sorğu bazadan gələcək
        System.out.println("3-cü sorğu: " + dataFetcher.fetch(10));
        System.out.println("4-cü sorğu: " + dataFetcher.fetch(23));


    }
}
