package net.makersville.forge.mods;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = Main.MODID, name="Makersville Mods", version = Main.VERSION)
public class Main {
	public static final String MODID = "makersville";
	public static final String VERSION = "1.0";
	
	public static Item bacon;
	public static Item glassSword;
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		// MinecraftForge.EVENT_BUS.register(new BlockBreakMessage());
		//MinecraftForge.EVENT_BUS.register(new BigBooms());
		
		bacon = new Bacon();
		glassSword = new GlassSword();
		
		if (event.getSide() == Side.CLIENT) {
			ForgeUtils.renderItem(MODID, Bacon.NAME);
			ForgeUtils.renderItem(MODID, GlassSword.NAME);
		}
		
		// For those like me who need a use for gravel...
		GameRegistry.addSmelting(new ItemStack(Blocks.gravel), new ItemStack(Blocks.stone), 1);
		
	}

}
