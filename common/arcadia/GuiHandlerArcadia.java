package arcadia;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandlerArcadia implements IGuiHandler
{
	@Override
	public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
	{
	TileEntity tile_entity = world.getBlockTileEntity(x, y, z);
	switch(id)
	{
		case 0: return id == 0 && world.getBlockId(x, y, z) == Arcadia.anvilArcadia.blockID ? new ContainerAnvilArcadia(player.inventory, world, x, y, z) : null;
		case 1: return id == Arcadia.ItemInventoryGuiIndex ? new ContainerBagArcadia(player, player.inventory, new InventoryBagArcadia(player.getHeldItem())) : null;	
	}
	return null;
	}
	@Override
	public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
	{
	TileEntity tile_entity = world.getBlockTileEntity(x, y, z);
	switch(id)
	{
		case 0: return id == 0 && world.getBlockId(x, y, z) == Arcadia.anvilArcadia.blockID ? new GuiAnvilArcadia(player.inventory, world, x, y, z) : null;
		case 1: return id == Arcadia.ItemInventoryGuiIndex ? new GuiBagArcadia((ContainerBagArcadia) new ContainerBagArcadia(player, player.inventory, new InventoryBagArcadia(player.getHeldItem()))) : null;		
	}
	return null;
	}
}