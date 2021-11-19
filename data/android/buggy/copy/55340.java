@org.junit.Test
public void testDestroy() {
    main.run(new java.lang.String[]{ "destroy" });
    org.mockito.Mockito.verify(commandDestroy).execute();
}