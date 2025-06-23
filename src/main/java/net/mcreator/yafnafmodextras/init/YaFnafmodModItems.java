
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yafnafmodextras.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.yafnafmodextras.YaFnafmodMod;

public class YaFnafmodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, YaFnafmodMod.MODID);
	public static final RegistryObject<Item> FADED_RED_TILES = block(YaFnafmodModBlocks.FADED_RED_TILES);
	public static final RegistryObject<Item> FADED_RED_TILE_STAIRS = block(YaFnafmodModBlocks.FADED_RED_TILE_STAIRS);
	public static final RegistryObject<Item> FADED_RED_TILE_SLAB = block(YaFnafmodModBlocks.FADED_RED_TILE_SLAB);
	public static final RegistryObject<Item> CRACKED_FADED_RED_TILES = block(YaFnafmodModBlocks.CRACKED_FADED_RED_TILES);
	public static final RegistryObject<Item> CRACKED_FADED_RED_TILE_STAIRS = block(YaFnafmodModBlocks.CRACKED_FADED_RED_TILE_STAIRS);
	public static final RegistryObject<Item> CRACKED_FADED_RED_TILE_SLAB = block(YaFnafmodModBlocks.CRACKED_FADED_RED_TILE_SLAB);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
