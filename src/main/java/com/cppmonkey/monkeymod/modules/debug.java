package com.cppmonkey.monkeymod.modules;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.event.block.BlockListener;
import org.bukkit.event.entity.EntityListener;
import org.bukkit.event.player.PlayerListener;

import com.cppmonkey.monkeymod.MonkeyMod;

public class debug {
	public class DebugCommand implements CommandExecutor {

		public boolean onCommand(CommandSender arg0, Command arg1, String arg2, String[] arg3) {
			// TODO Auto-generated method stub
			
			if (true) {
				
			}
			return false;
		}

	}
	
	public class DebugBlockListener extends BlockListener {
		
	}
	
	public class DebugPlayerListener extends PlayerListener {
		
	}
	
	public class DebugEntityListener extends EntityListener {
		
	}
	
	public void onEnable() {
		MonkeyMod.log.fine("enabled debug command listener");
		
	}
	
	public void onDisable() {
		MonkeyMod.log.fine("disabled debug command listener");
	}
}
