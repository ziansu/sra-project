public void AddMinions(Pieces p) {
    if ((((GetMinionCount(Colors.None)) + (GetDemonCount())) + (GetTrollCount())) > 0) {
        AddTroubleMaker(p);
    }
    ListMinions.add(p);
}