@java.lang.Override
public void index(org.xbib.elasticsearch.plugin.jdbc.util.IndexableObject object, boolean create) throws java.io.IOException {
    this.index = rebuild_index;
    object.index(rebuild_index);
    super.index(object, create);
}