package emu.grasscutter.game.quest.content;

import emu.grasscutter.data.excels.QuestData;
import emu.grasscutter.game.quest.GameQuest;
import emu.grasscutter.game.quest.QuestValue;
import emu.grasscutter.game.quest.enums.QuestTrigger;
import emu.grasscutter.game.quest.handlers.QuestBaseHandler;

@QuestValue(QuestTrigger.QUEST_CONTENT_DESTROY_GADGET)
public class ContentDestroyGadget extends QuestBaseHandler {
    @Override
    public boolean execute(GameQuest quest, QuestData.QuestCondition condition, String paramStr, int... params) {
        return condition.getParam()[0] == params[0];
    }
}