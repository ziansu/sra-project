public sk.stuba.fiit.perconik.data.AnyData flatten() {
    return new sk.stuba.fiit.perconik.data.AnyData(sk.stuba.fiit.perconik.utilities.MoreMaps.flatten(this.toMap(), com.google.common.base.Joiner.on(separator)));
}