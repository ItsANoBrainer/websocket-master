package com.websocketmaster;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class WebsocketMasterTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(WebsocketMaster.class);
		RuneLite.main(args);
	}
}