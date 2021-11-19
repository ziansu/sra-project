@lombok.Synchronized
public cc.koosha.konfigurations.core.impl.InMemoryKonfiguration get() {
    this.fin = true;
    this.inMem.update();
    return this.inMem;
}