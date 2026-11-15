package com._2884omgpy.cancel_super_glue_distance_limit.mixin;

import com.simibubi.create.content.contraptions.glue.SuperGlueSelectionPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(value = SuperGlueSelectionPacket.class, remap = false)
public class SuperGlueSelectionPacketMixin
{
    @ModifyConstant(method = "lambda$handle$0", constant = @Constant(doubleValue = 25.0D, ordinal = 0), remap = false)
    private double cancelSuperGlueDistanceLimit(double original)
    {
        return 2147483647;
    }
}
