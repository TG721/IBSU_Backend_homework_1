import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        String str = readLine();
        String[] splitArray = str.split("\\s+");
        int words = 0, numbers = 0;
        for (String element: splitArray) {
            if(isNumeric(element)) numbers++;
            else words++;
        }
        System.out.println(words + " words" + " " + numbers + " numbers" );
    }
    private static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    private static String readLine() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static String readMultiLine() {
        StringBuilder wholeString= new StringBuilder();
        String line;
        boolean lineIsFirst = true;
        Scanner scanner = new Scanner(System.in);
        while(true) {
            line = scanner.nextLine();
            // If the line is blank, exit the loop
            if (line.isEmpty() ) {
                break;
            }
            if(lineIsFirst) lineIsFirst = false;
            else wholeString.append("\n");
            wholeString.append(line);
        }
        return String.valueOf(wholeString);
    }
}
