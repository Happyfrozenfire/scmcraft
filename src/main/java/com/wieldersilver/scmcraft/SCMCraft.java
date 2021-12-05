package com.wieldersilver.scmcraft;

import com.wieldersilver.scmcraft.registry.ModBlocks;
import com.wieldersilver.scmcraft.registry.ModItems;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.heightprovider.UniformHeightProvider;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SCMCraft implements ModInitializer {

	public static final Logger LOGGER = LogManager.getLogger("scmcraft");

	public static final String MOD_ID = "scmcraft";

	private static ConfiguredFeature<?, ?> RUBY_ORE_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(
					OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
					ModBlocks.RUBY_ORE.getDefaultState(),
					9)) // Vein size
			.range(new RangeDecoratorConfig(
					// You can also use one of the other height providers if you don't want a uniform distribution
					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(64)))) // Inclusive min and max height
			.spreadHorizontally()
			.repeat(20); // Number of veins per chunk

	private static ConfiguredFeature<?, ?> SAPPHIRE_ORE_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(
					OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
					ModBlocks.SAPPHIRE_ORE.getDefaultState(),
					9)) // Vein size
			.range(new RangeDecoratorConfig(
					// You can also use one of the other height providers if you don't want a uniform distribution
					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(64)))) // Inclusive min and max height
			.spreadHorizontally()
			.repeat(20); // Number of veins per chunk



	private static ConfiguredFeature<?, ?> TOPAZ_ORE_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(
					OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
					ModBlocks.TOPAZ_ORE.getDefaultState(),
					9)) // Vein size
			.range(new RangeDecoratorConfig(
					// You can also use one of the other height providers if you don't want a uniform distribution
					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(64)))) // Inclusive min and max height
			.spreadHorizontally()
			.repeat(20); // Number of veins per chunk

	private static ConfiguredFeature<?, ?> MYTHRIL_ORE_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(
					OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
					ModBlocks.MYTHRIL_ORE.getDefaultState(),
					9)) // Vein size
			.range(new RangeDecoratorConfig(
					// You can also use one of the other height providers if you don't want a uniform distribution
					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(64)))) // Inclusive min and max height
			.spreadHorizontally()
			.repeat(20); // Number of veins per chunk

	@Override
	public void onInitialize()
	{
		LOGGER.info("Loading SCMCraft");

		ModItems.registerItems();
		ModBlocks.registerBlocks();

		RegistryKey<ConfiguredFeature<?, ?>> rubyOreOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("tutorial", "ruby_ore_overworld"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, rubyOreOverworld.getValue(), RUBY_ORE_OVERWORLD);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, rubyOreOverworld);

		RegistryKey<ConfiguredFeature<?, ?>> sapphireOreOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("tutorial", "sapphire_ore_overworld"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, sapphireOreOverworld.getValue(), SAPPHIRE_ORE_OVERWORLD);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,sapphireOreOverworld);

		RegistryKey<ConfiguredFeature<?, ?>> topazOreOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("tutorial", "topaz_ore_overworld"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, topazOreOverworld.getValue(), TOPAZ_ORE_OVERWORLD);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, topazOreOverworld);

		RegistryKey<ConfiguredFeature<?, ?>> mythrilOreOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("tutorial", "mythril_ore_overworld"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, mythrilOreOverworld.getValue(), MYTHRIL_ORE_OVERWORLD);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, mythrilOreOverworld);

	}
}
