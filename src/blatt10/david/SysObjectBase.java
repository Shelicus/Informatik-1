package blatt10.david;

public class SysObjectBase {
    private String name;
    private String owner;

    public String getterName(){
        return this.name;
    }

    public String getterOwner(){
        return this.owner;
    }

    private SysObjectBase(String name){
        this.name = name;
        owner = System.getenv("USERNAME");
    }

    @Override
    public String toString() {
        return "class=" + getClass() + ", Name=" + name + ", User=" + owner;
    }
}
