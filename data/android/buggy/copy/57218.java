@org.junit.Test
public void pixelWiseTestThreadedMapperII() {
    ops.run(net.imagej.ops.map.MapIterableIntervalToIterableIntervalParallel.class, out, in, addConstant, out);
}