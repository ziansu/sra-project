public static java.lang.String genPmmlColumnName(java.lang.String columnName, ml.shifu.shifu.container.obj.ModelNormalizeConf.NormType normType) {
    return (columnName + "_") + (normType.name().toLowerCase());
}