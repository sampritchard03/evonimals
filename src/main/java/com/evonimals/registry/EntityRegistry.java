package com.evonimals.registry;

import com.evonimals.entity.CubeEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class EntityRegistry {
    public static final EntityType<CubeEntity> CUBE = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of("evonimals", "cube"),
            EntityType.Builder.create(CubeEntity::new, SpawnGroup.CREATURE).dimensions(0.75f, 0.75f).build(RegistryKey.of(RegistryKeys.ENTITY_TYPE, Identifier.of("evonimals", "cube")))
    );

    public static void register() {
        FabricDefaultAttributeRegistry.register(CUBE, CubeEntity.createMobAttributes());
    }
}
