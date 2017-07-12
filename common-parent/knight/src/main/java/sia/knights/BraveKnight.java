package sia.knights;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/7/12
 */
public class BraveKnight implements Knight {

    private Quest quest;

    /**
     * 依赖注入方式之一:构造器注入
     */
    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}
