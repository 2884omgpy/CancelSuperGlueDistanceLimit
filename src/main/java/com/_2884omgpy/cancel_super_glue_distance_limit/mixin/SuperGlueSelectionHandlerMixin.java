package com._2884omgpy.cancel_super_glue_distance_limit.mixin;

import com._2884omgpy.cancel_super_glue_distance_limit.CommonConfig;
import com.simibubi.create.content.contraptions.glue.SuperGlueSelectionHandler;
import net.minecraft.world.phys.AABB;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value = SuperGlueSelectionHandler.class, remap = false)
public class SuperGlueSelectionHandlerMixin
{
    @Redirect(method = "tick", remap = false, at = @At(value = "INVOKE", target = "Lnet/minecraft/world/phys/AABB;inflate(DDD)Lnet/minecraft/world/phys/AABB;"))
    private AABB customSuperGlueSearchRangeLimit(AABB box, double x, double y, double z)
    {
        return box.inflate(CommonConfig.SEARCH_X.get(), CommonConfig.SEARCH_Y.get(), CommonConfig.SEARCH_Z.get());
    }

    @ModifyConstant(method = "tick", constant = @Constant(doubleValue = 24.0D, ordinal = 0), remap = false)
    private double cancelSuperGlueDistanceLimit(double original)
    {
        return 2147483647;
    }
}
