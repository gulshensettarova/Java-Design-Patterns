package Structural.Proxy.CacheExample;

import java.util.HashMap;
import java.util.Map;

public class CacheProxy implements DataFetcher{
    private DatabaseFetcher databaseFetcher;
    private Map<Integer, String> cache = new HashMap<>();

    public CacheProxy( DatabaseFetcher databaseFetcher ) {
        this.databaseFetcher = databaseFetcher;
        this.cache = new HashMap<>();    }

    @Override
    public String fetch(Integer key) {
        if (cache.containsKey(key)) {
            System.out.println("Məlumat keştən gətirilir...");
            return cache.get(key);
        }
        // Əgər məlumat keştə yoxdursa, onu bazadan gətiririk və keşə əlavə edirik
        String data = databaseFetcher.fetch(key);
        cache.put(key, data);
        return data;
    }
}
