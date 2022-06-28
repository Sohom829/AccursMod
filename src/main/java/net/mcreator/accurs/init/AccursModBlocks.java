
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.accurs.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.accurs.block.UtyxPortalBlock;
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
	public static final RegistryObject<Block> UTYX_PORTAL = REGISTRY.register("utyx_portal", () -> new UtyxPortalBlock());
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
}
