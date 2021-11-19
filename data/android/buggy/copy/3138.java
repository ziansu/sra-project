@net.mostlyoriginal.api.event.dispatcher.Benchmark
public void eventWithNoHierarchyAndOneHandler() {
    em.dispatch(new net.mostlyoriginal.api.event.dispatcher.DispatcherBenchmark.EventNest0());
}