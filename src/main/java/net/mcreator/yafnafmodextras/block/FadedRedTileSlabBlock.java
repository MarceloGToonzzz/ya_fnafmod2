
package net.mcreator.yafnafmodextras.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class FadedRedTileSlabBlock extends SlabBlock {
	public FadedRedTileSlabBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.STONE).strength(1f, 10f).requiresCorrectToolForDrops().dynamicShape());
	}
}
