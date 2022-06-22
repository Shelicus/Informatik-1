package blatt10.patrick.verzeichnis;

public class SysDirectory extends SysObjectBase{
    SysObjectBase[] sysObjects;
    String name;
    String owner;

    public SysDirectory(String name, SysObjectBase ... sysObjects){
    }

    /** Struktur des Verzeichnisses ermitteln
     *
     * @param indent Einrückung links (wird durch Rekursion verbreitert)
     * @return Struktur des Verzeichnisses als String
     */
    public String dirStructure(String indent){
        return indent + this.toString();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString(){
        return "class=" + getClass() + ", Name=" + name + ", User=" + owner + ", NumberOfObjects=" + sysObjects.length;
    }


    }

