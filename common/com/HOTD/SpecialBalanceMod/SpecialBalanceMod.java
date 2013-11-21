package com.HOTD.SpecialBalanceMod;

import java.util.ArrayList;
import java.util.Date;
import java.util.Timer;

import com.HOTD.SpecialBalanceMod.core.proxy.CommonProxy;
import com.HOTD.SpecialBalanceMod.lib.References;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(name = References.MODNAME,
	 modid = References.MODID ,
	 version = References.VERSION)

@NetworkMod(clientSideRequired = true,
			serverSideRequired = false)

public class SpecialBalanceMod {
	
	@SidedProxy(clientSide = References.CLIENT_PROXY_LOCATION,
				serverSide = References.COMMON_PROXY_LOCATION)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.registerRenderers();
		//Mod Edits
		ModEdits.TinkersEdits();
	}
	
	@EventHandler
	public void postinit(FMLPostInitializationEvent event){
	}
}
