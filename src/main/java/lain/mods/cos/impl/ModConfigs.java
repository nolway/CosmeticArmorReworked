package lain.mods.cos.impl;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.BooleanValue;
import net.minecraftforge.common.ForgeConfigSpec.IntValue;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;

public class ModConfigs
{

    public static BooleanValue CosArmorGuiButton_Hidden;
    public static IntValue CosArmorGuiButton_Left;
    public static IntValue CosArmorGuiButton_Top;
    public static BooleanValue CosArmorToggleButton_Hidden;
    public static IntValue CosArmorToggleButton_Left;
    public static IntValue CosArmorToggleButton_Top;
    public static BooleanValue CosArmorKeepThroughDeath;
    public static BooleanValue CosArmorDisableRecipeBook;
    public static BooleanValue CosArmorToggleButton_Curios;

    public static void registerConfigs()
    {
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, new ForgeConfigSpec.Builder()
        {
            {
                comment("These settings only affects client").push("Client");
                CosArmorGuiButton_Hidden = comment("Whether or not to hide the button for opening CosmeticArmorInventory")
                        .translation("cos.config.CosArmorGuiButton_Hidden")
                        .define("CosArmorGuiButton_Hidden", false);
                CosArmorGuiButton_Left = comment("The horizontal pixel distance from the origin point of player inventory gui")
                        .translation("cos.config.CosArmorGuiButton_Left")
                        .defineInRange("CosArmorGuiButton_Left", 65, Integer.MIN_VALUE, Integer.MAX_VALUE);
                CosArmorGuiButton_Top = comment("The vertical pixel distance from the origin point of player inventoy gui")
                        .translation("cos.config.CosArmorGuiButton_Top")
                        .defineInRange("CosArmorGuiButton_Top", 67, Integer.MIN_VALUE, Integer.MAX_VALUE);
                CosArmorToggleButton_Hidden = comment("Whether or not to hide the button for toggling the mod temporarily on client side")
                        .translation("cos.config.CosArmorToggleButton_Hidden")
                        .define("CosArmorToggleButton_Hidden", false);
                CosArmorToggleButton_Left = comment("The horizontal pixel distance from the origin point of player inventory gui")
                        .translation("cos.config.CosArmorToggleButton_Left")
                        .defineInRange("CosArmorToggleButton_Left", 59, Integer.MIN_VALUE, Integer.MAX_VALUE);
                CosArmorToggleButton_Top = comment("The vertical pixel distance from the origin point of player inventory gui")
                        .translation("cos.config.CosArmorToggleButton_Top")
                        .defineInRange("CosArmorToggleButton_Top", 72, Integer.MIN_VALUE, Integer.MAX_VALUE);
                CosArmorToggleButton_Curios = comment("Whether or not to add buttons to CurioSlots for toggling visibility for that slot")
                        .translation("cos.config.CosArmorToggleButton_Curios")
                        .define("CosArmorToggleButton_Curios", true);
                pop();
            }
        }.build());
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, new ForgeConfigSpec.Builder()
        {
            {
                comment("These settings affects both server and client").push("Common");
                CosArmorKeepThroughDeath = comment("Whether or not to keep items in cosmetic armor slots in the event of player death")
                        .translation("cos.config.CosArmorKeepThroughDeath")
                        .define("CosArmorKeepThroughDeath", false);
                pop();
            }
        }.build());
        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, new ForgeConfigSpec.Builder()
        {
            {
                comment("These settings affects both server and client, they will also be synced from server to client").push("Server");
                CosArmorDisableRecipeBook = comment("Whether or not to disable the RecipeBook in the CosmeticArmorInventory")
                        .translation("cos.config.CosArmorDisableRecipeBook")
                        .define("CosArmorDisableRecipeBook", false);
                pop();
            }
        }.build());
    }

}
