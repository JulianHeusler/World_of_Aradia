package arcadia;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemArcadiaArmor extends ItemArmor{

    public ItemArcadiaArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4)
    {
        super(par1, par2EnumArmorMaterial, par3, par4);
        this.setCreativeTab(Arcadia.tabArcadiaItems);        
    }
    
    @SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
	    this.itemIcon = par1IconRegister.registerIcon(Arcadia.modid + ":" + (this.getUnlocalizedName().substring(5)));
	}
    
    public String getArmorTexture(ItemStack par1, Entity enity, int slot, int layer){
    	if(par1.itemID == Arcadia.helmetSilver.itemID || par1.itemID == Arcadia.chestplateSilver.itemID || par1.itemID == Arcadia.bootsSilver.itemID){
    		return "arcadia:textures/models/armor/silver_1.png";
    		}
    	else if(par1.itemID == Arcadia.leggingsSilver.itemID){
    		return "arcadia:textures/models/armor/silver_2.png";
    		}
    	if(par1.itemID == Arcadia.helmetBronze.itemID || par1.itemID == Arcadia.chestplateBronze.itemID || par1.itemID == Arcadia.bootsBronze.itemID){
    		return "arcadia:textures/models/armor/bronze_1.png";
    		}
    	else if(par1.itemID == Arcadia.leggingsBronze.itemID){
    		return "arcadia:textures/models/armor/bronze_2.png";
    		}
    	if(par1.itemID == Arcadia.helmetRuby.itemID || par1.itemID == Arcadia.chestplateRuby.itemID || par1.itemID == Arcadia.bootsRuby.itemID){
    		return "arcadia:textures/models/armor/ruby_1.png";
    		}
    	else if(par1.itemID == Arcadia.leggingsRuby.itemID){
    		return "arcadia:textures/models/armor/ruby_2.png";
    		}
    	if(par1.itemID == Arcadia.helmetSapphire.itemID || par1.itemID == Arcadia.chestplateSapphire.itemID || par1.itemID == Arcadia.bootsSapphire.itemID){
    		return "arcadia:textures/models/armor/sapphire_1.png";
    		}
    	else if(par1.itemID == Arcadia.leggingsSapphire.itemID){
    		return "arcadia:textures/models/armor/sapphire_2.png";
    		}
    	else{
    		return "arcadia:textures/models/armor/silver_1.png";
    	}
    }
}