package com.kwvanderlinde.fabricmc.example.common;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.nio.file.Path;
import java.util.Objects;

public class Example {
	public static final String MOD_NAME = "example_mod";

	private static final Logger LOGGER = LogManager.getFormatterLogger(Example.class.getCanonicalName());

	private static Example instance = null;

	public static Example getInstance() {
		return Objects.requireNonNull(instance);
	}

	public static Example initialize(Path configurationDirectory) {
		if (instance != null) {
			throw new RuntimeException(String.format("%s has already been initialized.", MOD_NAME));
		}

		instance = new Example();

		return instance;
	}

	private Example() {
		LOGGER.info("Initializing mod {}", MOD_NAME);

		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Finished initializing mod {}", MOD_NAME);

		instance = this;

	}
}
