public class hojati {
    String str;

    public hojati(){ str = new String("Ein Witz");}



    public void setStr(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    @Override
    public String toString() {
        return "hojati{" +
                "str='" + str + '\'' +
                '}';
    }
}
