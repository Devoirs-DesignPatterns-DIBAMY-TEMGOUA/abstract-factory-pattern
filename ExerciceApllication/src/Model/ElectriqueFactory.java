public class ElectriqueFactory implements EnginsFactory{
public Scooter getScooter() {
    return new ScooterElectrique();
  }

  public Automobile getAutomobile() {
    return new AutomobileElectrique();
  }

  public Group getGroup() {
    return new GroupElectrique();
  }

 
}
