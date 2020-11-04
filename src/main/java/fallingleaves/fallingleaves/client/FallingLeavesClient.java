package fallingleaves.fallingleaves.client;

import fallingleaves.fallingleaves.FallingLeaves;
import fallingleaves.fallingleaves.particle.FallingLeafParticle;
import fallingleaves.fallingleaves.particle.FallingSpruceLeafParticle;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.util.registry.Registry;

@Environment(EnvType.CLIENT)
public class FallingLeavesClient implements ClientModInitializer {

    public static DefaultParticleType FALLING_LEAF;
    public static DefaultParticleType FALLING_SPRUCE_LEAF;

    @Override
    public void onInitializeClient() {
        FALLING_LEAF = Registry.register(Registry.PARTICLE_TYPE, FallingLeaves.id("falling_leaf"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(FALLING_LEAF, FallingLeafParticle.DefaultFactory::new);

        FALLING_SPRUCE_LEAF = Registry.register(Registry.PARTICLE_TYPE, FallingLeaves.id("falling_leaf_spruce"), FabricParticleTypes.simple(true));
        ParticleFactoryRegistry.getInstance().register(FALLING_SPRUCE_LEAF, FallingSpruceLeafParticle.DefaultFactory::new);
    }
}