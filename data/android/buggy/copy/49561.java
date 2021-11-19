@java.lang.Override
public void onCheckChanged(int position, boolean value) {
    ((org.wizbots.labtab.model.program.Student) (objectArrayList.get(position))).setCheck(value);
}