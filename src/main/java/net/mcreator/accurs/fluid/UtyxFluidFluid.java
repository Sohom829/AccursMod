
package net.mcreator.accurs.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.accurs.init.AccursModItems;
import net.mcreator.accurs.init.AccursModFluids;
import net.mcreator.accurs.init.AccursModBlocks;

public abstract class UtyxFluidFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(AccursModFluids.UTYX_FLUID,
			AccursModFluids.FLOWING_UTYX_FLUID,
			FluidAttributes.builder(new ResourceLocation("accurs:blocks/utyxfluid_water"), new ResourceLocation("accurs:blocks/ucya_ore_block"))

	).explosionResistance(100f)

			.tickRate(9)

			.bucket(AccursModItems.UTYX_FLUID_BUCKET).block(() -> (LiquidBlock) AccursModBlocks.UTYX_FLUID.get());

	private UtyxFluidFluid() {
		super(PROPERTIES);
	}

	@Override
	public Vec3 getFlow(BlockGetter world, BlockPos pos, FluidState fluidstate) {
		return super.getFlow(world, pos, fluidstate).scale(3);
	}

	public static class Source extends UtyxFluidFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends UtyxFluidFluid {
		public Flowing() {
			super();
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
