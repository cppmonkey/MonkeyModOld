package com.cppmonkey.monkeymod.modules;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Priority;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockBurnEvent;
import org.bukkit.event.block.BlockCanBuildEvent;
import org.bukkit.event.block.BlockDamageEvent;
import org.bukkit.event.block.BlockDispenseEvent;
import org.bukkit.event.block.BlockFadeEvent;
import org.bukkit.event.block.BlockFormEvent;
import org.bukkit.event.block.BlockFromToEvent;
import org.bukkit.event.block.BlockIgniteEvent;
import org.bukkit.event.block.BlockListener;
import org.bukkit.event.block.BlockPhysicsEvent;
import org.bukkit.event.block.BlockPistonExtendEvent;
import org.bukkit.event.block.BlockPistonRetractEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.block.BlockRedstoneEvent;
import org.bukkit.event.block.BlockSpreadEvent;
import org.bukkit.event.block.LeavesDecayEvent;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.CreeperPowerEvent;
import org.bukkit.event.entity.EntityCombustEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.entity.EntityInteractEvent;
import org.bukkit.event.entity.EntityListener;
import org.bukkit.event.entity.EntityPortalEnterEvent;
import org.bukkit.event.entity.EntityRegainHealthEvent;
import org.bukkit.event.entity.EntityTameEvent;
import org.bukkit.event.entity.EntityTargetEvent;
import org.bukkit.event.entity.ExplosionPrimeEvent;
import org.bukkit.event.entity.ItemSpawnEvent;
import org.bukkit.event.entity.PigZapEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.painting.PaintingBreakEvent;
import org.bukkit.event.painting.PaintingPlaceEvent;
import org.bukkit.event.player.PlayerAnimationEvent;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.event.player.PlayerBucketEmptyEvent;
import org.bukkit.event.player.PlayerBucketFillEvent;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerEggThrowEvent;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.event.player.PlayerGameModeChangeEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerInventoryEvent;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerListener;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.event.player.PlayerPortalEvent;
import org.bukkit.event.player.PlayerPreLoginEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.event.player.PlayerVelocityEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.cppmonkey.monkeymod.MonkeyMod;

public class debug {
	private JavaPlugin m_plugin;
	private DebugCommand m_debugCommand;

	public debug(JavaPlugin plugin) {
		m_plugin = plugin;
		m_debugCommand = new DebugCommand(m_plugin);
	}

	public class DebugCommand implements CommandExecutor {

		JavaPlugin m_plugin;
		DebugBlockListener m_debugBlockListener;
		DebugPlayerListener m_debugPlayerListener;
		DebugEntityListener m_debugEntityListener;

		public DebugCommand(JavaPlugin plugin) {
			m_plugin = plugin;

			m_debugBlockListener = new DebugBlockListener();
			m_debugPlayerListener = new DebugPlayerListener();
			m_debugEntityListener = new DebugEntityListener();
		}

		public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

			if (args.length > 0 && args[0].equalsIgnoreCase("enable")) {
				PluginManager pm = m_plugin.getServer().getPluginManager();

				// iterate through Event.Type
				for (Event.Type event : Event.Type.values()) {

					if (event.getCategory() == Event.Category.PLAYER) {
						pm.registerEvent(event, m_debugPlayerListener, Priority.Monitor, m_plugin);
					} else if (event.getCategory() == Event.Category.BLOCK) {
						pm.registerEvent(event, m_debugBlockListener, Priority.Monitor, m_plugin);
					} else if (event.getCategory() == Event.Category.ENTITY) {
						pm.registerEvent(event, m_debugEntityListener, Priority.Monitor, m_plugin);
					} else {
						MonkeyMod.log.finest(event.name() + " doesnt have a debug event listener yet");
					}
				}
				return true;
			}
			return false;
		}
	}

	public class DebugBlockListener extends BlockListener {
		public void onBlockDamage(BlockDamageEvent event) {}
		public void onBlockCanBuild(BlockCanBuildEvent event) {}
		public void onBlockFromTo(BlockFromToEvent event) {}
		public void onBlockIgnite(BlockIgniteEvent event) {}
		public void onBlockPhysics(BlockPhysicsEvent event) {}
		public void onBlockPlace(BlockPlaceEvent event) {}
		public void onBlockRedstoneChange(BlockRedstoneEvent event) {}
		public void onLeavesDecay(LeavesDecayEvent event) {}
		public void onSignChange(SignChangeEvent event) {}
		public void onBlockBurn(BlockBurnEvent event) {}
		public void onBlockBreak(BlockBreakEvent event) {}
		public void onBlockForm(BlockFormEvent event) {}
		public void onBlockSpread(BlockSpreadEvent event) {}
		public void onBlockFade(BlockFadeEvent event) {}
		public void onBlockDispense(BlockDispenseEvent event) {}
		public void onBlockPistonRetract(BlockPistonRetractEvent event) {}
		public void onBlockPistonExtend(BlockPistonExtendEvent event) {}

	}

	public class DebugPlayerListener extends PlayerListener {
		public void onPlayerJoin(PlayerJoinEvent event) {}
		public void onPlayerQuit(PlayerQuitEvent event) {}
		public void onPlayerKick(PlayerKickEvent event) {}
		public void onPlayerChat(PlayerChatEvent event) {}
		public void onPlayerCommandPreprocess(PlayerCommandPreprocessEvent event) {}
		public void onPlayerMove(PlayerMoveEvent event) {}
		public void onPlayerVelocity(PlayerVelocityEvent event) {}
		public void onPlayerTeleport(PlayerTeleportEvent event) {}
		public void onPlayerRespawn(PlayerRespawnEvent event) {}
		public void onPlayerInteract(PlayerInteractEvent event) {}
		public void onPlayerInteractEntity(PlayerInteractEntityEvent event) {}
		public void onPlayerLogin(PlayerLoginEvent event) {}
		public void onPlayerPreLogin(PlayerPreLoginEvent event) {}
		public void onPlayerEggThrow(PlayerEggThrowEvent event) {}
		public void onPlayerAnimation(PlayerAnimationEvent event) {}
		public void onInventoryOpen(PlayerInventoryEvent event) {}
		public void onItemHeldChange(PlayerItemHeldEvent event) {}
		public void onPlayerDropItem(PlayerDropItemEvent event) {}
		public void onPlayerPickupItem(PlayerPickupItemEvent event) {}
		public void onPlayerToggleSneak(PlayerToggleSneakEvent event) {}
		public void onPlayerBucketFill(PlayerBucketFillEvent event) {}
		public void onPlayerBucketEmpty(PlayerBucketEmptyEvent event) {}
		public void onPlayerBedEnter(PlayerBedEnterEvent event) {}
		public void onPlayerBedLeave(PlayerBedLeaveEvent event) {}
		public void onPlayerPortal(PlayerPortalEvent event) {}
		public void onPlayerFish(PlayerFishEvent event) {}
		public void onPlayerGameModeChange(PlayerGameModeChangeEvent event) {}
	}

	public class DebugEntityListener extends EntityListener {
		public void onCreatureSpawn(CreatureSpawnEvent event) {}
		public void onItemSpawn(ItemSpawnEvent event) {}
		public void onEntityCombust(EntityCombustEvent event) {}
		public void onEntityDamage(EntityDamageEvent event) {}
		public void onEntityExplode(EntityExplodeEvent event) {}
		public void onExplosionPrime(ExplosionPrimeEvent event) {}
		public void onEntityDeath(EntityDeathEvent event) {}
		public void onEntityTarget(EntityTargetEvent event) {}
		public void onEntityInteract(EntityInteractEvent event) {}
		public void onEntityPortalEnter(EntityPortalEnterEvent event) {}
		public void onPaintingPlace(PaintingPlaceEvent event) {}
		public void onPaintingBreak(PaintingBreakEvent event) {}
		public void onPigZap(PigZapEvent event) {}
		public void onCreeperPower(CreeperPowerEvent event) {}
		public void onEntityTame(EntityTameEvent event) {}
		public void onEntityRegainHealth(EntityRegainHealthEvent event) {}
		public void onProjectileHit(ProjectileHitEvent event) {}
	}

	public void onEnable() {
		m_plugin.getCommand("debug").setExecutor(m_debugCommand);
		MonkeyMod.log.fine("enabled debug command listener");

	}

	public void onDisable() {
		MonkeyMod.log.fine("disabled debug command listener");
	}
}
