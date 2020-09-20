package com.kwvanderlinde.fabricmc.example;

import com.kwvanderlinde.fabricmc.example.common.Example;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;

public class ExampleModInitializer implements ModInitializer {
	@Override
	public void onInitialize() {
		Example.initialize(FabricLoader.getInstance().getConfigDir());
	}
}
