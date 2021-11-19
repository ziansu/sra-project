public com.wasteofplastic.districts.DistrictRegion getInDistrict(org.bukkit.Location location) {
    return grid.get(location.getWorld().getName()).getDistrictRegionAt(location);
}