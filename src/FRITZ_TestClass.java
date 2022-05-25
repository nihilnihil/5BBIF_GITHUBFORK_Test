public class FRITZ_TestClass {

    String myString;

    public FRITZ_TestClass() {
        this.myString = "Allen steht das Wasser bis zum Hals nur nicht...";
    }


    public String getMyString() {
        return myString;
    }

    public void setMyString(String myString) {
        this.myString = myString;
    }

    @Override
    public String toString() {
        return "FRITZ_TestClass{" +
                "myString='" + myString + '\'' +
                '}';
    }

    public void testTest(){

    }
}
