package blatt10.david;


public class SysTextFile extends SysObjectBase {
    private String text;
    private final String type;

    /** Constructor
     * @param name uses super
     * @param type Textfiletype
     */
    SysTextFile(String name, String type){
        super(name);
        this.type = type;
        this.text = "";
    }

    /** Setter Text
     * @param text
     */
    protected void setText(String text) {
        this.text = text;
    }

    /** Getter Text
     * @return text
     */
    protected String getText() {
        return this.text;
    }

    /**Overrides toString
     * @return prints the Class, Name and User + Type, Textlength
     */
    @Override
    public String toString() {
        return super.toString() + String.format(" Type=%s,Length=%s", this.type, this.text.length());
    }


    public static void main(String[] args) {
        SysTextFile stf = new SysTextFile("Hello", "java");
        stf.setText("public class HelloWorld{/*...*/}");
        System.out.printf("%s:\n %s\n\n", stf, stf.getText() );
    }


}
