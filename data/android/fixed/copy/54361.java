@assignment4.Test
public void testValidateResult4() throws assignment4.NoSuchLadderException {
    assignment4.WordLadderSolver wordLadderSolver = new assignment4.WordLadderSolver();
    java.util.List<java.lang.String> result = wordLadderSolver.computeLadder("atl", "zbsra");
    assertEquals(true, wordLadderSolver.validateResult("atl", "zbsra", result));
}