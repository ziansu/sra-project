public void Refresh(EnumCoinTypes type) {
    for (int indexSite = 0; indexSite < (SiteTypeAvailable); ++indexSite) {
        SiteApis[indexSite].Refresh(type);
    }
}