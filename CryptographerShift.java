package encryptdecrypt;

public class CryptographerShift extends Cryptographer {
    private final int NUMBER_OF_LETTERS = 26;

    protected CryptographerShift(Parameter parameter) {
        super(parameter);
    }

    @Override
    public char encodeChar(char ch) {
        int a = getA(ch);
        if (Character.isAlphabetic(ch))
            return (char) (a + (ch - a + parameter.getKey()) % NUMBER_OF_LETTERS);
        return ch;
    }

    @Override
    public char decodeChar(char ch) {
        int z = getZ(ch);
        if (Character.isAlphabetic(ch))
            return (char) (z - (z - ch + parameter.getKey()) % NUMBER_OF_LETTERS);
        return ch;
    }

    private char getA(char ch) {
        return Character.isLowerCase(ch) ? 'a' : 'A';
    }

    private char getZ(char ch) {
        return Character.isLowerCase(ch) ? 'z' : 'Z';
    }

}
