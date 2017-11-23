package at.aau.itec.esop17.lesson08;

import java.io.StringWriter;

/**
 * Implementation of the classical Cesar cipher algorithm, which just uses a number to move every letter up
 * or down the alphabet the same amount of steps. Alternatives are the ENIGMA algorithm, XOR, or a translation
 * table
 */
public class CesarCipher extends Cipher{
    int key = 0;

    public CesarCipher(int key) {
        this.key = key;
    }

    public String encode(String msg) {
        StringWriter result = new StringWriter(msg.length());
        for (int i = 0; i < msg.toCharArray().length; i++) {
            char c = msg.toCharArray()[i];
            result.append(((char) (c + key)));
        }
        return result.toString();
    }

    public String decode(String msg) {
        key = -key;
        String result = encode(msg);
        key = -key;
        return result;
    }
}
