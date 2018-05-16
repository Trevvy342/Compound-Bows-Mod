package com.Trevvy342.CompoundBowMod.items;

import com.Trevvy342.CompoundBowMod.Main;
import com.Trevvy342.CompoundBowMod.init.ModItems;
import com.Trevvy342.CompoundBowMod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{

	public ItemBase(String name)
	{
	
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
		ModItems.ITEMS.add(this);
		
	}
	
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this,0, "inventory");
	}

}
