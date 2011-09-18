package com.cppmonkey.monkeymod;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

import com.cppmonkey.monkeymod.modules.DebugModule;

public class MonkeyMod extends JavaPlugin {

	public final static Logger log = Logger.getLogger("Minecraft");
	DebugModule m_debugModule;

	public MonkeyMod() {
		m_debugModule = new DebugModule(this);
	}


	public void onDisable() {
		m_debugModule.onDisable();
		// TODO onDisable() Save files
	}

	public void onEnable() {
		m_debugModule.onEnable();
		// TODO onEnable() Load files
	}

	public void registerListeners() {
		// TODO registerListeners(...)
	}
}
