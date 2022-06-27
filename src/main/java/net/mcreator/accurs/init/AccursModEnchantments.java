
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.accurs.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.accurs.enchantment.MeltingEnchantment;
import net.mcreator.accurs.AccursMod;

public class AccursModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, AccursMod.MODID);
	public static final RegistryObject<Enchantment> MELTING = REGISTRY.register("melting", () -> new MeltingEnchantment());
}
