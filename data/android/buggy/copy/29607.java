@org.junit.After
public final void tearDownSessionsResourceTest() {
    ch.protonmail.vladyslavbond.eurobug.domain.AccountFactory accountFactory = ch.protonmail.vladyslavbond.eurobug.domain.Factories.<ch.protonmail.vladyslavbond.eurobug.domain.AccountFactory>getInstance(ch.protonmail.vladyslavbond.eurobug.domain.AccountFactory.class);
    accountFactory.destroy(ch.protonmail.vladyslavbond.eurobug.utils.NumericIdentificator.<ch.protonmail.vladyslavbond.eurobug.domain.Account>valueOf(12367864038L));
}