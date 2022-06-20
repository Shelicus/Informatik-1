package blatt10.patrick.verzeichnis;

public class SysTextFile{
    private String type;
    private String text;

    public SysTextFile(String type, String text) {
        this.type = type;
        this.text = text;
    }

    @Override
    public String toString() {
        return "class=" + getClass() + ", Name=";
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }



}
