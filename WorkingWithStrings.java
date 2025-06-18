public class StringLab {
    public static void main(String[] args) {
        // Step 1: Create the String
        String str = " Welcome to the Java String Lab! ";

        // Step 2: length()
        System.out.println("Length: " + str.length());

        // Step 3: charAt()
        System.out.println("Character at index 7: " + str.charAt(7));

        // Step 4: substring()
        String sub = str.substring(15, 19); // "Java" starts at index 15 and ends before index 19
        System.out.println("Substring 'Java': " + sub);

        // Step 5: toUpperCase() and toLowerCase()
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());

        // Step 6: indexOf()
        System.out.println("Index of 'Java': " + str.indexOf("Java"));

        // Step 7: contains()
        System.out.println("Contains 'Lab': " + str.contains("Lab"));

        // Step 8: replace()
        String replaced = str.replace("Java", "Java Programming");
        System.out.println("Replaced String: " + replaced);

        // Step 9: split() and for loop
        String[] words = str.split(" ");
        System.out.println("Splitting the string by spaces:");
        for (String word : words) {
            if (!word.isEmpty()) { // Skip empty strings caused by leading spaces
                System.out.println(word);
            }
        }

        // Step 10: trim()
        String trimmed = str.trim();
        System.out.println("Trimmed String: '" + trimmed + "'");

        // Step 11: equals() and equalsIgnoreCase()
        String compareStr = "java string lab!";
        System.out.println("Equals 'java string lab!': " + str.equals(compareStr));
        System.out.println("EqualsIgnoreCase 'java string lab!': " + str.trim().equalsIgnoreC(compareStr));
    }
}
