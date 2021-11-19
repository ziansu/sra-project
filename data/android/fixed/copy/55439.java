public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.String action = e.getActionCommand();
    if (action.equals("go")) {
        Person p = new Person("", buttonVal(unusual), buttonVal(oldfashioned), "");
    }
}