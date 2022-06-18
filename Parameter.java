package encryptdecrypt;

public class Parameter {
    private String mode = null;
    private String data = null;
    private int key = 0;
    private String in = null;
    private String out = null;
    private String alg = null;

    public Parameter() {
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getData() {
        return (data == null && in == null) ? "" : data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getIn() {
        return data != null ? null : in;
    }

    public void setIn(String in) {
        this.in = in;
    }

    public String getOut() {
        return out;
    }

    public void setOut(String out) {
        this.out = out;
    }

    public String getAlg() {
        return alg == null ? "shift" : alg;
    }

    public void setAlg(String alg) {
        this.alg = alg;
    }
}
