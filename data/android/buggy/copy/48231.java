@org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
public void updateText(edu.chl.proton.event.TextUpdateEvent event) {
    edu.chl.proton.control.MarkdownTabController.document.getText();
    edu.chl.proton.control.MarkdownTabController.document.getHTML();
    java.lang.System.out.println("JAG ANVÄNDS!!!!");
}