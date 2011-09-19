package com.cppmonkey.monkeymod.modules;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Entity;
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
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
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

public class DebugModule {
	private JavaPlugin m_plugin;
	private DebugCommand m_debugCommand;

	public class DebugCommand implements CommandExecutor {

		private JavaPlugin m_plugin;
		private DebugBlockListener m_debugBlockListener;
		private DebugPlayerListener m_debugPlayerListener;
		private DebugEntityListener m_debugEntityListener;

		public class DebugBlockListener extends BlockListener {
			public void onBlockDamage(BlockDamageEvent event) {
				MonkeyMod.log.info("onBlockDamage");
			}
			public void onBlockCanBuild(BlockCanBuildEvent event) {
				MonkeyMod.log.info("onBlockCanBuild");
			}
			public void onBlockFromTo(BlockFromToEvent event) {
				MonkeyMod.log.info("onBlockFromTo");
			}
			public void onBlockIgnite(BlockIgniteEvent event) {
				MonkeyMod.log.info("onBlockIgnite");
			}
			public void onBlockPhysics(BlockPhysicsEvent event) {
				MonkeyMod.log.info("onBlockPhysics");
			}
			public void onBlockPlace(BlockPlaceEvent event) {
				MonkeyMod.log.info("onBlockPlace");
			}
			public void onBlockRedstoneChange(BlockRedstoneEvent event) {
				MonkeyMod.log.info("onBlockRedstoneChange");
			}
			public void onLeavesDecay(LeavesDecayEvent event) {
				MonkeyMod.log.info("onLeavesDecay");
			}
			public void onSignChange(SignChangeEvent event) {
				MonkeyMod.log.info("onSignChange");
			}
			public void onBlockBurn(BlockBurnEvent event) {
				MonkeyMod.log.info("onBlockBurn");
			}
			public void onBlockBreak(BlockBreakEvent event) {
				MonkeyMod.log.info("onBlockBreak");
			}
			public void onBlockForm(BlockFormEvent event) {
				MonkeyMod.log.info("onBlockForm");
			}
			public void onBlockSpread(BlockSpreadEvent event) {
				MonkeyMod.log.info("onBlockSpread");
			}
			public void onBlockFade(BlockFadeEvent event) {
				MonkeyMod.log.info("onBlockFade");
			}
			public void onBlockDispense(BlockDispenseEvent event) {
				MonkeyMod.log.info("onBlockDispense");
			}
			public void onBlockPistonRetract(BlockPistonRetractEvent event) {
				MonkeyMod.log.info("onBlockPistonRetract");
			}
			public void onBlockPistonExtend(BlockPistonExtendEvent event) {
				MonkeyMod.log.info("onBlockPistonExtend");
			}
		}

		public class DebugPlayerListener extends PlayerListener {
			public void onPlayerJoin(PlayerJoinEvent event) {
				MonkeyMod.log.info("onPlayerJoin");
			}
			public void onPlayerQuit(PlayerQuitEvent event) {
				MonkeyMod.log.info("onPlayerQuit");
			}
			public void onPlayerKick(PlayerKickEvent event) {
				MonkeyMod.log.info("onPlayerKick");
			}
			public void onPlayerChat(PlayerChatEvent event) {
				MonkeyMod.log.info("onPlayerChat");
			}
			public void onPlayerCommandPreprocess(PlayerCommandPreprocessEvent event) {
				MonkeyMod.log.info("onPlayerCommandPreprocess");
			}
			public void onPlayerMove(PlayerMoveEvent event) {
				MonkeyMod.log.info("onPlayerMove");
			}
			public void onPlayerVelocity(PlayerVelocityEvent event) {
				MonkeyMod.log.info("onPlayerVelocity");
			}
			public void onPlayerTeleport(PlayerTeleportEvent event) {
				MonkeyMod.log.info("onPlayerTeleport");
			}
			public void onPlayerRespawn(PlayerRespawnEvent event) {
				MonkeyMod.log.info("onPlayerRespawn");
			}
			public void onPlayerInteract(PlayerInteractEvent event) {
				MonkeyMod.log.info("onPlayerInteract");
			}
			public void onPlayerInteractEntity(PlayerInteractEntityEvent event) {
				MonkeyMod.log.info("onPlayerInteractEntity");
			}
			public void onPlayerLogin(PlayerLoginEvent event) {
				MonkeyMod.log.info("onPlayerLogin");
			}
			public void onPlayerPreLogin(PlayerPreLoginEvent event) {
				MonkeyMod.log.info("onPlayerPreLogin");
			}
			public void onPlayerEggThrow(PlayerEggThrowEvent event) {
				MonkeyMod.log.info("onPlayerEggThrow");
			}
			public void onPlayerAnimation(PlayerAnimationEvent event) {
				MonkeyMod.log.info("onPlayerAnimation");
			}
			public void onInventoryOpen(PlayerInventoryEvent event) {
				MonkeyMod.log.info("onInventoryOpen");
			}
			public void onItemHeldChange(PlayerItemHeldEvent event) {
				MonkeyMod.log.info("onItemHeldChange");
			}
			public void onPlayerDropItem(PlayerDropItemEvent event) {
				MonkeyMod.log.info("onPlayerDropItem");
			}
			public void onPlayerPickupItem(PlayerPickupItemEvent event) {
				MonkeyMod.log.info("onPlayerPickupItem");
			}
			public void onPlayerToggleSneak(PlayerToggleSneakEvent event) {
				MonkeyMod.log.info("onPlayerToggleSneak");
			}
			public void onPlayerBucketFill(PlayerBucketFillEvent event) {
				MonkeyMod.log.info("onPlayerBucketFill");
			}
			public void onPlayerBucketEmpty(PlayerBucketEmptyEvent event) {
				MonkeyMod.log.info("onPlayerBucketEmpty");
			}
			public void onPlayerBedEnter(PlayerBedEnterEvent event) {
				MonkeyMod.log.info("onPlayerBedEnter");
			}
			public void onPlayerBedLeave(PlayerBedLeaveEvent event) {
				MonkeyMod.log.info("onPlayerBedLeave");
			}
			public void onPlayerPortal(PlayerPortalEvent event) {
				MonkeyMod.log.info("onPlayerPortal");
			}
			public void onPlayerFish(PlayerFishEvent event) {
				MonkeyMod.log.info("onPlayerFish");
			}
			public void onPlayerGameModeChange(PlayerGameModeChangeEvent event) {
				MonkeyMod.log.info("onPlayerGameModeChange");
			}
		}

		public class DebugEntityListener extends EntityListener {
			public void onCreatureSpawn(CreatureSpawnEvent event) { 
				MonkeyMod.log.info("onCreatureSpawn");
			}
			public void onItemSpawn(ItemSpawnEvent event) {
				MonkeyMod.log.info("onItemSpawn");
			}
			public void onEntityCombust(EntityCombustEvent event) {
				MonkeyMod.log.info("onEntityCombust");
			}
			public void onEntityDamage(EntityDamageEvent event) {
				MonkeyMod.log.info("onEntityDamage");
			}
			public void onEntityExplode(EntityExplodeEvent event) {
				MonkeyMod.log.info("onEntityExplode");
			}
			public void onExplosionPrime(ExplosionPrimeEvent event) {
				MonkeyMod.log.info("onExplosionPrime");
			}
			public void onEntityDeath(EntityDeathEvent event) {
				MonkeyMod.log.info("onEntityDeath");
				DamageCause cause = event.getEntity().getLastDamageCause().getCause();
				MonkeyMod.log.fine(cause.name());
				if (cause == DamageCause.ENTITY_ATTACK) {
					EntityDamageEvent damageCause = event.getEntity().getLastDamageCause();

					Entity killer = null;
					if (damageCause instanceof EntityDamageByEntityEvent) {
						killer = ((EntityDamageByEntityEvent) damageCause).getDamager();
						if (killer instanceof Arrow) {
							killer = ((Arrow)killer).getShooter();
							MonkeyMod.log.finer("Damage from projectile, killer was " + killer.getClass().getSimpleName());
						}
					} else {
						MonkeyMod.log.finer(damageCause.toString() + " is not a damage cause");
					}
				}
			}
			public void onEntityTarget(EntityTargetEvent event) {
				MonkeyMod.log.info("onEntityTarget");
			}
			public void onEntityInteract(EntityInteractEvent event) {
				MonkeyMod.log.info("onEntityInteract");
			}
			public void onEntityPortalEnter(EntityPortalEnterEvent event) {
				MonkeyMod.log.info("onEntityPortalEnter");
			}
			public void onPaintingPlace(PaintingPlaceEvent event) {
				MonkeyMod.log.info("onPaintingPlace");
			}
			public void onPaintingBreak(PaintingBreakEvent event) {
				MonkeyMod.log.info("onPaintingBreak");
			}
			public void onPigZap(PigZapEvent event) {
				MonkeyMod.log.info("onPigZap");
			}
			public void onCreeperPower(CreeperPowerEvent event) {
				MonkeyMod.log.info("onCreeperPower");
			}
			public void onEntityTame(EntityTameEvent event) {
				MonkeyMod.log.info("onEntityTame");
			}
			public void onEntityRegainHealth(EntityRegainHealthEvent event) {
				MonkeyMod.log.info("onEntityRegainHealth");
			}
			public void onProjectileHit(ProjectileHitEvent event) {
				MonkeyMod.log.info("onProjectileHit");
			}
		}

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
					try{
						if (event.getCategory() == Event.Category.PLAYER) {
							pm.registerEvent(event, m_debugPlayerListener, Priority.Monitor, m_plugin);
						} else if (event.getCategory() == Event.Category.BLOCK) {
							pm.registerEvent(event, m_debugBlockListener, Priority.Monitor, m_plugin);
						} else if (event.getCategory() == Event.Category.ENTITY) {
							pm.registerEvent(event, m_debugEntityListener, Priority.Monitor, m_plugin);
						} else {
							MonkeyMod.log.finest(event.name() + " doesnt have a debug event listener yet");
						}
					}catch(IllegalArgumentException e){
						MonkeyMod.log.warning(e.getMessage());
					}
				}
				return true;
			}
			return false;
		}
	}

	public DebugModule(final JavaPlugin plugin) {
		m_plugin = plugin;
		m_debugCommand = new DebugCommand(plugin);
	}

	public void onEnable() {
		m_plugin.getCommand("debug").setExecutor(m_debugCommand);
		MonkeyMod.log.fine("enabled debug command listener");

	}

	public void onDisable() {
		MonkeyMod.log.fine("disabled debug command listener");
	}
}
