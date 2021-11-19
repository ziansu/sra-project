public static int get(final java.lang.String key) {
    if (!(com.ninetwozero.bf4intel.resources.maps.weapons.WeaponImageMap.map.containsKey(key)))
        android.util.Log.e("WeaponImageMap", key);
    
    return com.ninetwozero.bf4intel.resources.maps.weapons.WeaponImageMap.map.containsKey(key) ? com.ninetwozero.bf4intel.resources.maps.weapons.WeaponImageMap.map.get(key) : R.drawable.acc_none;
}