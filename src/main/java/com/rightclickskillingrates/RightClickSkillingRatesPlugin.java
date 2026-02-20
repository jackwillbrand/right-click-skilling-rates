package com.rightclickskillingrates;

import com.google.inject.Provides;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

@Slf4j
@PluginDescriptor(
	name = "Right Click Skilling Rates"
)
public class RightClickSkillingRatesPlugin extends Plugin
{
	@Inject
	private Client client;

	@Inject
	private RightClickSkillingRatesConfig config;

	@Override
	protected void startUp() throws Exception
	{
		log.debug("Right Click Skilling Rates plugin started!");
	}

	@Override
	protected void shutDown() throws Exception
	{
		log.debug("Right Click Skilling Rates plugin stopped!");
	}

	@Subscribe
	public void onGameStateChanged(GameStateChanged gameStateChanged)
	{

	}

	@Provides
	RightClickSkillingRatesConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(RightClickSkillingRatesConfig.class);
	}
}
