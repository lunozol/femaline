package cc.novoline.modules.move;

import cc.novoline.events.EventTarget;
import cc.novoline.events.events.MotionUpdateEvent;
import cc.novoline.events.events.MoveEvent;
import cc.novoline.events.events.PacketEvent;
import cc.novoline.events.events.TickUpdateEvent;
import cc.novoline.gui.screen.setting.Manager;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.gui.screen.setting.SettingType;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.EnumModuleType;
import cc.novoline.modules.ModuleManager;
import cc.novoline.modules.configurations.annotation.Property;
import cc.novoline.modules.configurations.property.object.*;
import cc.novoline.modules.exploits.Disabler;
import cc.novoline.utils.*;
import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C03PacketPlayer;
import net.minecraft.network.play.client.C08PacketPlayerBlockPlacement;
import net.minecraft.network.play.client.C09PacketHeldItemChange;
import net.minecraft.network.play.server.S08PacketPlayerPosLook;
import net.minecraft.potion.Potion;
import org.checkerframework.checker.nullness.qual.NonNull;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.settings.KeyBinding;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Flight extends AbstractModule {




    public Flight(@NonNull ModuleManager novoline) {
        super(novoline, EnumModuleType.MOVEMENT, "Flight", "Flight");
        //   Manager.put(new Setting("FLY_DMG_MODE", "Damage", SettingType.COMBOBOX, this, dmg_mode));
    }

    public void onEnable() {
        disable();
    }
}