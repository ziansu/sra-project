public void resetLisenceNum(int newNum) {
    LisenceClass.UsedService = 0;
    LisenceClass.TotalService = newNum;
    java.lang.System.out.println(("Lisence number changed to: " + newNum));
    java.lang.System.out.println("Used lisence number has reset to 0");
}