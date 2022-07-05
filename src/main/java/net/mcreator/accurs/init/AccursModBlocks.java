
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.accurs.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.accurs.block.UtyxFluidBlock;
import net.mcreator.accurs.block.UcyaOreBlock;
import net.mcreator.accurs.block.UcyaBlockBlock;
import net.mcreator.accurs.block.TycoWoodBlock;
import net.mcreator.accurs.block.TycoStairsBlock;
import net.mcreator.accurs.block.TycoSlabBlock;
import net.mcreator.accurs.block.TycoPressurePlateBlock;
import net.mcreator.accurs.block.TycoPlanksBlock;
import net.mcreator.accurs.block.TycoLogBlock;
import net.mcreator.accurs.block.TycoLeavesBlock;
import net.mcreator.accurs.block.TycoFenceGateBlock;
import net.mcreator.accurs.block.TycoFenceBlock;
import net.mcreator.accurs.block.TycoButtonBlock;
import net.mcreator.accurs.block.SteaWoodBlock;
import net.mcreator.accurs.block.SteaStairsBlock;
import net.mcreator.accurs.block.SteaSlabBlock;
import net.mcreator.accurs.block.SteaPressurePlateBlock;
import net.mcreator.accurs.block.SteaPlanksBlock;
import net.mcreator.accurs.block.SteaLogBlock;
import net.mcreator.accurs.block.SteaLeavesBlock;
import net.mcreator.accurs.block.SteaFenceGateBlock;
import net.mcreator.accurs.block.SteaFenceBlock;
import net.mcreator.accurs.block.SteaButtonBlock;
import net.mcreator.accurs.block.SimsOreBlock;
import net.mcreator.accurs.block.SimsBlockBlock;
import net.mcreator.accurs.block.RubyOreBlock;
import net.mcreator.accurs.block.RubyBlockBlock;
import net.mcreator.accurs.block.QuancyWoodBlock;
import net.mcreator.accurs.block.QuancyStairsBlock;
import net.mcreator.accurs.block.QuancySlabBlock;
import net.mcreator.accurs.block.QuancyPressurePlateBlock;
import net.mcreator.accurs.block.QuancyPlanksBlock;
import net.mcreator.accurs.block.QuancyLogBlock;
import net.mcreator.accurs.block.QuancyLeavesBlock;
import net.mcreator.accurs.block.QuancyFenceGateBlock;
import net.mcreator.accurs.block.QuancyFenceBlock;
import net.mcreator.accurs.block.QuancyButtonBlock;
import net.mcreator.accurs.block.PaizonLeavesBlock;
import net.mcreator.accurs.block.MagicGrassBlock;
import net.mcreator.accurs.block.MagicDirtBlock;
import net.mcreator.accurs.block.KayzerOreBlock;
import net.mcreator.accurs.block.KayzerBlockBlock;
import net.mcreator.accurs.block.HellTreesWoodBlock;
import net.mcreator.accurs.block.HellTreesStairsBlock;
import net.mcreator.accurs.block.HellTreesSlabBlock;
import net.mcreator.accurs.block.HellTreesPressurePlateBlock;
import net.mcreator.accurs.block.HellTreesPlanksBlock;
import net.mcreator.accurs.block.HellTreesLogBlock;
import net.mcreator.accurs.block.HellTreesLeavesBlock;
import net.mcreator.accurs.block.HellTreesFenceGateBlock;
import net.mcreator.accurs.block.HellTreesFenceBlock;
import net.mcreator.accurs.block.HellTreesButtonBlock;
import net.mcreator.accurs.block.BiyonWoodBlock;
import net.mcreator.accurs.block.BiyonStairsBlock;
import net.mcreator.accurs.block.BiyonSlabBlock;
import net.mcreator.accurs.block.BiyonPressurePlateBlock;
import net.mcreator.accurs.block.BiyonPlanksBlock;
import net.mcreator.accurs.block.BiyonLogBlock;
import net.mcreator.accurs.block.BiyonLeavesBlock;
import net.mcreator.accurs.block.BiyonFenceGateBlock;
import net.mcreator.accurs.block.BiyonFenceBlock;
import net.mcreator.accurs.block.BiyonButtonBlock;
import net.mcreator.accurs.block.AzculWoodBlock;
import net.mcreator.accurs.block.AzculStoneBlock;
import net.mcreator.accurs.block.AzculStairsBlock;
import net.mcreator.accurs.block.AzculSlabBlock;
import net.mcreator.accurs.block.AzculPressurePlateBlock;
import net.mcreator.accurs.block.AzculPlanksBlock;
import net.mcreator.accurs.block.AzculLogBlock;
import net.mcreator.accurs.block.AzculLeavesBlock;
import net.mcreator.accurs.block.AzculGrassBlock;
import net.mcreator.accurs.block.AzculFenceGateBlock;
import net.mcreator.accurs.block.AzculFenceBlock;
import net.mcreator.accurs.block.AzculButtonBlock;
import net.mcreator.accurs.AccursMod;

public class AccursModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AccursMod.MODID);
	public static final RegistryObject<Block> KAYZER_ORE = REGISTRY.register("kayzer_ore", () -> new KayzerOreBlock());
	public static final RegistryObject<Block> KAYZER_BLOCK = REGISTRY.register("kayzer_block", () -> new KayzerBlockBlock());
	public static final RegistryObject<Block> STEA_WOOD = REGISTRY.register("stea_wood", () -> new SteaWoodBlock());
	public static final RegistryObject<Block> STEA_LOG = REGISTRY.register("stea_log", () -> new SteaLogBlock());
	public static final RegistryObject<Block> STEA_PLANKS = REGISTRY.register("stea_planks", () -> new SteaPlanksBlock());
	public static final RegistryObject<Block> STEA_LEAVES = REGISTRY.register("stea_leaves", () -> new SteaLeavesBlock());
	public static final RegistryObject<Block> STEA_STAIRS = REGISTRY.register("stea_stairs", () -> new SteaStairsBlock());
	public static final RegistryObject<Block> STEA_SLAB = REGISTRY.register("stea_slab", () -> new SteaSlabBlock());
	public static final RegistryObject<Block> STEA_FENCE = REGISTRY.register("stea_fence", () -> new SteaFenceBlock());
	public static final RegistryObject<Block> STEA_FENCE_GATE = REGISTRY.register("stea_fence_gate", () -> new SteaFenceGateBlock());
	public static final RegistryObject<Block> STEA_PRESSURE_PLATE = REGISTRY.register("stea_pressure_plate", () -> new SteaPressurePlateBlock());
	public static final RegistryObject<Block> STEA_BUTTON = REGISTRY.register("stea_button", () -> new SteaButtonBlock());
	public static final RegistryObject<Block> TYCO_WOOD = REGISTRY.register("tyco_wood", () -> new TycoWoodBlock());
	public static final RegistryObject<Block> TYCO_LOG = REGISTRY.register("tyco_log", () -> new TycoLogBlock());
	public static final RegistryObject<Block> TYCO_PLANKS = REGISTRY.register("tyco_planks", () -> new TycoPlanksBlock());
	public static final RegistryObject<Block> TYCO_LEAVES = REGISTRY.register("tyco_leaves", () -> new TycoLeavesBlock());
	public static final RegistryObject<Block> TYCO_STAIRS = REGISTRY.register("tyco_stairs", () -> new TycoStairsBlock());
	public static final RegistryObject<Block> TYCO_SLAB = REGISTRY.register("tyco_slab", () -> new TycoSlabBlock());
	public static final RegistryObject<Block> TYCO_FENCE = REGISTRY.register("tyco_fence", () -> new TycoFenceBlock());
	public static final RegistryObject<Block> TYCO_FENCE_GATE = REGISTRY.register("tyco_fence_gate", () -> new TycoFenceGateBlock());
	public static final RegistryObject<Block> TYCO_PRESSURE_PLATE = REGISTRY.register("tyco_pressure_plate", () -> new TycoPressurePlateBlock());
	public static final RegistryObject<Block> TYCO_BUTTON = REGISTRY.register("tyco_button", () -> new TycoButtonBlock());
	public static final RegistryObject<Block> UCYA_ORE = REGISTRY.register("ucya_ore", () -> new UcyaOreBlock());
	public static final RegistryObject<Block> UCYA_BLOCK = REGISTRY.register("ucya_block", () -> new UcyaBlockBlock());
	public static final RegistryObject<Block> QUANCY_WOOD = REGISTRY.register("quancy_wood", () -> new QuancyWoodBlock());
	public static final RegistryObject<Block> QUANCY_LOG = REGISTRY.register("quancy_log", () -> new QuancyLogBlock());
	public static final RegistryObject<Block> QUANCY_PLANKS = REGISTRY.register("quancy_planks", () -> new QuancyPlanksBlock());
	public static final RegistryObject<Block> QUANCY_LEAVES = REGISTRY.register("quancy_leaves", () -> new QuancyLeavesBlock());
	public static final RegistryObject<Block> QUANCY_STAIRS = REGISTRY.register("quancy_stairs", () -> new QuancyStairsBlock());
	public static final RegistryObject<Block> QUANCY_SLAB = REGISTRY.register("quancy_slab", () -> new QuancySlabBlock());
	public static final RegistryObject<Block> QUANCY_FENCE = REGISTRY.register("quancy_fence", () -> new QuancyFenceBlock());
	public static final RegistryObject<Block> QUANCY_FENCE_GATE = REGISTRY.register("quancy_fence_gate", () -> new QuancyFenceGateBlock());
	public static final RegistryObject<Block> QUANCY_PRESSURE_PLATE = REGISTRY.register("quancy_pressure_plate",
			() -> new QuancyPressurePlateBlock());
	public static final RegistryObject<Block> QUANCY_BUTTON = REGISTRY.register("quancy_button", () -> new QuancyButtonBlock());
	public static final RegistryObject<Block> RUBY_ORE = REGISTRY.register("ruby_ore", () -> new RubyOreBlock());
	public static final RegistryObject<Block> RUBY_BLOCK = REGISTRY.register("ruby_block", () -> new RubyBlockBlock());
	public static final RegistryObject<Block> UTYX_FLUID = REGISTRY.register("utyx_fluid", () -> new UtyxFluidBlock());
	public static final RegistryObject<Block> HELL_TREES_WOOD = REGISTRY.register("hell_trees_wood", () -> new HellTreesWoodBlock());
	public static final RegistryObject<Block> HELL_TREES_LOG = REGISTRY.register("hell_trees_log", () -> new HellTreesLogBlock());
	public static final RegistryObject<Block> HELL_TREES_PLANKS = REGISTRY.register("hell_trees_planks", () -> new HellTreesPlanksBlock());
	public static final RegistryObject<Block> HELL_TREES_LEAVES = REGISTRY.register("hell_trees_leaves", () -> new HellTreesLeavesBlock());
	public static final RegistryObject<Block> HELL_TREES_STAIRS = REGISTRY.register("hell_trees_stairs", () -> new HellTreesStairsBlock());
	public static final RegistryObject<Block> HELL_TREES_SLAB = REGISTRY.register("hell_trees_slab", () -> new HellTreesSlabBlock());
	public static final RegistryObject<Block> HELL_TREES_FENCE = REGISTRY.register("hell_trees_fence", () -> new HellTreesFenceBlock());
	public static final RegistryObject<Block> HELL_TREES_FENCE_GATE = REGISTRY.register("hell_trees_fence_gate", () -> new HellTreesFenceGateBlock());
	public static final RegistryObject<Block> HELL_TREES_PRESSURE_PLATE = REGISTRY.register("hell_trees_pressure_plate",
			() -> new HellTreesPressurePlateBlock());
	public static final RegistryObject<Block> HELL_TREES_BUTTON = REGISTRY.register("hell_trees_button", () -> new HellTreesButtonBlock());
	public static final RegistryObject<Block> BIYON_WOOD = REGISTRY.register("biyon_wood", () -> new BiyonWoodBlock());
	public static final RegistryObject<Block> BIYON_LOG = REGISTRY.register("biyon_log", () -> new BiyonLogBlock());
	public static final RegistryObject<Block> BIYON_PLANKS = REGISTRY.register("biyon_planks", () -> new BiyonPlanksBlock());
	public static final RegistryObject<Block> BIYON_LEAVES = REGISTRY.register("biyon_leaves", () -> new BiyonLeavesBlock());
	public static final RegistryObject<Block> BIYON_STAIRS = REGISTRY.register("biyon_stairs", () -> new BiyonStairsBlock());
	public static final RegistryObject<Block> BIYON_SLAB = REGISTRY.register("biyon_slab", () -> new BiyonSlabBlock());
	public static final RegistryObject<Block> BIYON_FENCE = REGISTRY.register("biyon_fence", () -> new BiyonFenceBlock());
	public static final RegistryObject<Block> BIYON_FENCE_GATE = REGISTRY.register("biyon_fence_gate", () -> new BiyonFenceGateBlock());
	public static final RegistryObject<Block> BIYON_PRESSURE_PLATE = REGISTRY.register("biyon_pressure_plate", () -> new BiyonPressurePlateBlock());
	public static final RegistryObject<Block> BIYON_BUTTON = REGISTRY.register("biyon_button", () -> new BiyonButtonBlock());
	public static final RegistryObject<Block> MAGIC_GRASS = REGISTRY.register("magic_grass", () -> new MagicGrassBlock());
	public static final RegistryObject<Block> MAGIC_DIRT = REGISTRY.register("magic_dirt", () -> new MagicDirtBlock());
	public static final RegistryObject<Block> AZCUL_WOOD = REGISTRY.register("azcul_wood", () -> new AzculWoodBlock());
	public static final RegistryObject<Block> AZCUL_LOG = REGISTRY.register("azcul_log", () -> new AzculLogBlock());
	public static final RegistryObject<Block> AZCUL_PLANKS = REGISTRY.register("azcul_planks", () -> new AzculPlanksBlock());
	public static final RegistryObject<Block> AZCUL_LEAVES = REGISTRY.register("azcul_leaves", () -> new AzculLeavesBlock());
	public static final RegistryObject<Block> AZCUL_STAIRS = REGISTRY.register("azcul_stairs", () -> new AzculStairsBlock());
	public static final RegistryObject<Block> AZCUL_SLAB = REGISTRY.register("azcul_slab", () -> new AzculSlabBlock());
	public static final RegistryObject<Block> AZCUL_FENCE = REGISTRY.register("azcul_fence", () -> new AzculFenceBlock());
	public static final RegistryObject<Block> AZCUL_FENCE_GATE = REGISTRY.register("azcul_fence_gate", () -> new AzculFenceGateBlock());
	public static final RegistryObject<Block> AZCUL_PRESSURE_PLATE = REGISTRY.register("azcul_pressure_plate", () -> new AzculPressurePlateBlock());
	public static final RegistryObject<Block> AZCUL_BUTTON = REGISTRY.register("azcul_button", () -> new AzculButtonBlock());
	public static final RegistryObject<Block> AZCUL_STONE = REGISTRY.register("azcul_stone", () -> new AzculStoneBlock());
	public static final RegistryObject<Block> AZCUL_GRASS = REGISTRY.register("azcul_grass", () -> new AzculGrassBlock());
	public static final RegistryObject<Block> PAIZON_LEAVES = REGISTRY.register("paizon_leaves", () -> new PaizonLeavesBlock());
	public static final RegistryObject<Block> SIMS_ORE = REGISTRY.register("sims_ore", () -> new SimsOreBlock());
	public static final RegistryObject<Block> SIMS_BLOCK = REGISTRY.register("sims_block", () -> new SimsBlockBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
		}

		@SubscribeEvent
		public static void blockColorLoad(ColorHandlerEvent.Block event) {
			MagicGrassBlock.blockColorLoad(event);
			MagicDirtBlock.blockColorLoad(event);
			AzculGrassBlock.blockColorLoad(event);
		}
	}
}
