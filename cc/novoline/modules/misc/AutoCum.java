package cc.novoline.modules.misc;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.EnumModuleType;
import cc.novoline.modules.ModuleManager;
import org.checkerframework.checker.nullness.qual.NonNull;

public final class AutoCum extends AbstractModule {

    public AutoCum(@NonNull ModuleManager novoline) {
        super(novoline, EnumModuleType.MISC, "AutoCum", "Automatically cums for you");
    }

    @Override
    public void onEnable()  {
        System.out.println("AutoCum module enabled. Cumming...");
        mc.player.sendChatMessage("cum for mommy | ft. femaline!");
    }

    @Override
    public void onDisable() {
        System.out.println("AutoCum module disabled. Stopping...");
    }
}
