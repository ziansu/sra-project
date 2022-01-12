@java.lang.Override
public com.google.common.base.Optional<com.github.rinde.rinsim.core.model.pdp.Parcel> current() {
    return com.google.common.base.Optional.fromNullable(route.peek());
}