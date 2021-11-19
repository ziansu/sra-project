public com.spinn3r.artemis.init.Initializer build() {
    return new com.spinn3r.artemis.init.Initializer(product, role, caller, java.util.Optional.of(configLoader));
}