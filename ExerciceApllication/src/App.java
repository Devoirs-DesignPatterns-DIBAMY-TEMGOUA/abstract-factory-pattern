
import Model.Automobile;
import Model.ElectriqueFactory;
import Model.EnginsFactory;
import Model.EssenceFactory;
import Model.Scooter;
import Model.Group;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        EnginsFactory essenceFactory = new EssenceFactory();
        EnginsFactory electriqueFactory = new ElectriqueFactory();

    Scooter scooter = null;
    Automobile automobile = null;
    Group group = null;

    System.out.println("Utilisation de la premiere fabrique");
    scooter = essenceFactory.getScooter();
    automobile = essenceFactory.getAutomobile();
    group = essenceFactory.getGroup();
    scooter.methodeScooter();
    automobile.methodeAutomobile();
    group.methodeGroup();

    System.out.println("Utilisation de la seconde fabrique");
    scooter = electriqueFactory.getScooter();
    automobile = electriqueFactory.getAutomobile();
    group = electriqueFactory.getGroup();
    scooter.methodeScooter();
    automobile.methodeAutomobile();
    group.methodeGroup();

    }
}
