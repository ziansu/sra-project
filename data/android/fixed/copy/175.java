@org.junit.Test
public void decompressorRegistry_normal() {
    io.grpc.DecompressorRegistry decompressorRegistry = io.grpc.DecompressorRegistry.emptyInstance();
    assertNotEquals(decompressorRegistry, builder.decompressorRegistry);
    org.junit.Assert.assertEquals(builder, builder.decompressorRegistry(decompressorRegistry));
    org.junit.Assert.assertEquals(decompressorRegistry, builder.decompressorRegistry);
}