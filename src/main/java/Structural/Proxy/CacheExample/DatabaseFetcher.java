package Structural.Proxy.CacheExample;

import java.util.HashMap;
import java.util.Map;

public class DatabaseFetcher implements DataFetcher{
    private Map<Integer,String> database;

    public DatabaseFetcher(){
        this.database=new HashMap<>();
        database.put(28,"first");
        database.put(10,"date");
        database.put(23,"infinity");
    }
    @Override
    public String fetch(Integer key) {
        System.out.println("Verilənlər bazasından məlumat gətirilir...");
        return database.getOrDefault(key, "Məlumat tapılmadı");
    }
}
