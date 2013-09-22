package arcadia;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockArcadia extends Block {

	public BlockArcadia(int par1, Material par2Material) {
		super(par1, par2Material);
		this.setCreativeTab(Arcadia.tabArcadiaBlocks);
	}

	public int idDropped(int par1, Random par2Random, int par3)
    {
        return this.blockID == new ItemStack(Arcadia.oreRuby).itemID ? new ItemStack(Arcadia.gemRuby).itemID : 
        	(this.blockID == new ItemStack(Arcadia.oreSapphire).itemID ? new ItemStack(Arcadia.gemSapphire).itemID : this.blockID);
    }
		
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	    {
	        this.blockIcon = par1IconRegister.registerIcon(Arcadia.modid + ":" + (this.getUnlocalizedName().substring(5)));
	    }
}
