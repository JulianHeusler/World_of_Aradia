package arcadia;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.ICraftingHandler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.ICraftingHandler;

public class CraftingHandler implements ICraftingHandler
{
	
	@Override
	public void onCrafting(EntityPlayer player, ItemStack item, IInventory craftMatrix)
	{
		/*if (item.itemID == Item.appleGold.itemID)
		{
			player.addStat(AchievementMod.Tutorial, 1);
			}*/

	}
	
	@Override
	public void onSmelting(EntityPlayer player, ItemStack item)
	{
		/*if (item.itemID == Item.ingotGold.itemID)
		{
			player.addStat(AchievementMod.Tutorial, 1);
			}*/
	}
}