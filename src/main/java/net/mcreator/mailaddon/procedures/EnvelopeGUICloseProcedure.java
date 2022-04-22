package net.mcreator.mailaddon.procedures;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.mailaddon.MailAddonMod;

import java.util.Map;

public class EnvelopeGUICloseProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MailAddonMod.LOGGER.warn("Failed to load dependency entity for procedure EnvelopeGUIClose!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).closeScreen();
	}
}
