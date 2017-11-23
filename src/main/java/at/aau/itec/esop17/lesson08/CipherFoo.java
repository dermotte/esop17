package at.aau.itec.esop17.lesson08;

public class CipherFoo {
    public static void main(String[] args) {
        Cipher ciph = new CesarCipher(4);
        String msg = "Hello ESOP!";
        String encodedMsg = ciph.encode(msg);
        System.out.println("Encoded message: \t" + encodedMsg);
        System.out.println("Decoded message: \t" + ciph.decode(encodedMsg));

        //System.out.println(Cipher.xor(Cipher.xor(msg, "foo"), "foo"));
    }
}
