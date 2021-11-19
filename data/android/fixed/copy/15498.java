public boolean DeleteBoat() {
    java.lang.System.out.println(list.get(setMember).getName());
    java.lang.System.out.println(setBoat);
    list.get(setMember).boats.remove(setBoat);
    return true;
}