@java.lang.Override
public void onClick(android.view.View v) {
    if ((com.jialin.chat.MessageInputToolBox.faceLayout.getVisibility()) == (VISIBLE)) {
        com.jialin.chat.MessageInputToolBox.showKeyboard(context);
        hideFaceLayout();
    }else {
        showFaceLayout();
    }
}