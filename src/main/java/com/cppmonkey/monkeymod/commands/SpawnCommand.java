package com.cppmonkey.monkeymod.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import com.cppmonkey.monkeymod.MonkeyMod;

public class SpawnCommand implements CommandExecutor {
	private MonkeyMod m_parent;
	
	public SpawnCommand(MonkeyMod parent) {
		m_parent = parent;
	}
	
	public void onEnable() {
		// TODO SpawnCommand.onEnable()
		m_parent.registerListeners(); // Place holder
	}
	
	public boolean onCommand(CommandSender sender, Command command,
			String label, String[] args) {
		// TODO Auto-generated method stub
		return false;
	}

}
