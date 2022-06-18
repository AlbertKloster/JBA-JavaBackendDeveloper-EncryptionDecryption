package encryptdecrypt;

public class ParameterHandler {

    public static Parameter getParameter(String[] args) {
        Parameter parameter = new Parameter();
        for (int i = 0; i < args.length - 1; i++)
            setParameterFields(parameter, args[i], args[i + 1]);
        return parameter;
    }

    private static void setParameterFields(Parameter parameter, String field, String value) {
        if (field.equals("-mode"))
            parameter.setMode(value);

        if (field.equals("-data"))
            parameter.setData(value);

        if (field.equals("-key"))
            parameter.setKey(Integer.parseInt(value));

        if (field.equals("-in"))
            parameter.setIn(value);

        if (field.equals("-out"))
            parameter.setOut(value);

        if (field.equals("-alg"))
            parameter.setAlg(value);
    }
}
