void removeFromList(int index) {
    if (index == (-1))
        return ;
    
    org.sbml.jsbml.SBase id = memberList.get(index);
    list.remove(id);
    memberList.remove(index);
}