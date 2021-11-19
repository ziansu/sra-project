public static void main(java.lang.String[] args) {
    fr.ecp.IS1220.group5.project.MyFoodoraSystemGUI myFoodoraSystemGUI = fr.ecp.IS1220.group5.project.MyFoodoraSystemGUI.getInstance();
    myFoodoraSystemGUI.loginUser("dennis", "101251");
    fr.ecp.IS1220.group5.project.GUI.managerDashboard.ManagerDashboard managerDashboard = new fr.ecp.IS1220.group5.project.GUI.managerDashboard.ManagerDashboard();
}