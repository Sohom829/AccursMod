
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.accurs.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.accurs.fluid.UtyxFluidFluid;
import net.mcreator.accurs.AccursMod;

public class AccursModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, AccursMod.MODID);
	public static final RegistryObject<Fluid> UTYX_FLUID = REGISTRY.register("utyx_fluid", () -> new UtyxFluidFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_UTYX_FLUID = REGISTRY.register("flowing_utyx_fluid", () -> new UtyxFluidFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(UTYX_FLUID.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_UTYX_FLUID.get(), renderType -> renderType == RenderType.translucent());
		}
	}
}
