public class Artifact {
    private int serialName;
    private String culture;
    private int century;
    static int count=0;
    public Artifact(){

    }
    //First Artifact

    public Artifact(int serialName) {
        this.serialName = serialName;
        count++;
    }
    //Second Artifact

    public Artifact(int serialName, String culture) {
        this.serialName = serialName;
        this.culture = culture;
        count++;
    }

    public Artifact(int serialName, String culture, int century) {
        this.serialName = serialName;
        this.culture = culture;
        this.century = century;

        System.out.println("Artifact N" + count++ + "," + serialName );
        System.out.println("Artifact N" + count++ + "," + serialName + culture );
        System.out.println("Artifact N" + count++ + "," + serialName + culture + century );
    }
}
