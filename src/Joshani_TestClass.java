public class Joshani_TestClass {
    String txt;

    public Joshani_TestClass() {
        txt = "noch einen kleinen Witz!";
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    @Override
    public String toString() {
        return "Joshani_TestClass{" +
                "txt='" + txt + '\'' +
                '}';
    }
}
