package com.bewitchment.common.block;

import com.bewitchment.Bewitchment;
import com.bewitchment.common.CommonProxy.ModGui;
import com.bewitchment.common.block.tile.entity.TileEntityDistillery;
import com.bewitchment.common.block.util.ModBlockContainer;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@SuppressWarnings({"deprecation", "NullableProblems"})
public class BlockDistillery extends ModBlockContainer {
	public BlockDistillery() {
		super(Bewitchment.instance, "distillery", Material.IRON, SoundType.METAL, 5, 30, "pickaxe", 0, ModGui.DISTILLERY.ordinal());
		setDefaultState(blockState.getBaseState().withProperty(BlockHorizontal.FACING, EnumFacing.SOUTH));
	}
	
	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		return new TileEntityDistillery();
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta) {
		return getDefaultState().withProperty(BlockHorizontal.FACING, EnumFacing.HORIZONTALS[meta]);
	}
	
	@Override
	public int getMetaFromState(IBlockState state) {
		return state.getValue(BlockHorizontal.FACING).getHorizontalIndex();
	}
	
	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, BlockHorizontal.FACING);
	}
	
	@Override
	public IBlockState getStateForPlacement(World world, BlockPos pos, EnumFacing face, float hitX, float hitY, float hitZ, int meta, EntityLivingBase living, EnumHand hand) {
		return getDefaultState().withProperty(BlockHorizontal.FACING, EnumFacing.fromAngle(living.rotationYaw));
	}
}