package com.cppmonkey.monkeymod.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import com.cppmonkey.monkeymod.MonkeyMod;

public class MonkeyCommand implements CommandExecutor {
	private MonkeyMod m_parent;
	
	public MonkeyCommand(MonkeyMod parent) {
		m_parent = parent;
	}
	
	public void onEnable() {
		// TODO MonkeyCommand.onEnable()
		m_parent.registerListeners(); // Place holder
	}

	public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] arg3) {
		// TODO MonkeyCommand.onCommand(...)
		return false;
	}
	
	

}
