
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.accurs.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.client.Minecraft;

import net.mcreator.accurs.client.particle.PaizonParticlesParticle;
import net.mcreator.accurs.client.particle.MagicParticlesParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AccursModParticles {
	@SubscribeEvent
	public static void registerParticles(ParticleFactoryRegisterEvent event) {
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) AccursModParticleTypes.MAGIC_PARTICLES.get(),
				MagicParticlesParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) AccursModParticleTypes.PAIZON_PARTICLES.get(),
				PaizonParticlesParticle::provider);
	}
}
