package net.mcreator.mailaddon.procedures;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.gui.widget.TextFieldWidget;

import net.mcreator.mailaddon.MailAddonMod;

import java.util.Map;
import java.util.HashMap;

public class RenameItemProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MailAddonMod.LOGGER.warn("Failed to load dependency entity for procedure RenameItem!");
			return;
		}
		if (dependencies.get("guistate") == null) {
			if (!dependencies.containsKey("guistate"))
				MailAddonMod.LOGGER.warn("Failed to load dependency guistate for procedure RenameItem!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		HashMap guistate = (HashMap) dependencies.get("guistate");
		(((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY))
				.setDisplayName(new StringTextComponent((new Object() {
					public String getText() {
						TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:EnterTitleName");
						if (_tf != null) {
							return _tf.getText();
						}
						return "";
					}
				}.getText())));
		if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getDisplayName().getString())
				.equals("")) {
			(((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY))
					.setDisplayName(new StringTextComponent("Envelope"));
		} else {
			{
				TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:EnterTitleName");
				if (_tf != null) {
					_tf.setText((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getDisplayName()
							.getString()));
				}
			}
		}
	}
}
