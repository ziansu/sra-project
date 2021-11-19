public com.netbout.spi.Alias randomAlias() throws java.io.IOException {
    return this.alias(java.lang.String.format("alias%d", com.netbout.mock.MkBase.RANDOM.nextInt(java.lang.Integer.MAX_VALUE)));
}