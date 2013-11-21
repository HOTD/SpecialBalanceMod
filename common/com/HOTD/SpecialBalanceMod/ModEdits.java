package com.HOTD.SpecialBalanceMod;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.item.crafting.ShapelessRecipes;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModEdits {
		
	static void TinkersEdits()
	{
		//Seared Brick(Block) into Seared Brick(Ingot)
		GameRegistry.addShapelessRecipe(new ItemStack(14276/*Seared Brick Ingot*/,3,2), new ItemStack(1474/*Seared Brick Block*/,1,2));
	}
}