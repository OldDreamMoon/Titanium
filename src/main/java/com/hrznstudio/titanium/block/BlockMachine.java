/*
 * This file is part of Titanium
 * Copyright (C) 2019, Horizon Studio <contact@hrznstudio.com>, All rights reserved.
 *
 * This means no, you cannot steal this code. This is licensed for sole use by Horizon Studio and its subsidiaries, you MUST be granted specific written permission by Horizon Studio to use this code, thinking you have permission IS NOT PERMISSION!
 */

package com.hrznstudio.titanium.block;

import com.hrznstudio.titanium.block.tile.TileMachine;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public abstract class BlockMachine<T extends TileMachine> extends BlockRotation<T> {
    private InventoryType inventoryType = InventoryType.DROP;
    public BlockMachine(String name, Properties properties, Class<T> tileClass) {
        super(name, properties, tileClass);
    }

    public void setType(InventoryType type) {
        this.inventoryType = type;
    }

    @Override
    public IItemProvider getItemDropped(IBlockState p_199769_1_, World p_199769_2_, BlockPos p_199769_3_, int p_199769_4_) {
        return super.getItemDropped(p_199769_1_, p_199769_2_, p_199769_3_, p_199769_4_);
    }

    public enum InventoryType {
        VOID,
        DROP,
        STORE;
    }
}
