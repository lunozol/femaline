package cc.novoline.modules.misc;

import cc.novoline.events.EventTarget;
import cc.novoline.events.events.SettingEvent;
import cc.novoline.modules.AbstractModule;
import cc.novoline.gui.screen.setting.Manager;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.gui.screen.setting.SettingType;
import cc.novoline.modules.EnumModuleType;
import cc.novoline.modules.ModuleManager;
import cc.novoline.modules.configurations.annotation.Property;
import cc.novoline.modules.configurations.property.object.FloatProperty;
import cc.novoline.modules.configurations.property.object.PropertyFactory;
import org.lwjgl.input.Keyboard;


public final class Timer extends AbstractModule {

    // A property for controlling the timer speed
    @Property("timer-speed")
    private final FloatProperty timerSpeed = PropertyFactory.createFloat(1.0F).minimum(0.1F).maximum(10.0F);

    // Constructor
    public Timer(ModuleManager moduleManager) {
        super(moduleManager, "Timer", "Timer", Keyboard.KEY_T, EnumModuleType.MISC, "Adjusts the Minecraft timer speed");
        Manager.put(new Setting("TIMER_SPEED", "Timer Speed", SettingType.SLIDER, this, timerSpeed, 0.1F));
    }

    // Called when the module is enabled
    @Override
    public void onEnable() {
        mc.timer.timerSpeed = timerSpeed.get(); // Set the timer speed based on the property
        super.onEnable();
    }

    // Called when the module is disabled
    @Override
    public void onDisable() {
        mc.timer.timerSpeed = 1.0F; // Reset the timer when the module is turned off
        super.onDisable();
    }

    // Event listener: Handle slider value changes
    @EventTarget
    public void onSetting(SettingEvent event) {
        if (event.getSettingName().equals("TIMER_SPEED")) {
            mc.timer.timerSpeed = timerSpeed.get(); // Dynamically update the timer speed when the slider changes
        }
    }
}
