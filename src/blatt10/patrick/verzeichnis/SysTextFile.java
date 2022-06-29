package blatt10.patrick.verzeichnis;

public class SysTextFile extends SysObjectBase{
    private String type;
    private String text;


    public SysTextFile(String name, String type) {
        super(name);
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + ", Type=" + type + ", Length=" + (this.text == null ? "0": String.valueOf(this.text.length()));
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }



}
