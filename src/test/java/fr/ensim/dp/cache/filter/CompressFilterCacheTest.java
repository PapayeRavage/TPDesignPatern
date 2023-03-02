package fr.ensim.dp.cache.filter;

import fr.ensim.dp.cache.DiskCache;
import fr.ensim.dp.cache.ICache;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompressFilterCacheTest {
    private static ICache dCache;
    private static IFilterCache cfcache;
    private static IFilterCache nextcache;
    private static String typeDir;
    private static String key;
    private static byte[] image;

    private static byte[] fichier;
    @BeforeAll
    public static void initTest(){
        typeDir= "type1";
        dCache =DiskCache.getInstance(typeDir);
        key = "keyTest";
        image = key.getBytes();
        cfcache = new CompressFilterCache();
        nextcache = new CountFilterCache();
    }
    @BeforeEach
    public void avantTest() {
    }

    @Test
    void testDoAdd() {
    }

    @Test
    void testDoRetreive() {
    }

    @Test
    void testSetNext() {
        IFilterCache expected = nextcache;
        IFilterCache actual = cfcache.setNext(nextcache);

    }
}