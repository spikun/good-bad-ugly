public static void writeToFile() {
    FileWriter fr = null;
    try {
        fr = new FileWriter("out.txt");
        fr.append("String to write file");
        fr = null;
    } catch (IOException e) {
        e.printStackTrace();
    }
    finally {
        try {
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}