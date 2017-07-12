package sia.knights;

public class DamselRescuingKnight implements Knight {

  private RescueDamselQuest quest;

  /**
   *  与quest紧耦合了
   */
  public DamselRescuingKnight() {
    this.quest = new RescueDamselQuest();
  }

  public void embarkOnQuest() {
    quest.embark();
  }

}
