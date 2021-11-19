public java.lang.String getCurrentUserName() {
    if (isGeneratedUserName()) {
        return userName;
    }else {
        return MasterPasswordHolder.INSTANCE.generate(MPSiteType.GeneratedName, MPSiteVariant.Login, siteName, siteCounter, algorithmVersion);
    }
}