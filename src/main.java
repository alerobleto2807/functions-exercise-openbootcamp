public class main {
    public static void main(String args []){
        System.out.println("***hello world developer***");
        sum(10,20,30);
        System.out.println("The result of my sum is:  " + sum(10,20,30));

        // now we go to create the instanc of our class here and make some many changes
        Coche miCoche =  new Coche();
        miCoche.newDoor();
        miCoche.newDoor();
        miCoche.newDoor();
        miCoche.newDoor();
        miCoche.newDoor();
        miCoche.newDoor();
        System.out.println("Tengo un nuevo coche con " + miCoche.doors + " puertas");
    }

    // first we go to build the sum function
    public static int sum(int a, int b, int c){
        return a + b + c;
    }


}

// the second exercises is build the class + function
class Coche{
    public int doors = 0;

    public void newDoor(){
        this.doors++;
    }
}