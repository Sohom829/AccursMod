
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.accurs.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

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
import net.mcreator.accurs.block.KayzerOreBlock;
import net.mcreator.accurs.block.KayzerBlockBlock;
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
}
