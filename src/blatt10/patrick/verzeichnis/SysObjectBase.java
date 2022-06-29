package blatt10.patrick.verzeichnis;

public abstract class SysObjectBase {
    private String name;
    private String owner;

    public SysObjectBase(String name) {
        this.name = name;
        owner = System.getenv("USERNAME");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "class=" + getClass() + ", Name=" + name + ", User=" + owner;
    }
}
