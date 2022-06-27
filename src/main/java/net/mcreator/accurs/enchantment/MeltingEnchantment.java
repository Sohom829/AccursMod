
package net.mcreator.accurs.enchantment;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;

import net.mcreator.accurs.init.AccursModItems;

public class MeltingEnchantment extends Enchantment {
	public MeltingEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.COMMON, EnchantmentCategory.BREAKABLE, slots);
	}

	@Override
	public int getMaxLevel() {
		return 5;
	}

	@Override
	protected boolean checkCompatibility(Enchantment ench) {
		if (ench == Enchantments.BLOCK_FORTUNE)
			return true;
		if (ench == Enchantments.UNBREAKING)
			return true;
		if (ench == Enchantments.MENDING)
			return true;
		if (ench == Enchantments.BLOCK_EFFICIENCY)
			return true;
		return false;
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack) {
		if (stack.getItem() == AccursModItems.LAPIS_PICKAXE.get())
			return true;
		if (stack.getItem() == AccursModItems.REDSTONE_PICKAXE.get())
			return true;
		if (stack.getItem() == AccursModItems.KAYZE_PICKAXE.get())
			return true;
		if (stack.getItem() == Items.WOODEN_PICKAXE)
			return true;
		if (stack.getItem() == AccursModItems.UCYA_PICKAXE.get())
			return true;
		if (stack.getItem() == Items.STONE_PICKAXE)
			return true;
		if (stack.getItem() == Items.IRON_PICKAXE)
			return true;
		if (stack.getItem() == Items.GOLDEN_PICKAXE)
			return true;
		if (stack.getItem() == Items.DIAMOND_PICKAXE)
			return true;
		if (stack.getItem() == Items.NETHERITE_PICKAXE)
			return true;
		return false;
	}

	@Override
	public boolean isTreasureOnly() {
		return true;
	}
}
