private boolean sidesEqualXorNull(puzzlesolver.enums.SideType s1, puzzlesolver.enums.SideType s2) {
    return ((s1 == null) || (s2 == null)) || (s1 == s2);
}