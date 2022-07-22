public static void writeToFile() {
    try(FileWriter fr = new FileWriter("out.txt")) {
        fr.append("String to write file");
    }
    catch (IOException e) {
        e.printStackTrace();
    }
}