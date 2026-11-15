package com._2884omgpy.cancel_super_glue_distance_limit;

import net.minecraftforge.common.ForgeConfigSpec;

public class CommonConfig
{
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.IntValue SEARCH_X;
    public static final ForgeConfigSpec.IntValue SEARCH_Y;
    public static final ForgeConfigSpec.IntValue SEARCH_Z;

    public static final ForgeConfigSpec.IntValue GLUE_CHECK_RANGE;

    static
    {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();
        builder.comment("强力胶实体检测范围").push("searchRange");

        SEARCH_X = builder.comment("玩家X范围强力胶实体检测（默认32）").defineInRange("x", 32, 0, 2147483647);
        SEARCH_Y = builder.comment("玩家Y范围强力胶实体检测（默认16）").defineInRange("y", 16, 0, 2147483647);
        SEARCH_Z = builder.comment("玩家Z范围强力胶实体检测（默认32）").defineInRange("z", 32, 0, 2147483647);

        GLUE_CHECK_RANGE = builder.comment("装配结构时，从起始方块开始，强力胶实体查询半径范围参数（默认16，强力胶实体位置为其底面中心，按 section（16³）遍历，根据起始方块在区块中的位置，查询半径为R+4~R+19之间波动）").defineInRange("glueCheckRange", 16, 0, 2147483647);

        builder.pop();
        SPEC = builder.build();
    }
}
