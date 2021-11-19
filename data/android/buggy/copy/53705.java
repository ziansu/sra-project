private static void afterRead(com.github.zxh.classpy.classfile.ClassComponent cc, com.github.zxh.classpy.classfile.constant.ConstantPool cp) {
    cc.afterRead(cp);
    for (com.github.zxh.classpy.classfile.ClassComponent c : cc.getSubComponents()) {
        com.github.zxh.classpy.classfile.ClassParser.afterRead(c, cp);
    }
}