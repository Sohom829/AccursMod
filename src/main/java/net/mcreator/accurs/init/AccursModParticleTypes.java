
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.accurs.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.accurs.AccursMod;

public class AccursModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, AccursMod.MODID);
	public static final RegistryObject<ParticleType<?>> MAGIC_PARTICLES = REGISTRY.register("magic_particles", () -> new SimpleParticleType(false));
	public static final RegistryObject<ParticleType<?>> PAIZON_PARTICLES = REGISTRY.register("paizon_particles", () -> new SimpleParticleType(false));
}
