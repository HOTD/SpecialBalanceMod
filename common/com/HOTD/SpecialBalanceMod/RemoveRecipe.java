package com.HOTD.SpecialBalanceMod;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.item.crafting.ShapelessRecipes;
import cpw.mods.fml.common.registry.GameRegistry;


public class RemoveRecipe {

	static void RemoveRecipeFunc(ItemStack resultItem)
    {
    	ItemStack recipeResult = null;
    	ArrayList recipes = (ArrayList) CraftingManager.getInstance().getRecipeList();
    	for (int scan = 0; scan < recipes.size(); scan++)
    	{
    		 IRecipe tmpRecipe = (IRecipe) recipes.get(scan);
             if (tmpRecipe instanceof ShapedRecipes)
             {
                     ShapedRecipes recipe = (ShapedRecipes)tmpRecipe;
                     recipeResult = recipe.getRecipeOutput();
             }
             if (tmpRecipe instanceof ShapelessRecipes)
             {
                     ShapelessRecipes recipe = (ShapelessRecipes)tmpRecipe;
                     recipeResult = recipe.getRecipeOutput();
             }
             if (ItemStack.areItemStacksEqual(resultItem, recipeResult))
             {
                     System.out.println("SpecialBalance Removed Recipe: " + recipes.get(scan) + " -> " + recipeResult);
                     recipes.remove(scan);
             }
    	}
    }
}
