package at.aau.itec.esop17.lesson08;

public class XorCipher extends Cipher {
    String key;
    public XorCipher(String key) {
        this.key = key;
    }

    @Override
    public String encode(String msg) {
        return Cipher.xor(msg, key);
    }

    @Override
    public String decode(String msg) {
        return encode(msg);
    }
}
