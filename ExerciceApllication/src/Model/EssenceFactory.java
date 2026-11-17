package Model;
public class EssenceFactory implements EnginsFactory{

  public Scooter getScooter() {
    return new ScooterEssence();
  }

  public Automobile getAutomobile() {
    return new AutomobileEssence();
  }

  public Group getGroup() {
    return new GroupEssence();
  }

}
