public me.gnat008.perworldinventory.groups.Group getGroup(java.lang.String group) {
    return this.groups.containsKey(group.toLowerCase()) ? this.groups.get(group.toLowerCase()) : null;
}