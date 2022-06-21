package blatt10.david;

public class SysTextFile extends SysObjectBase{
    private String type;
    private String text;

    public SysTextFile(String type, String text) {
        this.type = type;
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "class=" + getClass() + ", Name=" + getterName() + ", User=" + getterOwner() + ", Type=" + type + ", Length=" +text.length();
    }

    public static void main(String[] args) {
        SysTextFile stf = new SysTextFile("Hello", "java");
        stf.setText("public class HelloWorld{/*...*/}");
        System.out.printf("%s:\n %s\n\n", stf, stf.getText() );
    }

}
