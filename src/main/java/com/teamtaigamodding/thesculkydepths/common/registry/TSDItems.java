package com.teamtaigamodding.thesculkydepths.common.registry;

import com.teamabnormals.blueprint.core.util.registry.ItemSubRegistryHelper;
import com.teamtaigamodding.thesculkydepths.TheSculkyDepths;
import com.teamtaigamodding.thesculkydepths.common.items.SculkMulchItem;
import net.minecraft.client.Minecraft;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BowlFoodItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = TheSculkyDepths.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class TSDItems {
    public static final ItemSubRegistryHelper HELPER = TheSculkyDepths.REGISTRY_HELPER.getItemSubHelper();
//Leaving this up to dolt to figure out
    public static final RegistryObject<Item> ECHOLOCATOR = HELPER.createItem("echolocator", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> SCULK_MULCH = HELPER.createItem("sculk_mulch", () -> new SculkMulchItem(new Item.Properties().food(SculkyDepthsFoods.SCULK_MULCH).stacksTo(16).tab(CreativeModeTab.TAB_FOOD)));

    public static final class SculkyDepthsFoods {
        public static final FoodProperties SCULK_MULCH = (new FoodProperties.Builder()).nutrition(-4).saturationMod(0.0F).effect(() -> new MobEffectInstance(MobEffects.DARKNESS, 160, 0), 0.25F).build();
    }
}
