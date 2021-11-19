private org.w3c.dom.Node getRandomnessForElement(org.w3c.dom.NodeList nodeList) {
    int randomNr = (randomness) ? rand.nextInt(nodeList.getLength()) : 0;
    java.lang.System.out.println((" *** " + randomNr));
    return nodeList.item(randomNr);
}