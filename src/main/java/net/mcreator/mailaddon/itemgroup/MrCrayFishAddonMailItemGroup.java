
package net.mcreator.mailaddon.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.mailaddon.item.EnvelopeItem;
import net.mcreator.mailaddon.MailAddonModElements;

@MailAddonModElements.ModElement.Tag
public class MrCrayFishAddonMailItemGroup extends MailAddonModElements.ModElement {
	public MrCrayFishAddonMailItemGroup(MailAddonModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmr_cray_fish_addon_mail") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(EnvelopeItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
