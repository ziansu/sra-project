@java.lang.Override
public java.lang.Object clone() {
    return new se.sics.kola.node.ATryWithResourcesStatement(cloneNode(this._resourceSpecification_), cloneNode(this._block_), cloneList(this._catchClause_), cloneNode(this._finally_));
}