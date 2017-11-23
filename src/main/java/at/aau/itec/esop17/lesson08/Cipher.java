package at.aau.itec.esop17.lesson08;

public abstract class Cipher {
    public abstract String encode(String msg);

    public abstract String decode(String msg) ;


    static String xor(String input, String secret) {
        byte[] in = input.getBytes();
        byte[] key = secret.getBytes();
        byte[] out = new byte[in.length];
        for (int i = 0; i < in.length; i++) {
            out[i] = (byte) (in[i] ^ key[i%key.length]);
        }
        return new String(out);
    }
}
