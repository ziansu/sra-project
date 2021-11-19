@org.jetbrains.annotations.NotNull
public static java.lang.String getNodeTypeFolderPath(com.intellij.psi.PsiElement element, java.lang.String namespace, java.lang.String nodeTypeName) {
    return fr.tolc.jahia.intellij.plugin.cnd.utils.CndProjectFilesUtil.getNodeTypeFolderPath(fr.tolc.jahia.intellij.plugin.cnd.utils.CndProjectFilesUtil.getJahiaWorkFolderPath(element), namespace, nodeTypeName);
}