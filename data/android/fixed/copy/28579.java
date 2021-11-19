public void testActiveSortNullCrash() {
    nl.mpcjanssen.simpletask.ActiveFilter f = new nl.mpcjanssen.simpletask.ActiveFilter();
    nl.mpcjanssen.simpletask.sort.MultiComparator mc = new nl.mpcjanssen.simpletask.sort.MultiComparator(f.getSort(null), true);
    assertNotNull(mc);
}