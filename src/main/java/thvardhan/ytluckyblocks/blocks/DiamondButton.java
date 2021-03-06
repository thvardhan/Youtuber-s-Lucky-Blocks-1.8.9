package thvardhan.ytluckyblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import thvardhan.ytluckyblocks.CommonProxy;

public class DiamondButton extends Block {


    public DiamondButton(String unlocalizedName, Material material, float hardness, float resistance) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(unlocalizedName);
        this.setCreativeTab(CommonProxy.tabYTStuffMod);
        this.setHardness(hardness);
        this.setResistance(resistance);
        //  this.setBlockBounds(0, 0.1F, 0.5F, 1, 0.8F, 0.6F);
        this.setLightLevel(1F);
    }

    public DiamondButton(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.ROCK, 20, 10000);
    }
    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return new AxisAlignedBB(0,0.1,0.5,1,0.8,0.6);
    }

    public DiamondButton(String unlocalizedName) {
        this(unlocalizedName, 2.0f, 10.0f);
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }
}
