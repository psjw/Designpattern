package step1;

public class Request {
    private int a,b;
    private String opreator;

    public Request(int a, int b, String opreator) {
        this.a = a;
        this.b = b;
        this.opreator = opreator;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getOpreator() {
        return opreator;
    }

    public void setOpreator(String opreator) {
        this.opreator = opreator;
    }
}
