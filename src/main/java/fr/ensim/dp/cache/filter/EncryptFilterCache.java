package fr.ensim.dp.cache.filter;

import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;

public class EncryptFilterCache implements IFilterCache{
    private IFilterCache next;
    private static final String password = "mdp test";
    private static final String salt = "salt test";
    private static SecretKey getKeyFromPassword(String password, String salt) throws NoSuchAlgorithmException, InvalidKeySpecException {
        SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
        KeySpec spec = new PBEKeySpec(password.toCharArray(), salt.getBytes(), 65536, 256);
        SecretKey secret = new SecretKeySpec(factory.generateSecret(spec).getEncoded(), "AES");
        return secret;
    }
    @Override
    public byte[] doAdd(String key, byte[] buf) {
        byte[] cbuf =
        return new byte[0];
    }
    @Override
    public byte[] doRetreive(String key, byte[] buf) {
        return new byte[0];
    }
    @Override
    public IFilterCache setNext(IFilterCache next) {
        this.next=next;
        return this.next;
    }
}
