package emu.lunarcore.data.excel;

import java.util.ArrayList;

import emu.lunarcore.data.GameData;
import emu.lunarcore.data.GameDepot;
import emu.lunarcore.data.GameResource;
import emu.lunarcore.data.ResourceType;
import emu.lunarcore.data.ResourceType.LoadPriority;
import emu.lunarcore.game.enums.RogueBuffAeonType;
import emu.lunarcore.game.enums.RogueBuffCategory;
import lombok.Getter;

@Getter
@ResourceType(name = {"RogueBuff.json"}, loadPriority = LoadPriority.LOW)
public class RogueBuffExcel extends GameResource {
    private int MazeBuffID;
    private int MazeBuffLevel;
    private int RogueBuffType;
    private int RogueBuffTag;
    private int AeonID;
    private RogueBuffCategory RogueBuffCategory = emu.lunarcore.game.enums.RogueBuffCategory.None;
    private RogueBuffAeonType BattleEventBuffType = RogueBuffAeonType.Normal;

    @Override
    public int getId() {
        return (MazeBuffID << 4) + MazeBuffLevel;
    }

    public boolean isAeonBuff() {
        return this.BattleEventBuffType != RogueBuffAeonType.Normal;
    }

    @Override
    public void onLoad() {
        // Add to random buff list
        if (RogueBuffType >= 120 && RogueBuffType <= 128 && RogueBuffCategory.getVal() >= 1 && RogueBuffCategory.getVal() <= 3 && MazeBuffLevel == 1 && AeonID == 0) {
            GameDepot.getRogueRandomBuffList().add(this);
        }

        // Add to aeon buff list
        if (BattleEventBuffType == RogueBuffAeonType.BattleEventBuff) {
            GameDepot.getRogueAeonBuffs().put(this.getAeonID(), this);
        } else if (BattleEventBuffType == RogueBuffAeonType.BattleEventBuffEnhance) {
            GameDepot.getRogueAeonEnhanceBuffs().computeIfAbsent(this.getAeonID(), e -> new ArrayList<>()).add(this);
        }
        
        GameData.getRogueBuffTagExcelMap().put(this.getRogueBuffTag(), this);
    }
}
