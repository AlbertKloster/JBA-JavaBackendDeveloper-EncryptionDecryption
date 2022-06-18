package encryptdecrypt;

public class CryptographerUnicode extends Cryptographer {

    protected CryptographerUnicode(Parameter parameter) {
        super(parameter);
    }

    @Override
    public char encodeChar(char ch) {
        return (char) (ch + parameter.getKey());
    }

    @Override
    public char decodeChar(char ch) {
        return (char) (ch - parameter.getKey());
    }
}
