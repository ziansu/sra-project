public void actionPerformed(java.awt.event.ActionEvent arg0) {
    our.Utils.BulidSpec.build();
    Controller.WorkSpaceController.createSpecGUI();
    Controller.VerificationController verificationController = new Controller.VerificationController();
    Controller.FormulaTranslate.translateReq1();
    Controller.FormulaTranslate.translateReq2a();
}