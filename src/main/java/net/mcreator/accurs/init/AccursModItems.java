
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.accurs.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.accurs.item.UtyxFluidItem;
import net.mcreator.accurs.item.UcyaSwordItem;
import net.mcreator.accurs.item.UcyaShovelItem;
import net.mcreator.accurs.item.UcyaPickaxeItem;
import net.mcreator.accurs.item.UcyaIngotItem;
import net.mcreator.accurs.item.UcyaHoeItem;
import net.mcreator.accurs.item.UcyaAxeItem;
import net.mcreator.accurs.item.UcyaArmorItem;
import net.mcreator.accurs.item.TycoStickItem;
import net.mcreator.accurs.item.SimsSwordItem;
import net.mcreator.accurs.item.SimsShovelItem;
import net.mcreator.accurs.item.SimsPickaxeItem;
import net.mcreator.accurs.item.SimsIngotItem;
import net.mcreator.accurs.item.SimsHoeItem;
import net.mcreator.accurs.item.SimsAxeItem;
import net.mcreator.accurs.item.SimsArmorItem;
import net.mcreator.accurs.item.RubySwordItem;
import net.mcreator.accurs.item.RubyShovelItem;
import net.mcreator.accurs.item.RubyPickaxeItem;
import net.mcreator.accurs.item.RubyItem;
import net.mcreator.accurs.item.RubyHoeItem;
import net.mcreator.accurs.item.RubyAxeItem;
import net.mcreator.accurs.item.RubyArmorItem;
import net.mcreator.accurs.item.RedstoneSwordItem;
import net.mcreator.accurs.item.RedstoneShovelItem;
import net.mcreator.accurs.item.RedstonePickaxeItem;
import net.mcreator.accurs.item.RedstoneHoeItem;
import net.mcreator.accurs.item.RedstoneAxeItem;
import net.mcreator.accurs.item.RedstoneArmorItem;
import net.mcreator.accurs.item.LapisSwordItem;
import net.mcreator.accurs.item.LapisShovelItem;
import net.mcreator.accurs.item.LapisPickaxeItem;
import net.mcreator.accurs.item.LapisHoeItem;
import net.mcreator.accurs.item.LapisAxeItem;
import net.mcreator.accurs.item.LapisArmorItem;
import net.mcreator.accurs.item.KayzerItem;
import net.mcreator.accurs.item.KayzeSwordItem;
import net.mcreator.accurs.item.KayzeShovelItem;
import net.mcreator.accurs.item.KayzePickaxeItem;
import net.mcreator.accurs.item.KayzeHoeItem;
import net.mcreator.accurs.item.KayzeAxeItem;
import net.mcreator.accurs.item.KayzeArmorItem;
import net.mcreator.accurs.item.EmeraldToolsSwordItem;
import net.mcreator.accurs.item.EmeraldToolsShovelItem;
import net.mcreator.accurs.item.EmeraldToolsPickaxeItem;
import net.mcreator.accurs.item.EmeraldToolsHoeItem;
import net.mcreator.accurs.item.EmeraldToolsAxeItem;
import net.mcreator.accurs.item.EmeraldArmourArmorItem;
import net.mcreator.accurs.item.CopperSwordItem;
import net.mcreator.accurs.item.CopperShovelItem;
import net.mcreator.accurs.item.CopperPickaxeItem;
import net.mcreator.accurs.item.CopperHoeItem;
import net.mcreator.accurs.item.CopperAxeItem;
import net.mcreator.accurs.item.CopperArmorItem;
import net.mcreator.accurs.AccursMod;

public class AccursModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AccursMod.MODID);
	public static final RegistryObject<Item> LAPIS_PICKAXE = REGISTRY.register("lapis_pickaxe", () -> new LapisPickaxeItem());
	public static final RegistryObject<Item> LAPIS_AXE = REGISTRY.register("lapis_axe", () -> new LapisAxeItem());
	public static final RegistryObject<Item> LAPIS_SWORD = REGISTRY.register("lapis_sword", () -> new LapisSwordItem());
	public static final RegistryObject<Item> LAPIS_SHOVEL = REGISTRY.register("lapis_shovel", () -> new LapisShovelItem());
	public static final RegistryObject<Item> LAPIS_HOE = REGISTRY.register("lapis_hoe", () -> new LapisHoeItem());
	public static final RegistryObject<Item> LAPIS_ARMOR_HELMET = REGISTRY.register("lapis_armor_helmet", () -> new LapisArmorItem.Helmet());
	public static final RegistryObject<Item> LAPIS_ARMOR_CHESTPLATE = REGISTRY.register("lapis_armor_chestplate",
			() -> new LapisArmorItem.Chestplate());
	public static final RegistryObject<Item> LAPIS_ARMOR_LEGGINGS = REGISTRY.register("lapis_armor_leggings", () -> new LapisArmorItem.Leggings());
	public static final RegistryObject<Item> LAPIS_ARMOR_BOOTS = REGISTRY.register("lapis_armor_boots", () -> new LapisArmorItem.Boots());
	public static final RegistryObject<Item> REDSTONE_PICKAXE = REGISTRY.register("redstone_pickaxe", () -> new RedstonePickaxeItem());
	public static final RegistryObject<Item> REDSTONE_AXE = REGISTRY.register("redstone_axe", () -> new RedstoneAxeItem());
	public static final RegistryObject<Item> REDSTONE_SWORD = REGISTRY.register("redstone_sword", () -> new RedstoneSwordItem());
	public static final RegistryObject<Item> REDSTONE_SHOVEL = REGISTRY.register("redstone_shovel", () -> new RedstoneShovelItem());
	public static final RegistryObject<Item> REDSTONE_HOE = REGISTRY.register("redstone_hoe", () -> new RedstoneHoeItem());
	public static final RegistryObject<Item> REDSTONE_ARMOR_HELMET = REGISTRY.register("redstone_armor_helmet", () -> new RedstoneArmorItem.Helmet());
	public static final RegistryObject<Item> REDSTONE_ARMOR_CHESTPLATE = REGISTRY.register("redstone_armor_chestplate",
			() -> new RedstoneArmorItem.Chestplate());
	public static final RegistryObject<Item> REDSTONE_ARMOR_LEGGINGS = REGISTRY.register("redstone_armor_leggings",
			() -> new RedstoneArmorItem.Leggings());
	public static final RegistryObject<Item> REDSTONE_ARMOR_BOOTS = REGISTRY.register("redstone_armor_boots", () -> new RedstoneArmorItem.Boots());
	public static final RegistryObject<Item> KAYZER = REGISTRY.register("kayzer", () -> new KayzerItem());
	public static final RegistryObject<Item> KAYZER_ORE = block(AccursModBlocks.KAYZER_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> KAYZER_BLOCK = block(AccursModBlocks.KAYZER_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> KAYZE_PICKAXE = REGISTRY.register("kayze_pickaxe", () -> new KayzePickaxeItem());
	public static final RegistryObject<Item> KAYZE_AXE = REGISTRY.register("kayze_axe", () -> new KayzeAxeItem());
	public static final RegistryObject<Item> KAYZE_SWORD = REGISTRY.register("kayze_sword", () -> new KayzeSwordItem());
	public static final RegistryObject<Item> KAYZE_SHOVEL = REGISTRY.register("kayze_shovel", () -> new KayzeShovelItem());
	public static final RegistryObject<Item> KAYZE_HOE = REGISTRY.register("kayze_hoe", () -> new KayzeHoeItem());
	public static final RegistryObject<Item> KAYZE_ARMOR_HELMET = REGISTRY.register("kayze_armor_helmet", () -> new KayzeArmorItem.Helmet());
	public static final RegistryObject<Item> KAYZE_ARMOR_CHESTPLATE = REGISTRY.register("kayze_armor_chestplate",
			() -> new KayzeArmorItem.Chestplate());
	public static final RegistryObject<Item> KAYZE_ARMOR_LEGGINGS = REGISTRY.register("kayze_armor_leggings", () -> new KayzeArmorItem.Leggings());
	public static final RegistryObject<Item> KAYZE_ARMOR_BOOTS = REGISTRY.register("kayze_armor_boots", () -> new KayzeArmorItem.Boots());
	public static final RegistryObject<Item> STEA_WOOD = block(AccursModBlocks.STEA_WOOD, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> STEA_LOG = block(AccursModBlocks.STEA_LOG, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> STEA_PLANKS = block(AccursModBlocks.STEA_PLANKS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> STEA_LEAVES = block(AccursModBlocks.STEA_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> STEA_STAIRS = block(AccursModBlocks.STEA_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> STEA_SLAB = block(AccursModBlocks.STEA_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> STEA_FENCE = block(AccursModBlocks.STEA_FENCE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> STEA_FENCE_GATE = block(AccursModBlocks.STEA_FENCE_GATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> STEA_PRESSURE_PLATE = block(AccursModBlocks.STEA_PRESSURE_PLATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> STEA_BUTTON = block(AccursModBlocks.STEA_BUTTON, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TYCO_WOOD = block(AccursModBlocks.TYCO_WOOD, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TYCO_LOG = block(AccursModBlocks.TYCO_LOG, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TYCO_PLANKS = block(AccursModBlocks.TYCO_PLANKS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TYCO_LEAVES = block(AccursModBlocks.TYCO_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> TYCO_STAIRS = block(AccursModBlocks.TYCO_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TYCO_SLAB = block(AccursModBlocks.TYCO_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TYCO_FENCE = block(AccursModBlocks.TYCO_FENCE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> TYCO_FENCE_GATE = block(AccursModBlocks.TYCO_FENCE_GATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> TYCO_PRESSURE_PLATE = block(AccursModBlocks.TYCO_PRESSURE_PLATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> TYCO_BUTTON = block(AccursModBlocks.TYCO_BUTTON, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TYCO_STICK = REGISTRY.register("tyco_stick", () -> new TycoStickItem());
	public static final RegistryObject<Item> UCYA_INGOT = REGISTRY.register("ucya_ingot", () -> new UcyaIngotItem());
	public static final RegistryObject<Item> UCYA_ORE = block(AccursModBlocks.UCYA_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> UCYA_BLOCK = block(AccursModBlocks.UCYA_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> UCYA_PICKAXE = REGISTRY.register("ucya_pickaxe", () -> new UcyaPickaxeItem());
	public static final RegistryObject<Item> UCYA_AXE = REGISTRY.register("ucya_axe", () -> new UcyaAxeItem());
	public static final RegistryObject<Item> UCYA_SWORD = REGISTRY.register("ucya_sword", () -> new UcyaSwordItem());
	public static final RegistryObject<Item> UCYA_SHOVEL = REGISTRY.register("ucya_shovel", () -> new UcyaShovelItem());
	public static final RegistryObject<Item> UCYA_HOE = REGISTRY.register("ucya_hoe", () -> new UcyaHoeItem());
	public static final RegistryObject<Item> UCYA_ARMOR_HELMET = REGISTRY.register("ucya_armor_helmet", () -> new UcyaArmorItem.Helmet());
	public static final RegistryObject<Item> UCYA_ARMOR_CHESTPLATE = REGISTRY.register("ucya_armor_chestplate", () -> new UcyaArmorItem.Chestplate());
	public static final RegistryObject<Item> UCYA_ARMOR_LEGGINGS = REGISTRY.register("ucya_armor_leggings", () -> new UcyaArmorItem.Leggings());
	public static final RegistryObject<Item> UCYA_ARMOR_BOOTS = REGISTRY.register("ucya_armor_boots", () -> new UcyaArmorItem.Boots());
	public static final RegistryObject<Item> HOGALALLA = REGISTRY.register("hogalalla_spawn_egg",
			() -> new ForgeSpawnEggItem(AccursModEntities.HOGALALLA, -13434829, -16777216, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> QUANCY_WOOD = block(AccursModBlocks.QUANCY_WOOD, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> QUANCY_LOG = block(AccursModBlocks.QUANCY_LOG, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> QUANCY_PLANKS = block(AccursModBlocks.QUANCY_PLANKS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> QUANCY_LEAVES = block(AccursModBlocks.QUANCY_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> QUANCY_STAIRS = block(AccursModBlocks.QUANCY_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> QUANCY_SLAB = block(AccursModBlocks.QUANCY_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> QUANCY_FENCE = block(AccursModBlocks.QUANCY_FENCE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> QUANCY_FENCE_GATE = block(AccursModBlocks.QUANCY_FENCE_GATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> QUANCY_PRESSURE_PLATE = block(AccursModBlocks.QUANCY_PRESSURE_PLATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> QUANCY_BUTTON = block(AccursModBlocks.QUANCY_BUTTON, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RUBY = REGISTRY.register("ruby", () -> new RubyItem());
	public static final RegistryObject<Item> RUBY_ORE = block(AccursModBlocks.RUBY_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RUBY_BLOCK = block(AccursModBlocks.RUBY_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RUBY_PICKAXE = REGISTRY.register("ruby_pickaxe", () -> new RubyPickaxeItem());
	public static final RegistryObject<Item> RUBY_AXE = REGISTRY.register("ruby_axe", () -> new RubyAxeItem());
	public static final RegistryObject<Item> RUBY_SWORD = REGISTRY.register("ruby_sword", () -> new RubySwordItem());
	public static final RegistryObject<Item> RUBY_SHOVEL = REGISTRY.register("ruby_shovel", () -> new RubyShovelItem());
	public static final RegistryObject<Item> RUBY_HOE = REGISTRY.register("ruby_hoe", () -> new RubyHoeItem());
	public static final RegistryObject<Item> RUBY_ARMOR_HELMET = REGISTRY.register("ruby_armor_helmet", () -> new RubyArmorItem.Helmet());
	public static final RegistryObject<Item> RUBY_ARMOR_CHESTPLATE = REGISTRY.register("ruby_armor_chestplate", () -> new RubyArmorItem.Chestplate());
	public static final RegistryObject<Item> RUBY_ARMOR_LEGGINGS = REGISTRY.register("ruby_armor_leggings", () -> new RubyArmorItem.Leggings());
	public static final RegistryObject<Item> RUBY_ARMOR_BOOTS = REGISTRY.register("ruby_armor_boots", () -> new RubyArmorItem.Boots());
	public static final RegistryObject<Item> EMERALD_TOOLS_PICKAXE = REGISTRY.register("emerald_tools_pickaxe", () -> new EmeraldToolsPickaxeItem());
	public static final RegistryObject<Item> EMERALD_TOOLS_AXE = REGISTRY.register("emerald_tools_axe", () -> new EmeraldToolsAxeItem());
	public static final RegistryObject<Item> EMERALD_TOOLS_SWORD = REGISTRY.register("emerald_tools_sword", () -> new EmeraldToolsSwordItem());
	public static final RegistryObject<Item> EMERALD_TOOLS_SHOVEL = REGISTRY.register("emerald_tools_shovel", () -> new EmeraldToolsShovelItem());
	public static final RegistryObject<Item> EMERALD_TOOLS_HOE = REGISTRY.register("emerald_tools_hoe", () -> new EmeraldToolsHoeItem());
	public static final RegistryObject<Item> EMERALD_ARMOUR_ARMOR_HELMET = REGISTRY.register("emerald_armour_armor_helmet",
			() -> new EmeraldArmourArmorItem.Helmet());
	public static final RegistryObject<Item> EMERALD_ARMOUR_ARMOR_CHESTPLATE = REGISTRY.register("emerald_armour_armor_chestplate",
			() -> new EmeraldArmourArmorItem.Chestplate());
	public static final RegistryObject<Item> EMERALD_ARMOUR_ARMOR_LEGGINGS = REGISTRY.register("emerald_armour_armor_leggings",
			() -> new EmeraldArmourArmorItem.Leggings());
	public static final RegistryObject<Item> EMERALD_ARMOUR_ARMOR_BOOTS = REGISTRY.register("emerald_armour_armor_boots",
			() -> new EmeraldArmourArmorItem.Boots());
	public static final RegistryObject<Item> UTYX_FLUID_BUCKET = REGISTRY.register("utyx_fluid_bucket", () -> new UtyxFluidItem());
	public static final RegistryObject<Item> HELL_TREES_WOOD = block(AccursModBlocks.HELL_TREES_WOOD, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> HELL_TREES_LOG = block(AccursModBlocks.HELL_TREES_LOG, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> HELL_TREES_PLANKS = block(AccursModBlocks.HELL_TREES_PLANKS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> HELL_TREES_LEAVES = block(AccursModBlocks.HELL_TREES_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> HELL_TREES_STAIRS = block(AccursModBlocks.HELL_TREES_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> HELL_TREES_SLAB = block(AccursModBlocks.HELL_TREES_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> HELL_TREES_FENCE = block(AccursModBlocks.HELL_TREES_FENCE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> HELL_TREES_FENCE_GATE = block(AccursModBlocks.HELL_TREES_FENCE_GATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> HELL_TREES_PRESSURE_PLATE = block(AccursModBlocks.HELL_TREES_PRESSURE_PLATE,
			CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> HELL_TREES_BUTTON = block(AccursModBlocks.HELL_TREES_BUTTON, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> COPPER_PICKAXE = REGISTRY.register("copper_pickaxe", () -> new CopperPickaxeItem());
	public static final RegistryObject<Item> COPPER_AXE = REGISTRY.register("copper_axe", () -> new CopperAxeItem());
	public static final RegistryObject<Item> COPPER_SWORD = REGISTRY.register("copper_sword", () -> new CopperSwordItem());
	public static final RegistryObject<Item> COPPER_SHOVEL = REGISTRY.register("copper_shovel", () -> new CopperShovelItem());
	public static final RegistryObject<Item> COPPER_HOE = REGISTRY.register("copper_hoe", () -> new CopperHoeItem());
	public static final RegistryObject<Item> COPPER_ARMOR_HELMET = REGISTRY.register("copper_armor_helmet", () -> new CopperArmorItem.Helmet());
	public static final RegistryObject<Item> COPPER_ARMOR_CHESTPLATE = REGISTRY.register("copper_armor_chestplate",
			() -> new CopperArmorItem.Chestplate());
	public static final RegistryObject<Item> COPPER_ARMOR_LEGGINGS = REGISTRY.register("copper_armor_leggings", () -> new CopperArmorItem.Leggings());
	public static final RegistryObject<Item> COPPER_ARMOR_BOOTS = REGISTRY.register("copper_armor_boots", () -> new CopperArmorItem.Boots());
	public static final RegistryObject<Item> BIYON_WOOD = block(AccursModBlocks.BIYON_WOOD, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BIYON_LOG = block(AccursModBlocks.BIYON_LOG, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BIYON_PLANKS = block(AccursModBlocks.BIYON_PLANKS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BIYON_LEAVES = block(AccursModBlocks.BIYON_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> BIYON_STAIRS = block(AccursModBlocks.BIYON_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BIYON_SLAB = block(AccursModBlocks.BIYON_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BIYON_FENCE = block(AccursModBlocks.BIYON_FENCE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> BIYON_FENCE_GATE = block(AccursModBlocks.BIYON_FENCE_GATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> BIYON_PRESSURE_PLATE = block(AccursModBlocks.BIYON_PRESSURE_PLATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> BIYON_BUTTON = block(AccursModBlocks.BIYON_BUTTON, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> MAGIC_GRASS = block(AccursModBlocks.MAGIC_GRASS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> MAGIC_DIRT = block(AccursModBlocks.MAGIC_DIRT, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> AZCUL_WOOD = block(AccursModBlocks.AZCUL_WOOD, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> AZCUL_LOG = block(AccursModBlocks.AZCUL_LOG, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> AZCUL_PLANKS = block(AccursModBlocks.AZCUL_PLANKS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> AZCUL_LEAVES = block(AccursModBlocks.AZCUL_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> AZCUL_STAIRS = block(AccursModBlocks.AZCUL_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> AZCUL_SLAB = block(AccursModBlocks.AZCUL_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> AZCUL_FENCE = block(AccursModBlocks.AZCUL_FENCE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> AZCUL_FENCE_GATE = block(AccursModBlocks.AZCUL_FENCE_GATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> AZCUL_PRESSURE_PLATE = block(AccursModBlocks.AZCUL_PRESSURE_PLATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> AZCUL_BUTTON = block(AccursModBlocks.AZCUL_BUTTON, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> AZCUL_STONE = block(AccursModBlocks.AZCUL_STONE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> AZCUL_GRASS = block(AccursModBlocks.AZCUL_GRASS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> PAIZON_LEAVES = block(AccursModBlocks.PAIZON_LEAVES, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SIMS_INGOT = REGISTRY.register("sims_ingot", () -> new SimsIngotItem());
	public static final RegistryObject<Item> SIMS_ORE = block(AccursModBlocks.SIMS_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SIMS_BLOCK = block(AccursModBlocks.SIMS_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SIMS_PICKAXE = REGISTRY.register("sims_pickaxe", () -> new SimsPickaxeItem());
	public static final RegistryObject<Item> SIMS_AXE = REGISTRY.register("sims_axe", () -> new SimsAxeItem());
	public static final RegistryObject<Item> SIMS_SWORD = REGISTRY.register("sims_sword", () -> new SimsSwordItem());
	public static final RegistryObject<Item> SIMS_SHOVEL = REGISTRY.register("sims_shovel", () -> new SimsShovelItem());
	public static final RegistryObject<Item> SIMS_HOE = REGISTRY.register("sims_hoe", () -> new SimsHoeItem());
	public static final RegistryObject<Item> SIMS_ARMOR_HELMET = REGISTRY.register("sims_armor_helmet", () -> new SimsArmorItem.Helmet());
	public static final RegistryObject<Item> SIMS_ARMOR_CHESTPLATE = REGISTRY.register("sims_armor_chestplate", () -> new SimsArmorItem.Chestplate());
	public static final RegistryObject<Item> SIMS_ARMOR_LEGGINGS = REGISTRY.register("sims_armor_leggings", () -> new SimsArmorItem.Leggings());
	public static final RegistryObject<Item> SIMS_ARMOR_BOOTS = REGISTRY.register("sims_armor_boots", () -> new SimsArmorItem.Boots());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
