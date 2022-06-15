package blatt10.patrick.verzeichnis;

public class SysObjectBase {
    private String name;
    private String owner;

    private SysObjectBase(String name) {
        this.name = name;
        owner = System.getenv("USERNAME");
    }

    @Override
    public String toString() {
        return "class=" + getClass() + ", Name=" + name + ",| User=" + owner;
    }
}
