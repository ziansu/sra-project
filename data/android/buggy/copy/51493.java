private static com.sevendragons.hashcode2016.qualification.Qualification.Product parseProductType(java.util.Scanner scanner, int id) {
    com.sevendragons.hashcode2016.qualification.Qualification.Product product = new com.sevendragons.hashcode2016.qualification.Qualification.Product(id, scanner.nextInt());
    scanner.nextLine();
    return product;
}