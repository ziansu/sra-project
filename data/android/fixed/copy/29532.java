public void effect() {
    second = ((hu.elte.txtuml.examples.clock.model.signals.HandValue) (getSignal())).value;
    if ((second) > 0) {
        refresh();
    }
}