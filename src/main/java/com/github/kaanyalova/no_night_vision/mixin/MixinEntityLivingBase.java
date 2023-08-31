package com.github.kaanyalova.no_night_vision.mixin;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.PotionEffect;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;


@Mixin(EntityLivingBase.class)
public class MixinEntityLivingBase {
    @Inject(method = "addPotionEffect", at = @At("HEAD"), cancellable = true)
    public void addPotionEffect(PotionEffect potioneffect, CallbackInfo ci) {

        // 16 should be night vision
        if (potioneffect.getPotionID() == 16) {
            ci.cancel();
        }

    }
}
