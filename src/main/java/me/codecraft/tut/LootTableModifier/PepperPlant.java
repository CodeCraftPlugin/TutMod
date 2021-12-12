package me.codecraft.tut.LootTableModifier;

import me.codecraft.tut.item.ModItem;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.loot.condition.LootConditionTypes;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;

import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.LootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class PepperPlant {
    private static final Identifier GRASS = new
            Identifier(Identifier.DEFAULT_NAMESPACE,"block/grass");
    public static void LoottableModifier(){
        LootTableLoadingCallback.EVENT.register(((resourceManager, manager, id, supplier, setter) -> {

            if (GRASS.equals(id)){
                FabricLootPoolBuilder fabricLootPoolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.39F))
                        .with(ItemEntry.builder(ModItem.PEPPER_SEED))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f))
                        .build());
                supplier.withPool(fabricLootPoolBuilder.build());

            }

        }));
    }
}
