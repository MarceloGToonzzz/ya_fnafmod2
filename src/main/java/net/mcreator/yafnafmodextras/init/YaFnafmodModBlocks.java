
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yafnafmodextras.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.yafnafmodextras.block.FadedRedTilesBlock;
import net.mcreator.yafnafmodextras.block.FadedRedTileStairsBlock;
import net.mcreator.yafnafmodextras.block.FadedRedTileSlabBlock;
import net.mcreator.yafnafmodextras.block.CrackedFadedRedTilesBlock;
import net.mcreator.yafnafmodextras.block.CrackedFadedRedTileStairsBlock;
import net.mcreator.yafnafmodextras.block.CrackedFadedRedTileSlabBlock;
import net.mcreator.yafnafmodextras.YaFnafmodMod;

public class YaFnafmodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, YaFnafmodMod.MODID);
	public static final RegistryObject<Block> FADED_RED_TILES = REGISTRY.register("faded_red_tiles", () -> new FadedRedTilesBlock());
	public static final RegistryObject<Block> FADED_RED_TILE_STAIRS = REGISTRY.register("faded_red_tile_stairs", () -> new FadedRedTileStairsBlock());
	public static final RegistryObject<Block> FADED_RED_TILE_SLAB = REGISTRY.register("faded_red_tile_slab", () -> new FadedRedTileSlabBlock());
	public static final RegistryObject<Block> CRACKED_FADED_RED_TILES = REGISTRY.register("cracked_faded_red_tiles", () -> new CrackedFadedRedTilesBlock());
	public static final RegistryObject<Block> CRACKED_FADED_RED_TILE_STAIRS = REGISTRY.register("cracked_faded_red_tile_stairs", () -> new CrackedFadedRedTileStairsBlock());
	public static final RegistryObject<Block> CRACKED_FADED_RED_TILE_SLAB = REGISTRY.register("cracked_faded_red_tile_slab", () -> new CrackedFadedRedTileSlabBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
