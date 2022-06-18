package encryptdecrypt;

public class CryptographerBuilder extends CryptographerFactory {

    protected CryptographerBuilder(Parameter parameter) {
        super(parameter);
    }

    @Override
    public Cryptographer create() {
        if (parameter.getAlg().equals("unicode"))
            return new CryptographerUnicode(parameter);
        return new CryptographerShift(parameter);
    }
}
