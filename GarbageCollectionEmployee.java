import java.util.Random;

public class GarbageCollectionEmployee {
    static int ID, age,nextId = 1;
    static String name;
    public GarbageCollectionEmployee(int age, String name){
        this.ID = nextId++;
        this.name = name;
        this.age= age;
    }
    public static void show(){
        System.out.println("ID: "+ID+" name: "+name+" age: "+age);
    }

    public static void showNextId(){
        System.out.println("ID: "+nextId+" name: "+name+" age: "+age);
    }
    public static void main(String[] args){

        new GarbageCollectionEmployee(42,"Mangesh");
        show();
        showNextId();
        new GarbageCollectionEmployee(13,"Veena");
        show();
        showNextId();

    }
}
