public void promoteAll(java.util.List<DPD.Model.CNode> list) {
    ++(maxPromotion);
    for (DPD.Model.CNode c : list) {
        DPD.Model.CNode in = getByClassId(c.classId);
        in.score += 1;
    }
}