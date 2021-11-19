@java.lang.Override
public java.lang.String adjustMapAddress(java.lang.String sAddress) {
    sAddress = sAddress.replace("EGG AND BUTTER", "EGG_AND_BUTTER");
    sAddress = net.anei.cadpage.parsers.AL.ALShelbyCountyParser.CLFS_PTN.matcher(sAddress).replaceAll("CLIFFS");
    return super.adjustMapAddress(sAddress);
}