package com.misanthropy.fastjei.gen3.mixin;

import mezz.jei.library.plugins.vanilla.VanillaPlugin;
import org.spongepowered.asm.mixin.Mixin;

/**
 * Compatibility placeholder: category timing hooks are intentionally disabled.
 * Recipe generation and registration remain under JEI and the optimization mixins.
 */
@Mixin(value = VanillaPlugin.class, remap = false)
public abstract class VanillaPluginTimingMixin {
}
