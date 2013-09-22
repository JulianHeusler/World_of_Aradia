package arcadia;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import cpw.mods.fml.common.registry.GameRegistry;

public class ArcadiaCrafting {
	
	public static void addRecipes()
    {
		//----Ores----//
		FurnaceRecipes.smelting().addSmelting(Arcadia.oreSilver.blockID, 0, new ItemStack(Arcadia.ingotSilver), 0.5F);
		FurnaceRecipes.smelting().addSmelting(Arcadia.oreCopper.blockID, 0, new ItemStack(Arcadia.ingotCopper), 0.1F);
		FurnaceRecipes.smelting().addSmelting(Arcadia.oreTin.blockID, 0, new ItemStack(Arcadia.ingotTin), 0.1F);
		FurnaceRecipes.smelting().addSmelting(Arcadia.oreLead.blockID, 0, new ItemStack(Arcadia.ingotLead), 0.1F);
		FurnaceRecipes.smelting().addSmelting(Arcadia.blankBronze.itemID, 0, new ItemStack(Arcadia.ingotBronze), 0.3F);
	    //TODO
		GameRegistry.addRecipe(new ItemStack(Arcadia.blankBronze, 1), new Object[]{
			"XX",
			"XY",
			'X' , Arcadia.ingotCopper, 'Y', Arcadia.ingotTin		});
		
		//----Oreblocks----//
		GameRegistry.addShapelessRecipe(new ItemStack(Arcadia.ingotSilver, 9), new Object[]{
			new ItemStack(Arcadia.blockSilver)		});		
		GameRegistry.addRecipe(new ItemStack(Arcadia.blockSilver), new Object[]{
			"XXX",
			"XXX",
			"XXX",
			'X' , Arcadia.ingotSilver		});
		GameRegistry.addShapelessRecipe(new ItemStack(Arcadia.ingotCopper, 9), new Object[]{
			new ItemStack(Arcadia.blockCopper)		});		
		GameRegistry.addRecipe(new ItemStack(Arcadia.blockCopper), new Object[]{
			"XXX",
			"XXX",
			"XXX",
			'X' , Arcadia.ingotCopper		});
		GameRegistry.addShapelessRecipe(new ItemStack(Arcadia.ingotTin, 9), new Object[]{
			new ItemStack(Arcadia.blockTin)		});		
		GameRegistry.addRecipe(new ItemStack(Arcadia.blockTin), new Object[]{
			"XXX",
			"XXX",
			"XXX",
			'X' , Arcadia.ingotTin		});
		GameRegistry.addShapelessRecipe(new ItemStack(Arcadia.ingotLead, 9), new Object[]{
			new ItemStack(Arcadia.blockLead)		});		
		GameRegistry.addRecipe(new ItemStack(Arcadia.blockLead), new Object[]{
			"XXX",
			"XXX",
			"XXX",
			'X' , Arcadia.ingotLead		});
		GameRegistry.addShapelessRecipe(new ItemStack(Arcadia.gemRuby, 9), new Object[]{
			new ItemStack(Arcadia.blockRuby)		});		
		GameRegistry.addRecipe(new ItemStack(Arcadia.blockRuby), new Object[]{
			"XXX",
			"XXX",
			"XXX",
			'X' , Arcadia.gemRuby		});
		GameRegistry.addShapelessRecipe(new ItemStack(Arcadia.gemSapphire, 9), new Object[]{
			new ItemStack(Arcadia.blockSapphire)		});		
		GameRegistry.addRecipe(new ItemStack(Arcadia.blockSapphire), new Object[]{
			"XXX",
			"XXX",
			"XXX",
			'X' , Arcadia.gemSapphire		});
		GameRegistry.addShapelessRecipe(new ItemStack(Arcadia.ingotBronze, 9), new Object[]{
			new ItemStack(Arcadia.blockBronze)		});		
		GameRegistry.addRecipe(new ItemStack(Arcadia.blockBronze), new Object[]{
			"XXX",
			"XXX",
			"XXX",
			'X' , Arcadia.ingotBronze		});
		
		//----Swords----//
		GameRegistry.addRecipe(new ItemStack(Arcadia.swordSilver), new Object[]{
			"X",
			"X",
			"I",
			'X' , Arcadia.ingotSilver, 'I', Item.stick		});
		GameRegistry.addRecipe(new ItemStack(Arcadia.swordBronze), new Object[]{
			"X",
			"X",
			"I",
			'X' , Arcadia.ingotBronze, 'I', Item.stick		});
		GameRegistry.addRecipe(new ItemStack(Arcadia.swordRuby), new Object[]{
			"X",
			"X",
			"I",
			'X' , Arcadia.gemRuby, 'I', Item.stick		});
		GameRegistry.addRecipe(new ItemStack(Arcadia.swordSapphire), new Object[]{
			"X",
			"X",
			"I",
			'X' , Arcadia.gemSapphire, 'I', Item.stick		});
		
		//----Pickaxe----//
		GameRegistry.addRecipe(new ItemStack(Arcadia.pickaxeSilver), new Object[]{
			"XXX",
			" I ",
			" I ",
			'X' , Arcadia.ingotSilver, 'I', Item.stick		});
		GameRegistry.addRecipe(new ItemStack(Arcadia.pickaxeBronze), new Object[]{
			"XXX",
			" I ",
			" I ",
			'X' , Arcadia.ingotBronze, 'I', Item.stick		});
		GameRegistry.addRecipe(new ItemStack(Arcadia.pickaxeRuby), new Object[]{
			"XXX",
			" I ",
			" I ",
			'X' , Arcadia.gemRuby, 'I', Item.stick		});
		GameRegistry.addRecipe(new ItemStack(Arcadia.pickaxeSapphire), new Object[]{
			"XXX",
			" I ",
			" I ",
			'X' , Arcadia.gemSapphire, 'I', Item.stick		});
		
		//----Shovel----//
		GameRegistry.addRecipe(new ItemStack(Arcadia.shovelSilver), new Object[]{
			"X",
			"I",
			"I",
			'X' , Arcadia.ingotSilver, 'I', Item.stick		});
		GameRegistry.addRecipe(new ItemStack(Arcadia.shovelBronze), new Object[]{
			"X",
			"I",
			"I",
			'X' , Arcadia.ingotBronze, 'I', Item.stick		});
		GameRegistry.addRecipe(new ItemStack(Arcadia.shovelRuby), new Object[]{
			"X",
			"I",
			"I",
			'X' , Arcadia.gemRuby, 'I', Item.stick		});
		GameRegistry.addRecipe(new ItemStack(Arcadia.shovelSapphire), new Object[]{
			"X",
			"I",
			"I",
			'X' , Arcadia.gemSapphire, 'I', Item.stick		});
		
		//----Axe----//
		GameRegistry.addRecipe(new ItemStack(Arcadia.axeSilver), new Object[]{
			"XX",
			"XI",
			" I",
			'X' , Arcadia.ingotSilver, 'I', Item.stick		});
		GameRegistry.addRecipe(new ItemStack(Arcadia.axeBronze), new Object[]{
			"XX",
			"XI",
			" I",
			'X' , Arcadia.ingotBronze, 'I', Item.stick		});
		GameRegistry.addRecipe(new ItemStack(Arcadia.axeRuby), new Object[]{
			"XX",
			"XI",
			" I",
			'X' , Arcadia.gemRuby, 'I', Item.stick		});
		GameRegistry.addRecipe(new ItemStack(Arcadia.axeSapphire), new Object[]{
			"XX",
			"XI",
			" I",
			'X' , Arcadia.gemSapphire, 'I', Item.stick		});
		
		//----Hoe----//
		GameRegistry.addRecipe(new ItemStack(Arcadia.hoeSilver), new Object[]{
			"XX",
			" I",
			" I",
			'X' , Arcadia.ingotSilver, 'I', Item.stick		});
		GameRegistry.addRecipe(new ItemStack(Arcadia.hoeBronze), new Object[]{
			"XX",
			" I",
			" I",
			'X' , Arcadia.ingotBronze, 'I', Item.stick		});
		GameRegistry.addRecipe(new ItemStack(Arcadia.hoeRuby), new Object[]{
			"XX",
			" I",
			" I",
			'X' , Arcadia.gemRuby, 'I', Item.stick		});
		GameRegistry.addRecipe(new ItemStack(Arcadia.hoeSapphire), new Object[]{
			"XX",
			" I",
			" I",
			'X' , Arcadia.gemSapphire, 'I', Item.stick		});
		
		//----Helmet----//
		GameRegistry.addRecipe(new ItemStack(Arcadia.helmetSilver), new Object[]{
			"XXX",
			"X X",
			'X' , Arcadia.ingotSilver		});
		GameRegistry.addRecipe(new ItemStack(Arcadia.helmetBronze), new Object[]{
			"XXX",
			"X X",
			'X' , Arcadia.ingotBronze		});
		GameRegistry.addRecipe(new ItemStack(Arcadia.helmetRuby), new Object[]{
			"XXX",
			"X X",
			'X' , Arcadia.gemRuby		});
		GameRegistry.addRecipe(new ItemStack(Arcadia.helmetSapphire), new Object[]{
			"XXX",
			"X X",
			'X' , Arcadia.gemSapphire		});
		
		//----Chestplate----//
		GameRegistry.addRecipe(new ItemStack(Arcadia.chestplateSilver), new Object[]{
			"X X",
			"XXX",
			"XXX",
			'X' , Arcadia.ingotSilver		});
		GameRegistry.addRecipe(new ItemStack(Arcadia.chestplateBronze), new Object[]{
			"X X",
			"XXX",
			"XXX",
			'X' , Arcadia.ingotBronze		});
		GameRegistry.addRecipe(new ItemStack(Arcadia.chestplateRuby), new Object[]{
			"X X",
			"XXX",
			"XXX",
			'X' , Arcadia.gemRuby		});
		GameRegistry.addRecipe(new ItemStack(Arcadia.chestplateSapphire), new Object[]{
			"X X",
			"XXX",
			"XXX",
			'X' , Arcadia.gemSapphire		});
		
		//----Leggings----//
		GameRegistry.addRecipe(new ItemStack(Arcadia.leggingsSilver), new Object[]{
			"XXX",
			"X X",
			"X X",
			'X' , Arcadia.ingotSilver		});
		GameRegistry.addRecipe(new ItemStack(Arcadia.leggingsBronze), new Object[]{
			"XXX",
			"X X",
			"X X",
			'X' , Arcadia.ingotBronze		});
		GameRegistry.addRecipe(new ItemStack(Arcadia.leggingsRuby), new Object[]{
			"XXX",
			"X X",
			"X X",
			'X' , Arcadia.gemRuby		});
		GameRegistry.addRecipe(new ItemStack(Arcadia.leggingsSapphire), new Object[]{
			"XXX",
			"X X",
			"X X",
			'X' , Arcadia.gemSapphire		});
		
		//----Boots----//
		GameRegistry.addRecipe(new ItemStack(Arcadia.bootsSilver), new Object[]{
			"X X",
			"X X",
			'X' , Arcadia.ingotSilver		});
		GameRegistry.addRecipe(new ItemStack(Arcadia.bootsBronze), new Object[]{
			"X X",
			"X X",
			'X' , Arcadia.ingotBronze		});
		GameRegistry.addRecipe(new ItemStack(Arcadia.bootsRuby), new Object[]{
			"X X",
			"X X",
			'X' , Arcadia.gemRuby		});
		GameRegistry.addRecipe(new ItemStack(Arcadia.bootsSapphire), new Object[]{
			"X X",
			"X X",
			'X' , Arcadia.gemSapphire		});
		
		
		GameRegistry.addRecipe(new ItemStack(Arcadia.potionHaste), new Object[] {
			"X", 'X', new ItemStack(Item.potion,1,16)
		});
		GameRegistry.addSmelting(Item.egg.itemID, new ItemStack(Arcadia.friedEgg), 0.3F);
		
    }
	/*GameRegistry.addShapelessRecipe(new ItemStack(Tutorial.tutorialBlock), new Object[]{
        new ItemStack(Item.diamond), new ItemStack(Block.stone), new ItemStack(Item.dyePowder, 1, 15)
 });

 GameRegistry.addRecipe(new ItemStack(Tutorial.tutorialBlock), new Object[]{
        "XZX",
        "CXC",
        'X', Item.ingotGold, 'C', Block.stone, 'Z', new ItemStack(Item.dyePowder, 1, 15)
 });

 ItemStack enchanted = new ItemStack(Item.pickaxeStone);
 enchanted.addEnchantment(Enchantment.sharpness, 2);

 GameRegistry.addShapelessRecipe(enchanted, new Object[]{
               new ItemStack(Item.pickaxeStone), new ItemStack(Item.flint), new ItemStack(Tutorial.tutorialBlock)
 });

 FurnaceRecipes.smelting().addSmelting(Item.beefCooked.itemID, 0, new ItemStack(Tutorial.tutorialItem), 0.1F);
}*/
}