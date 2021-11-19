@org.junit.Test
public void isEmpty_false() {
    com.marc.collections.SkipList<java.lang.Integer> mySkipList = new com.marc.collections.SkipList(4, new java.util.Random());
    mySkipList.add(new java.lang.Integer(5));
    org.junit.Assert.assertFalse(mySkipList.isEmpty());
}