public class mystery {
    public static void main(String[] args) {
        String initial = "programming is easy";
        String replacementString = "";
        String spacer;

        // Removes any spaces in the string
        for(int i = 0; i < initial.length(); i++){
            if(!initial.substring(i, i+1).equals(" ")){
                replacementString += initial.substring(i, i + 1);
            }
        }

        initial = replacementString;
        replacementString = "";

        // Capitalizes every other character
        for (int i = 1; i <= initial.length(); i++) {
            spacer = initial.substring(i - 1, i);
            if (i % 2 == 0) {
                spacer = spacer.toUpperCase();
            } else {
                spacer = spacer.toLowerCase();
            }
            replacementString += spacer + " ";
        }

        initial = replacementString;
        replacementString = "";

        System.out.println(initial);

        // Removes every other character till the entire string is gone
        while (initial.length() > 1) {
            for (int j = 0; j < initial.length(); j+=2) {
                replacementString += initial.substring(j, j + 1);
            }
            initial = replacementString;
            replacementString = "";
            System.out.println(initial);
        }
    }
}

