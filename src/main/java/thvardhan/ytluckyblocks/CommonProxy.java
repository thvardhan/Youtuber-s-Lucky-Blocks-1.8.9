package thvardhan.ytluckyblocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import thvardhan.ytluckyblocks.blocks.ModBlocks;
import thvardhan.ytluckyblocks.items.ModItems;


public class CommonProxy {

    public static CreativeTabs tabYTStuffMod = new TabYTStuffMod(CreativeTabs.getNextID(), "YTSuffMod");
    public static CreativeTabs tabYtStuffArmor = new TabYTStuffArmor(CreativeTabs.getNextID(), "YTStuffArmor");

    public void preInit(FMLPreInitializationEvent e) {
        ModBlocks.createBlocks();
        ModItems.createTools();

    }

    public void init(FMLInitializationEvent e) {
        //		registerRecipes();
        //FMLCommonHandler.instance().bus().register(new YTEventHandler());

    }

    public void postInit(FMLPostInitializationEvent e) {

    }

    public void registerRecipes() {
      /*
            GameRegistry.addRecipe(new ItemStack(ModBlocks.youtubeLuckyBlock), "AAA","AXA","AAA",'A',Items.EGG,'X',Items.iron_ingot);
	    	GameRegistry.addRecipe(new ItemStack(ModBlocks.serialPlayerLuckyBlock), "AAA","AXA","AAA",'A',Items.REDSTONE,'X',Items.iron_ingot);
	    	GameRegistry.addRecipe(new ItemStack(ModBlocks.popularMMOLuckyBlock), "AAA","AXA","AAA",'A',Blocks.OBSIDIAN,'X',Items.iron_ingot);
	    	GameRegistry.addRecipe(new ItemStack(ModBlocks.antVenomLuckyBlock), "AAA","AXA","AAA",'A',Items.coal,'X',Items.iron_ingot);
	    	GameRegistry.addRecipe(new ItemStack(ModBlocks.captainSparkelzLuckyBlock), "AAA","AXA","AAA",'A',Items.BLAZE_POWDER,'X',Items.iron_ingot);
	    	GameRegistry.addRecipe(new ItemStack(ModBlocks.skyDoesMinecraftLuckyBlock), "AAA","AXA","AAA",'A',Items.GOLD_INGOT,'X',Items.iron_ingot);
	    	GameRegistry.addRecipe(new ItemStack(ModBlocks.danTDMLuckyBlock), "AAA","AXA","AAA",'A',Items.DIAMOND,'X',Items.iron_ingot);
	    	GameRegistry.addRecipe(new ItemStack(ModBlocks.iBallisticSquidLuckyBlock), "AAA","AXA","AAA",'A',new ItemStack(Items.DYE,1,0),'X',Items.iron_ingot);
	    	GameRegistry.addRecipe(new ItemStack(ModBlocks.gamingWithJenLuckyBlock), "AAA","AXA","AAA",'A',Items.nether_wart,'X',Items.iron_ingot);
	    	GameRegistry.addRecipe(new ItemStack(ModBlocks.trueMuLuckyBlock), "AAA","AXA","AAA",'A',Blocks.lapis_block,'X',Items.iron_ingot);
	    	GameRegistry.addRecipe(new ItemStack(ModBlocks.alexircraftLuckyBlock), "AAA","AXA","AAA",'A',Items.sugar,'X',Items.iron_ingot);
	    	GameRegistry.addRecipe(new ItemStack(ModBlocks.bajanCanadianLuckyBlock), "AAA","AXA","AAA",'A',Blocks.REDSTONE_BLOCK,'X',Items.iron_ingot);
	    	GameRegistry.addRecipe(new ItemStack(ModBlocks.frizzleandpopLuckyBlock), "AAA","AXA","AAA",'A',Blocks.sand,'X',Items.iron_ingot);
	    	GameRegistry.addRecipe(new ItemStack(ModBlocks.jeromeASFLuckyBlock), "AAA","AXA","AAA",'A',Items.BOWl,'X',Items.iron_ingot);
	    	GameRegistry.addRecipe(new ItemStack(ModBlocks.tewityLuckyBlock), "AAA","AXA","AAA",'A',Blocks.PUMPKIN,'X',Items.iron_ingot);
	    	GameRegistry.addRecipe(new ItemStack(ModBlocks.iHasCupcakeLuckyBlock), "AAA","AXA","AAA",'A',Blocks.cactus,'X',Items.iron_ingot);
	    	GameRegistry.addRecipe(new ItemStack(ModBlocks.lDShadowLadyLuckyBlock), "AAA","AXA","AAA",'A',Blocks.packed_ice,'X',Items.iron_ingot);
	    	GameRegistry.addRecipe(new ItemStack(ModBlocks.prestonPlayzLuckyBlock), "AAA","AXA","AAA",'A',Items.lava_bucket,'X',Items.iron_ingot);
	    	GameRegistry.addRecipe(new ItemStack(ModBlocks.sSundeeLuckyBlock), "AAA","AXA","AAA",'A',Blocks.COAL_BLOCK,'X',Items.iron_ingot);
	    	GameRegistry.addRecipe(new ItemStack(ModBlocks.stampylongheadLuckyBlock), "AAA","AXA","AAA",'A',Items.pumpkin_seeds,'X',Items.iron_ingot);
	    	GameRegistry.addRecipe(new ItemStack(ModBlocks.thnxCyaLuckyBlock), "AAA","AXA","AAA",'A',Items.EMERALD,'X',Items.iron_ingot);
	    	GameRegistry.addRecipe(new ItemStack(ModBlocks.exploadingTNTLuckyBlock), "AAA","AXA","AAA",'A',Blocks.TNT,'X',Items.iron_ingot);
	    	GameRegistry.addRecipe(new ItemStack(ModBlocks.lachlanLuckyBlock), "AAA","AXA","AAA",'A',new ItemStack(Items.DYE,1,4),'X',Items.iron_ingot);
	    	GameRegistry.addRecipe(new ItemStack(ModBlocks.mrwooflessLuckyBlock), "AAA","AXA","AAA",'A',Items.ARROW,'X',Items.iron_ingot);
	    	GameRegistry.addRecipe(new ItemStack(ModBlocks.petaZahHuttLuckyBlock), "AAA","AXA","AAA",'A',Items.slime_ball,'X',Items.iron_ingot);
	    	GameRegistry.addRecipe(new ItemStack(ModBlocks.pinkSheepYTLuckyBlock), "AAA","AXA","AAA",'A',new ItemStack(Blocks.wool,1,6),'X',Items.iron_ingot);
	    	GameRegistry.addRecipe(new ItemStack(ModBlocks.vikkstar123LuckyBlock), "AAA","AXA","AAA",'A',Items.feather,'X',Items.iron_ingot);
	    	
	    	*/

    }


}