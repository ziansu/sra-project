@org.junit.Test
public void testGetCompletions1() {
    java.util.List<java.lang.String> completions = suffixTrie.getCompletions("not_there", 50);
    assertEquals(0, completions.size());
}