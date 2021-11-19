@java.lang.Override
protected hivemall.fm.FFMStringFeatureMapModel initModel(@javax.annotation.Nullable
org.apache.commons.cli.CommandLine cl, @javax.annotation.Nonnull
hivemall.fm.FMHyperParameters params) throws org.apache.hadoop.hive.ql.exec.UDFArgumentException {
    hivemall.fm.FMHyperParameters.FFMHyperParameters ffmParams = ((hivemall.fm.FMHyperParameters.FFMHyperParameters) (params));
    hivemall.fm.FFMStringFeatureMapModel model = new hivemall.fm.FFMStringFeatureMapModel(ffmParams);
    this._ffmModel = model;
    return model;
}