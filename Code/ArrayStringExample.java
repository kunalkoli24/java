public class ArrayStringExample {
    public static void main(String[] args) {
       
        int[] numbers = {1, 2, 3, 4, 5}; 
        String[] names = {"rugved ", "ved", "Rohit"};
       
        System.out.println("First number: " + numbers[0]);
        System.out.println("Second name: " + names[1]);

        
        numbers[2] = 10;
        names[0] = "Alex";

        
        System.out.println("Length of numbers array: " + numbers.length);
        System.out.println("Length of names array: " + names.length);

       
        System.out.println("Numbers array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("Names array elements:");
        for (String name : names) {
            System.out.println(name);
        }

        
        String greeting = "Hello, World!";

        
        int length = greeting.length();
        System.out.println("Length of the greeting string: " + length);

        
        char firstChar = greeting.charAt(0);
        System.out.println("First character of the greeting: " + firstChar);

       
        String substring = greeting.substring(7, 12);
        System.out.println("Substring: " + substring);

       
        String newString = greeting + " Welcome!";
        System.out.println("Concatenated string: " + newString);
    }
}
