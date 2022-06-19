package blatt10.patrick.verzeichnis;

public class SysTextFile{
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



}
