package arcadia;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockAnvilArcadia extends Block
{
	@SideOnly(Side.CLIENT)
	private Icon workbenchIconTop;
	@SideOnly(Side.CLIENT)
	private Icon workbenchIconFront;
	
	public BlockAnvilArcadia(int i)
	{
	         super(i, Material.ground);
	         this.setCreativeTab(Arcadia.tabArcadiaBlocks);
	}
	
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int par1, int par2)
	{
	         return par1 == 1 ? this.workbenchIconTop : (par1 == 0 ? Block.planks.getBlockTextureFromSide(par1) : (par1 != 2 && par1 != 4 ? this.blockIcon : this.workbenchIconFront));
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon("Arcadia:anvil_side");
		this.workbenchIconTop = par1IconRegister.registerIcon("Arcadia:anvil_top");
		this.workbenchIconFront = par1IconRegister.registerIcon("Arcadia:anvil_front");
	}
	
	public boolean onBlockActivated(World var1, int var2, int var3, int var4, EntityPlayer player, int var6, float var7, float var8, float var9)
	{
         if (!player.isSneaking())
         {
		player.openGui(Arcadia.instance, 0, var1, var2, var3, var4);
		return true;
         }
		else
		{
		return false;
		}
	}
}