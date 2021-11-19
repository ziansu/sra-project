public void testSubtypeRules(@FullIntRange
int fr, @IntRange(from = 0, to = 255)
int ir, @IntRange
int mir, @IntRange(from = 255, to = 0)
int eir, int dir) {
    @IntRange(from = 201, to = 200)
    int j = eir;
}