package blatt10.david;

public abstract class SysObjectBase {
    private String name;
    private String owner;

    /** Constructor
     * @param name of the Object
     * owner is the Owner of the User
     */
    SysObjectBase(String name){
        this.name = name;
        this.owner = System.getenv("USERNAME");
    }

    /** Setter Owner
     * @param owner
     */
    protected void setOwner(String owner) {
        this.owner = owner;
    }

    /** Setter Name
     * @param name
     */
    protected void setName(String name) {
        this.name = name;
    }

    /** Getter Name
     */
    protected String getName(){
        return this.name;
    }

    /** Getter Owner
     */
    protected String getOwner(){
        return this.owner;
    }


    /**Override toString
     * @return prints the Class, Name and User
     */
    @Override
    public String toString() {
        return String.format("Class=%s, Name=%s, User=%s,",
                this.getClass().getSimpleName(), this.getName(), this.getOwner());
    }

}
