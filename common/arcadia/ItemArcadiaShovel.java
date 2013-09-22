package arcadia;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSpade;

public class ItemArcadiaShovel extends ItemSpade{

	public ItemArcadiaShovel(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		this.setCreativeTab(Arcadia.tabArcadiaItems);
		
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
	    this.itemIcon = par1IconRegister.registerIcon(Arcadia.modid + ":" + (this.getUnlocalizedName().substring(5)));

	}
}
