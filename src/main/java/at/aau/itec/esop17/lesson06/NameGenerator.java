package at.aau.itec.esop17.lesson06;

public class NameGenerator {
    // static String[] titles = {"Almighty", "Lord", "Lady", "Fearsome", "Tiny", "Big", "Nervous", "Mad", "Strong", "Boring", "Bald", "Stinky"};
    public static void main(String[] args) {
        String[] titles = {"Almighty", "Lord", "Lady", "Fearsome", "Tiny", "Big", "Nervous", "Mad", "Strong", "Boring", "Bald", "Stinky"};
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        char[] consonants = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l',
                'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
        char[] pattern = "tvccvvc".toCharArray();
        for (int i = 0; i < pattern.length; i++) {
            if (pattern[i] == 'c') {
                System.out.print(getRandomChar(consonants));
            } else if (pattern[i] == 't') {
                System.out.print(getRandomString(titles) + " ");
            } else if (pattern[i] == 'v') {
                System.out.print(getRandomChar(vowels));
            }

        }
    }

    private static char getRandomChar(char[] letters) {
        // vowels[(int) (System.nanoTime() % vowels.length)]
        return letters[(int) (System.nanoTime() % letters.length)];
    }

    private static String getRandomString(String[] strings) {
        return strings[(int) (System.nanoTime() % strings.length)];
    }
}
