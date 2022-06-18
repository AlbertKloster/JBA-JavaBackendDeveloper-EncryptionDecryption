package encryptdecrypt;

public class Main {

    public static void main(String[] args) {
        CryptographerBuilder cryptographerBuilder = new CryptographerBuilder(ParameterHandler.getParameter(args));
        Cryptographer cryptographer = cryptographerBuilder.create();
        cryptographer.start();
    }

}
