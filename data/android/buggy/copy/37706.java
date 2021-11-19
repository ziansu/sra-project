public void modify() {
    int id = getParaToInt("id");
    com.linpeng.advisor.model.DictionaryKind dictionaryKind = DictionaryKind.dao.findById(id);
    setAttr("dictionarykind", dictionaryKind);
    render("create.html");
}