
package net.mcreator.accurs.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BucketItem;

import net.mcreator.accurs.init.AccursModFluids;

public class UtyxFluidItem extends BucketItem {
	public UtyxFluidItem() {
		super(AccursModFluids.UTYX_FLUID,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(CreativeModeTab.TAB_MISC));
	}
}
