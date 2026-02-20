package com.rightclickskillingrates;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class RightClickSkillingRatesPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(RightClickSkillingRatesPlugin.class);
		RuneLite.main(args);
	}
}