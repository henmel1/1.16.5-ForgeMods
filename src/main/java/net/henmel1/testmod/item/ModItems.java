package net.henmel1.testmod.item;

import net.henmel1.testmod.TestMod;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.henmel1.testmod.item.ModItemGroup;
import net.minecraft.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static net.minecraft.item.ItemGroup.*;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS
            = DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MOD_ID);

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

    //add quanthracite
    public static final RegistryObject<Item> QUANTHRACITE = ITEMS.register("quanthracite",
            () -> new Item(new Item.Properties().group(ModItemGroup.TEST_MOD)));

    public static final RegistryObject<Item> QUANTHRACITE_SWORD = ITEMS.register("quanthracite_sword",
            () -> new SwordItem(ModItemTier.QUANTHRACITE, 3, -2.4f, new Item.Properties().group(ModItemGroup.TEST_MOD)));

    public static final RegistryObject<Item> QUANTHRACITE_PICKAXE = ITEMS.register("quanthracite_pickaxe",
            () -> new PickaxeItem(ModItemTier.QUANTHRACITE, 1, -2.8f, new Item.Properties().group(ModItemGroup.TEST_MOD)));

    public static final RegistryObject<Item> QUANTHRACITE_AXE = ITEMS.register("quanthracite_axe",
            () -> new AxeItem(ModItemTier.QUANTHRACITE, 5, -3.0f, new Item.Properties().group(ModItemGroup.TEST_MOD)));

    public static final RegistryObject<Item> QUANTHRACITE_SHOVEL = ITEMS.register("quanthracite_shovel",
            () -> new ShovelItem(ModItemTier.QUANTHRACITE, 1.5F, -3.0f, new Item.Properties().group(ModItemGroup.TEST_MOD)));

    public static final RegistryObject<Item> QUANTHRACITE_HOE = ITEMS.register("quanthracite_hoe",
            () -> new HoeItem(ModItemTier.QUANTHRACITE, -5, -0.0f, new Item.Properties().group(ModItemGroup.TEST_MOD)));

    public static final RegistryObject<Item> QUANTHRACITE_BOOTS = ITEMS.register("quanthracite_boots",
            () -> new ArmorItem(ModArmorMaterial.QUANTHRACITE, EquipmentSlotType.FEET,
                    new Item.Properties().group(ModItemGroup.TEST_MOD)));

    public static final RegistryObject<Item> QUANTHRACITE_LEGGINGS = ITEMS.register("quanthracite_leggings",
            () -> new ArmorItem(ModArmorMaterial.QUANTHRACITE, EquipmentSlotType.LEGS,
                    new Item.Properties().group(ModItemGroup.TEST_MOD)));

    public static final RegistryObject<Item> QUANTHRACITE_CHESTPLATE = ITEMS.register("quanthracite_chestplate",
            () -> new ArmorItem(ModArmorMaterial.QUANTHRACITE, EquipmentSlotType.CHEST,
                    new Item.Properties().group(ModItemGroup.TEST_MOD)));

    public static final RegistryObject<Item> QUANTHRACITE_HELMET = ITEMS.register("quanthracite_helmet",
            () -> new ArmorItem(ModArmorMaterial.QUANTHRACITE, EquipmentSlotType.HEAD,
                    new Item.Properties().group(ModItemGroup.TEST_MOD)));
}
