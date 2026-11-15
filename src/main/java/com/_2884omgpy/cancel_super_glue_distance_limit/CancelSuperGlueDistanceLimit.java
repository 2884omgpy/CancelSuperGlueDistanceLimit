package com._2884omgpy.cancel_super_glue_distance_limit;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(com._2884omgpy.cancel_super_glue_distance_limit.CancelSuperGlueDistanceLimit.MOD_ID)
public class CancelSuperGlueDistanceLimit
{
    public static final String MOD_ID = "cancel_super_glue_distance_limit";

    public CancelSuperGlueDistanceLimit(FMLJavaModLoadingContext context)
    {
        context.registerConfig(ModConfig.Type.COMMON, CommonConfig.SPEC);
        MinecraftForge.EVENT_BUS.register(this);
    }
}
