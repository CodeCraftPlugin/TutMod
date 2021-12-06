package me.codecraft.tut.item;

import me.codecraft.tut.TutMod;
import me.codecraft.tut.block.ModBlock;
import me.codecraft.tut.item.advance.Finder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItem {
    //Items
    public static final Item RUBY= registerItem("ruby",
            new Item(new FabricItemSettings().group(ItemGroupMod.RUBY_MOD)));

    public static final Item PEPPER_SEED= registerItem("pepper_seed",
            new BlockItem(ModBlock.PEPPER_PLANT,new FabricItemSettings().group(ItemGroupMod.RUBY_MOD)));

    public static final Item ORE_FINDER= registerItem("ore_finder",
            new Finder(new FabricItemSettings().maxDamage(20).group(ItemGroupMod.RUBY_MOD)));
    //Food
    public static final Item PEPPER= registerItem("pepper",new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(4).saturationModifier(1.0f).build())
            .group(ItemGroupMod.RUBY_MOD)));
    public static final Item SPICYSOUP= registerItem("spicysoup",new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(6).saturationModifier(2.0f).snack()
                    .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,
                            20*60),1f).build()).group(ItemGroupMod.RUBY_MOD)));

    //Tools

    public static final Item RUBY_PICKAXE= registerItem("ruby_pickaxe",
            new ModPickaxeItem(ModToolMaterial.RUBY,-15 ,4.0f,
                    new FabricItemSettings().group(ItemGroupMod.RUBY_MOD)));
    public static final Item RUBY_AXE= registerItem("ruby_axe",
            new ModAxeItem(ModToolMaterial.RUBY,16 ,8.0f
                    ,new FabricItemSettings().group(ItemGroupMod.RUBY_MOD)));
    public static final Item RUBY_HOE= registerItem("ruby_hoe",
            new ModHoeItem(ModToolMaterial.RUBY,-15 ,8.0f,
                    new FabricItemSettings().group(ItemGroupMod.RUBY_MOD)));

    public static final Item RUBY_SWORD= registerItem("ruby_sword",
            new SwordItem(ModToolMaterial.RUBY,10 ,28f
                    ,new FabricItemSettings().group(ItemGroupMod.RUBY_MOD)));
    public static final Item RUBY_SHOVEL= registerItem("ruby_shovel",
            new ShovelItem(ModToolMaterial.RUBY,-15 ,8f,
                    new FabricItemSettings().group(ItemGroupMod.RUBY_MOD)));
    //Armor
    //Helmets
    public static final Item RUBY_HELMET= registerItem("ruby_helmet",
            new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ItemGroupMod.RUBY_MOD)));
    //ChestPlate
    public static final Item RUBY_CHESTPLATE= registerItem("ruby_chestplate",
            new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ItemGroupMod.RUBY_MOD)));
    //legging
    public static final Item RUBY_LEGGINGS= registerItem("ruby_leggings",
            new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ItemGroupMod.RUBY_MOD)));
    //boot
    public static final Item RUBY_BOOTS= registerItem("ruby_boots",
            new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ItemGroupMod.RUBY_MOD)));
    //HorseArmor
    public static final Item RUBY_HORSE_ARMOR= registerItem("ruby_horse_armor",
            new HorseArmorItem(13,"ruby",
                    new FabricItemSettings().group(ItemGroupMod.RUBY_MOD)));

    private static Item registerItem(String name,Item item){
        return Registry.register(Registry.ITEM, new Identifier(TutMod.mod_id,name),item);
    }
    public static void registerModItem(){
        System.out.println("the Item is registered "+ TutMod.mod_id);
    }

}
