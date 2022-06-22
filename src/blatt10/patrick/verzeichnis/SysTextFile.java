package blatt10.patrick.verzeichnis;

public class SysTextFile extends SysObjectBase{
    private String type;
    private String text;
    private String name;


    public SysTextFile(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "class=" + getClass() + ", Name=" + name + ", Type=" + type + ", Length=" + text.length();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
