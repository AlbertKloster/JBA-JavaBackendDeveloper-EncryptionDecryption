package encryptdecrypt;

abstract class Cryptographer {
    public final Parameter parameter;

    protected Cryptographer(Parameter parameter) {
        this.parameter = parameter;
    }

    public void start() {
        setData();
        print(code());
    }

    void setData() {
        if (parameter.getData() == null)
            parameter.setData(FileHandler.load(parameter.getIn()));
    }

    public String code() {
        StringBuilder builder = new StringBuilder();
        for (char ch : parameter.getData().toCharArray())
            builder.append(parameter.getMode().equals("dec") ? decodeChar(ch) : encodeChar(ch));
        return builder.toString();
    }

    void print(String data) {
        if (parameter.getOut() == null)
            System.out.println(data);
        else
            FileHandler.save(data, parameter.getOut());
    }

    abstract char encodeChar(char ch);
    abstract char decodeChar(char ch);

}
