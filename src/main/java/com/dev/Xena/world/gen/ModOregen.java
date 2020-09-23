package com.dev.Xena.world.gen;
import com.dev.Xena.Xena;
import com.dev.Xena.util.RegistryHandler;
import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = Xena.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModOregen {

    @SubscribeEvent
    public static void generateOres(FMLLoadCompleteEvent event) {
        for (Biome biome : ForgeRegistries.BIOMES) {
genOre(biome,5,0,0,30,OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.POTIUM_ORE_BLOCK.get().getDefaultState(),3);
            genOre(biome,4,0,0,25,OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.AMPHIUM_ORE_BLOCK.get().getDefaultState(),3);

        }
    }
    private static void genOre(Biome biome, int count, int topOffset, int bottomOffset, int max, OreFeatureConfig.FillerBlockType filler, BlockState defaultBlockstate, int size) {
        CountRangeConfig range = new CountRangeConfig(count, topOffset, bottomOffset, max);
        OreFeatureConfig feature = new OreFeatureConfig(filler, defaultBlockstate, size);
        ConfiguredPlacement config = Placement.COUNT_RANGE.configure(range);
        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(feature).withPlacement(config));
    }
}
