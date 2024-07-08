
// Banking system, deposit, withdrawal and transfer
public class Main {
    public  static void main(String[] args) {
//        BankAccount Faith = new BankAccount(" Faith ");
//        Faith.deposit(10000.00);
//        BankAccount Adaora = new BankAccount("Adaora");
//        Adaora.deposit(2000.00);
//        Adaora.withdrawal(6000);
//        Faith.transfer (1000.00,Adaora);
//        System.out.println(Adaora.getBalance());
//        Artifact artifact1 = new Artifact(202020);
//        Artifact artifact2 = new Artifact(212121,"Igbo Culture");
//        Artifact artifact3 = new Artifact(222222, "Maltese Culture", 1904);
        StudentGrade Kene = new StudentGrade( "Kene");
        Kene.add("English", 'A');
        Kene.add("Mathematics", 'B');
        Kene.add("Computer", 'B');
        Kene.add("Biology", 'A');
        System.out.println(Kene.getName() +  " has CGPA of " + Kene.getGPA());
        System.out.println("It is obtained " + "from this subjects:");
        for(String str: Kene.getSubject()){
            System.out.println(str);
        }


    }
}


