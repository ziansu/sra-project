@java.lang.Override
public edu.cmu.tetradapp.editor.GraphWorkbench getWorkbench() {
    int selectedIndex = tabbedPane.getSelectedIndex();
    if (selectedIndex == (-1)) {
        selectedIndex = 0;
    }
    return workbenches.get(selectedIndex);
}