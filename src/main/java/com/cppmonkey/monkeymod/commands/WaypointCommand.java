package com.cppmonkey.monkeymod.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import com.cppmonkey.monkeymod.MonkeyMod;

public class WaypointCommand implements CommandExecutor {

	private MonkeyMod m_parent;
		
		public WaypointCommand(MonkeyMod parent) {
			m_parent = parent;
		}
		
		public void onEnable() {
			// TODO WayPointCommand.onEnable()
			m_parent.registerListeners(); // Place holder
		}
		
	public boolean onCommand(CommandSender sender, Command command,
			String label, String[] args) {
		// TODO Auto-generated method stub
		return false;
	}

}
