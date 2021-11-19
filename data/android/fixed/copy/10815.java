@java.lang.Override
public void initialize(final net.meisen.dissertation.model.data.TidaModel model) {
    if (init) {
        return ;
    }
    this.metaDataCollection = new net.meisen.dissertation.impl.data.metadata.DescriptorMetaDataCollection();
    init = true;
}