private static int action(java.util.Scanner scan) {
    if (scan.hasNextInt())
        return scan.nextInt();
    
    scan.nextLine();
    return 0;
}