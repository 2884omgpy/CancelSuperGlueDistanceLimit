package com._2884omgpy.cancel_super_glue_distance_limit.mixin;

import com._2884omgpy.cancel_super_glue_distance_limit.CommonConfig;
import com.simibubi.create.content.contraptions.glue.SuperGlueSelectionHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(value = SuperGlueSelectionHandler.class, remap = false)
public class SuperGlueSelectionHandlerMixin
{
    @ModifyConstant(method = "tick", constant = @Constant(doubleValue = 32.0D, ordinal = 0), remap = false)
    private double searchX(double original)
    {
        return CommonConfig.SEARCH_X.get();
    }

    @ModifyConstant(method = "tick", constant = @Constant(doubleValue = 16.0D, ordinal = 0), remap = false)
    private double searchY(double original)
    {
        return CommonConfig.SEARCH_Y.get();
    }

    @ModifyConstant(method = "tick", constant = @Constant(doubleValue = 32.0D, ordinal = 1), remap = false)
    private double searchZ(double original)
    {
        return CommonConfig.SEARCH_Z.get();
    }

    @ModifyConstant(method = "tick", constant = @Constant(doubleValue = 24.0D, ordinal = 0), remap = false)
    private double cancelSuperGlueDistanceLimit(double original)
    {
        return 2147483647;
    }
}
