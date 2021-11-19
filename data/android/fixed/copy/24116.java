protected void validateHadoopHomeWithWinutils() {
    try {
        org.pentaho.hadoop.shim.common.ShellPrevalidator.doesWinutilsFileExist();
    } catch (java.io.IOException e) {
        logger.error(org.pentaho.di.i18n.BaseMessages.getString(org.pentaho.hadoop.shim.common.CommonHadoopShim.class, "CommonHadoopShim.HadoopHomeNotSet"), e);
    }
}