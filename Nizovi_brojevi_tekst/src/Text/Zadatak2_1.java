package Text;

public class Zadatak2_1 {
    public static void main(String[] args) {
        String[] files =
                {"picture1.jpg",
                        "text1,txt",
                        "picture2.png",
                        "text2.doc",
                        "picture3.gif"};

        String[] permitedExtensions = {"jpg", "gif", "png"};
        for (int i = 0; i < files.length; i++) {
            String fileExt = files[i].split("\\.")[1]; //ovom naredbom dobijamo extenziju i spremamo je u varijablu fileExt
            for (int u = 0; u < permitedExtensions.length; u++) {
                if (permitedExtensions[u].equals(fileExt))
                    System.out.println("File: " + files[i] + " of type " + fileExt);
            }
        }
    }
}
