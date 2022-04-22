
package net.mcreator.mailaddon.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.mailaddon.itemgroup.MrCrayFishAddonMailItemGroup;
import net.mcreator.mailaddon.MailAddonModElements;

@MailAddonModElements.ModElement.Tag
public class CardboardItem extends MailAddonModElements.ModElement {
	@ObjectHolder("mail_addon:cardboard")
	public static final Item block = null;

	public CardboardItem(MailAddonModElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MrCrayFishAddonMailItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("cardboard");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
