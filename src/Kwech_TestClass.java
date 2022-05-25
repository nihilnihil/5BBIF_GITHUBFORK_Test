public class Kwech_TestClass {
    String str;


    public Kwech_TestClass() {
        str = new String("Großer Witz!");
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Kwech_TestClass{" +
                "str='" + str + '\'' +
                '}';
    }
}
