package com.boydti.fawe.regions;

import com.sk89q.worldedit.entity.Player;
import com.sk89q.worldedit.math.BlockVector3;
import com.sk89q.worldedit.regions.CuboidRegion;
import com.sk89q.worldedit.regions.IDelegateRegion;
import com.sk89q.worldedit.regions.Region;

public class FaweMask implements IDelegateRegion {
    private final Region region;

    public FaweMask(Region region) {
        this.region = region;
    }

    @Override
    public Region getRegion() {
        return region;
    }

    public boolean isValid(Player player, FaweMaskManager.MaskType type) {
        return false;
    }

    @Override
    public Region clone() {
        throw new UnsupportedOperationException("Clone not supported");
    }
}
