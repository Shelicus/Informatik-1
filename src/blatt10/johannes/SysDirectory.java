package blatt10.johannes;

/** Class extends SysObjectBase
 * @author Zebra
 */
public class SysDirectory extends SysObjectBase {
	private SysObjectBase[] sysObjects;
	
	/** Constructor
	 * @param name uses super
	 * @param SysObjectBase sysObjects
	 */
	SysDirectory(String name, SysObjectBase... sysObjects) {
		super(name);
		this.sysObjects = sysObjects;
	}

	/** Number of Objects
	 * @return the length of the Array sysObjects
	 */
	private int getNumberOfObjects() {
		return this.sysObjects.length;
	}

	/** Overrides the to String
	 */
	@Override
	public String toString() {
		return super.toString() + String.format(" NumberOfObjects=%d", getNumberOfObjects());
	}
	
	/** Struktur des Verzeichnisses ermitteln
	 * @param indent Einrückung links (wird durch Rekursion verbreitert)
	 * @return Struktur des Verzeichnisses als String
	 */
	 public String dirStructure(String indent) {
		String ret = indent + this.toString() + "\n";
		indent += "| - ";
		for(SysObjectBase obj : sysObjects) {
			if(obj instanceof SysDirectory) {
				SysDirectory dir = (SysDirectory)obj;
				ret += dir.dirStructure(indent);
			} else {
				ret += indent + obj.toString() + "\n";
			}
		}
		return ret;
	 }
	 
//	 public String dirStructure(String indent) {
//		String ret = "";
//		for(Object obj : sysObjects) {
//			if(obj.getClass().getSimpleName().equals("SysTextFile")) {
//				ret += indent + obj.toString() + "\n";
//				continue;
//			} else {
//				ret += indent + obj.toString() + "\n";
//				dirStructure(indent + "| - ");
//			}
//		} 
//		return ret;
//	 }

	public static void main(String[] args) {
		SysTextFile hello = new SysTextFile("Hello", "java");
		hello.setText("public class HelloWorld{/*...*/}");
		SysTextFile test = new SysTextFile("Test", "java");
		SysTextFile prt = new SysTextFile("PrintClass", "java");
		SysDirectory srcDir = new SysDirectory("SRC", hello, test, prt);
		
		SysTextFile todo = new SysTextFile("Todos", "txt");
		SysTextFile toget = new SysTextFile("Eggs", "rtm");
		SysDirectory txtDir = new SysDirectory("txt", todo, toget);

		SysDirectory home = new SysDirectory("home", srcDir, txtDir);
		srcDir.setName("SRC");
		toget.setName("Einkaufsliste");
		home.setName("HOME");
		home.setOwner("brul0001");
//		System.out.printf("%s\n", home);
		
		System.out.printf("%s\n", home.dirStructure(""));
	}

}
