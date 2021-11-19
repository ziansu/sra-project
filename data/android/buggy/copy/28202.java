public void AddMinions(Pieces p) {
    if ((((GetMinionCount(Colors.None)) + (GetDemonCount())) + (GetTrollCount())) > 1) {
        AddTroubleMaker(p);
    }
    ListMinions.add(p);
}