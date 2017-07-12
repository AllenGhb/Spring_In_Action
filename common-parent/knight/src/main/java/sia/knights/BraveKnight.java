package sia.knights;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/7/12
 */
public class BraveKnight implements Knight {

    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}
