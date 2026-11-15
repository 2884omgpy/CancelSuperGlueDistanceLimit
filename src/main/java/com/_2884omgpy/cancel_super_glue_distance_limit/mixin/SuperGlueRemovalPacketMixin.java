package com._2884omgpy.cancel_super_glue_distance_limit.mixin;

import com.simibubi.create.content.contraptions.glue.SuperGlueRemovalPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(value = SuperGlueRemovalPacket.class, remap = false)
public class SuperGlueRemovalPacketMixin
{
    @ModifyConstant(method = "lambda$handle$0", constant = @Constant(doubleValue = 32.0D, ordinal = 0), remap = false)
    private double cancelSuperGlueDistanceLimit(double original)
    {
        return 2147483647;
    }
}
