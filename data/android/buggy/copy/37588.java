@org.junit.Test
public void isEmpty_true() {
    com.marc.collections.SkipList<java.lang.Integer> mySkipList = new com.marc.collections.SkipList(4, new java.util.Random());
    org.junit.Assert.assertTrue(mySkipList.isEmpty());
}