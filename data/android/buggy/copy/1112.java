public boolean isBadWeather() {
    return (weatherAffectsDrift) && ((worldObj.isRaining()) || (worldObj.isThundering()));
}