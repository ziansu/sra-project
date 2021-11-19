public static void addOpenedFile(org.nschmidt.ldparteditor.data.DatFile file) {
    if (!(org.nschmidt.ldparteditor.project.Project.openedFiles.contains(file))) {
        org.nschmidt.ldparteditor.project.Project.openedFiles.add(file);
    }else {
        org.nschmidt.ldparteditor.project.Project.openedFiles.remove(file);
        org.nschmidt.ldparteditor.project.Project.openedFiles.add(0, file);
    }
}