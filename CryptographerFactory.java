package encryptdecrypt;

public abstract class CryptographerFactory {

    final Parameter parameter;

    protected CryptographerFactory(Parameter parameter) {
        this.parameter = parameter;
    }

    abstract Cryptographer create();

}
