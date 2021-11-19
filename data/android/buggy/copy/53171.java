private void highlight(Model.Regex.Complex composite, int group) {
    for (Model.Regex.Construct construct : composite) {
        highlightConstruct(construct, group);
        highlightGroup(construct);
    }
}