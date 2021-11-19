@java.lang.Override
public com.thoughtworks.go.config.ConfigOrigin getOrigin() {
    com.thoughtworks.go.config.merge.MergeConfigOrigin origins = new com.thoughtworks.go.config.merge.MergeConfigOrigin(new com.thoughtworks.go.config.FileConfigOrigin());
    for (com.thoughtworks.go.config.PartialConfig part : this.parts) {
        origins.add(part.getOrigin());
    }
    return origins;
}