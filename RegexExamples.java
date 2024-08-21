import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExamples {

    public static void main(String[] args) {
        
        // 1. Literal Matching
        literalExample();
        
        // 2. Metacharacters
        metacharacterExample();
        
        // 3. Quantifiers
        quantifierExample();
        
        // 4. Character Classes
        characterClassExample();
        
        // 5. Anchors
        anchorExample();
        
        // 6. Groups and Capturing
        groupExample();
        
        // 7. Lookahead and Lookbehind
        lookaheadLookbehindExample();
        
        // 8. A practical example: Validate an Email
        emailValidationExample("example@domain.com");
        emailValidationExample("invalid-email.com");
        
        // 9. A practical example: Extracting Domain from an Email Address
        extractDomainExample("user@example.com");
    }
    
    // 1. Literal Matching
    public static void literalExample() {
        System.out.println("1. Literal Matching:");
        String pattern = "cat";
        String text = "The cat sat on the mat.";
        
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        
        while (m.find()) {
            System.out.println("Found '" + m.group() + "' at index " + m.start());
        }
        System.out.println();
    }
    
    // 2. Metacharacters
    public static void metacharacterExample() {
        System.out.println("2. Metacharacters:");
        String pattern = "c.t";
        String text = "cat cot cut cit";
        
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        
        while (m.find()) {
            System.out.println("Found '" + m.group() + "' at index " + m.start());
        }
        System.out.println();
    }
    
    // 3. Quantifiers
    public static void quantifierExample() {
        System.out.println("3. Quantifiers:");
        String pattern = "a{2,3}";
        String text = "aaa a aa aaaa";
        
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        
        while (m.find()) {
            System.out.println("Found '" + m.group() + "' at index " + m.start());
        }
        System.out.println();
    }
    
    // 4. Character Classes
    public static void characterClassExample() {
        System.out.println("4. Character Classes:");
        String pattern = "[aeiou]";
        String text = "hello world";
        
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        
        while (m.find()) {
            System.out.println("Found vowel '" + m.group() + "' at index " + m.start());
        }
        System.out.println();
    }
    
    // 5. Anchors
    public static void anchorExample() {
        System.out.println("5. Anchors:");
        String pattern = "^The";
        String text = "The quick brown fox jumps over the lazy dog.";
        
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        
        if (m.find()) {
            System.out.println("Found the start of the string: '" + m.group() + "'");
        } else {
            System.out.println("Pattern not found at the start of the string.");
        }
        System.out.println();
    }
    
    // 6. Groups and Capturing
    public static void groupExample() {
        System.out.println("6. Groups and Capturing:");
        String pattern = "(\\d{3})-(\\d{2})-(\\d{4})";
        String text = "My SSN is 123-45-6789.";
        
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        
        if (m.find()) {
            System.out.println("Full Match: " + m.group(0));
            System.out.println("Group 1 (Area Number): " + m.group(1));
            System.out.println("Group 2 (Group Number): " + m.group(2));
            System.out.println("Group 3 (Serial Number): " + m.group(3));
        }
        System.out.println();
    }
    
    // 7. Lookahead and Lookbehind
    public static void lookaheadLookbehindExample() {
        System.out.println("7. Lookahead and Lookbehind:");
        String pattern = "(?<=\\$)\\d+(?=\\s)";
        String text = "The total cost is $30 for the item.";
        
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        
        while (m.find()) {
            System.out.println("Found price: " + m.group());
        }
        System.out.println();
    }
    
    // 8. A Practical Example: Validate an Email
    public static void emailValidationExample(String email) {
        System.out.println("8. Email Validation:");
        String pattern = "^[\\w.%+-]+@[\\w.-]+\\.[A-Za-z]{2,6}$";
        
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(email);
        
        if (m.matches()) {
            System.out.println("Valid email: " + email);
        } else {
            System.out.println("Invalid email: " + email);
        }
        System.out.println();
    }
    
    // 9. A Practical Example: Extracting Domain from an Email Address
    public static void extractDomainExample(String email) {
        System.out.println("9. Extracting Domain:");
        String pattern = "@([\\w.-]+)";
        
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(email);
        
        if (m.find()) {
            System.out.println("Domain extracted: " + m.group(1));
        } else {
            System.out.println("Domain not found in the email: " + email);
        }
        System.out.println();
    }
}
