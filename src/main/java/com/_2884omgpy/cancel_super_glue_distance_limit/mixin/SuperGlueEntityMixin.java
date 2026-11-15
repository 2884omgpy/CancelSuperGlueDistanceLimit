package com._2884omgpy.cancel_super_glue_distance_limit.mixin;

import com._2884omgpy.cancel_super_glue_distance_limit.CommonConfig;
import com.simibubi.create.content.contraptions.glue.SuperGlueEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(value = SuperGlueEntity.class, remap = false)
public class SuperGlueEntityMixin
{
    @ModifyConstant(method = "isGlued", constant = @Constant(doubleValue = 16.0D, ordinal = 0), remap = false)
    private static double cancelSuperGlueCheckRangeLimit(double original)
    {
        return CommonConfig.GLUE_CHECK_RANGE.get();
    }
}
