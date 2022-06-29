package blatt10.patrick.verzeichnis;

public class SysDirectory extends SysObjectBase{
    SysObjectBase[] sysObjects;

    public SysDirectory(String name, SysObjectBase ... sysObjects){
        super(name);
        this.sysObjects = sysObjects;

    }

    /** Struktur des Verzeichnisses ermitteln
     *
     * @param indent Einrückung links (wird durch Rekursion verbreitert)
     * @return Struktur des Verzeichnisses als String
     */
    public String dirStructure(String indent){
        String s = "";
        indent += "| - ";

        for (SysObjectBase sysObject : sysObjects) {
            if (sysObject instanceof SysDirectory) {
                s+= indent + sysObject.toString() + "\n";
                s += ((SysDirectory)sysObject).dirStructure(indent);
            } else {
                s += indent + sysObject.toString() + "\n";
            }
        }
        return s;
    }

    @Override
    public String toString(){
        return super.toString() +" NumberOfObjects=" + sysObjects.length;
    }


    }

