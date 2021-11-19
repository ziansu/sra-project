@java.lang.Override
public void init() {
    kw.setNavContainer(this.new StubNavigationContainerStatic());
    kw.setFactory(new org.spo.fw.meta.fixture.StubPageFactoryImpl());
    kw.setNavModel(new org.spo.fw.meta.fixture.runner.SimpleScriptStubStatic.StubNavModelStatic());
    super.init();
}