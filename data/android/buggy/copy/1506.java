@java.lang.Override
public java.util.ArrayList<com.lab.flickr.network.Loader> createLoaders() {
    java.util.ArrayList<com.lab.flickr.network.Loader> loaders = new java.util.ArrayList<>();
    loaders.add(new com.lab.flickr.network.JsonLoader());
    return loaders;
}