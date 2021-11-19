@org.junit.Before
public final void setUp() {
    if (!(io.oasp.module.test.common.base.BaseTest.INITIALIZED)) {
        io.oasp.module.test.common.base.BaseTest.INITIALIZED = true;
    }
    doSetUp(io.oasp.module.test.common.base.BaseTest.INITIALIZED);
}