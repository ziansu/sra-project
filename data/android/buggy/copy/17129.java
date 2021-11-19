@org.junit.Before
public void setUp() {
    this.context = org.zeromq.ContextFactory.createContext(1);
}