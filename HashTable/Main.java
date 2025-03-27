package HashTable;
import HashTable.Employee;
import HashTable.SimpleHashTable;
public class Main {

    public static void main(String args[]){
        Employee Sheetal = new Employee("Sheetal","Mohite",353156);
        Employee Veena = new Employee("Veena","VM",00011);
        Employee Ajay = new Employee("Ajay","S",98987);
        Employee Sanjib = new Employee("Sanjib","V",109872);
        Employee Sentil = new Employee("Sentil","Raja",97161);
        Employee Ayush = new Employee("Ayush","K",122763);
        Employee Rituja = new Employee("Rituja","More",122763);

        /*
        Collission
         */
        Employee Assh = new Employee("Assh","M",1);
        Employee Askh = new Employee("Askh","D",1);


        SimpleHashTable eHT = new SimpleHashTable();
       eHT.put("Sheetal", Sheetal);
       eHT.get("Sheetal");

        eHT.put("Assh", Assh);
        eHT.get("Assh");

        eHT.put("Askh", Askh);
        eHT.get("Askh");

        eHT.put("Veena", Veena);
        eHT.get("Veena");

        eHT.put("Ajay", Ajay);
        eHT.get("Ajay");

        eHT.put("Sanjib", Sanjib);
        eHT.get("Sanjib");

        eHT.put("Sentil", Sentil);
        eHT.get("Sentil");

        eHT.put("Ayush", Ayush);
        eHT.get("Ayush");

        eHT.put("Rituja", Rituja);
        eHT.get("Rituja");

       eHT.printHashTable();

    }
}
