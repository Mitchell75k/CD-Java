//Here's a list of common methods in the String class:
//1. int length() - returns the number of characters in the String
//2. String concat(String str) - returns a new String that appends the specified String to the end of the original String
//3. char charAt(int index) - returns the character located at the specified index
//4. int indexOf(String str) - returns the index of the first occurrence of the specified substring
//5. int lastIndexOf(String str) - returns the index of the last occurrence of the specified substring
//6. String substring(int beginIndex) - returns a new String that is a substring of the original String
//7. String substring(int beginIndex, int endIndex) - returns a new String that is a substring of the original String
//8. String toLowerCase() - returns a new String that is a lowercase version of the original String
//9. String toUpperCase() - returns a new String that is an uppercase version of the original String
//10. String trim() - returns a new String that has removed any leading or trailing whitespace from the original String
//11. boolean equals(String str) - returns true if the String is equal to the specified String, otherwise false
//12. boolean equalsIgnoreCase(String str) - returns true if the String is equal to the specified String, ignoring case, otherwise false
//13. String[] split(String regex) - returns an array of Strings that are separated by the specified regex
//14. String replace(char oldChar, char newChar) - returns a new String that replaces all occurrences of the oldChar with the newChar
//15. String replace(CharSequence target, CharSequence replacement) - returns a new String that replaces all occurrences of the target with the replacement
//16. boolean contains(CharSequence str) - returns true if the String contains the specified String, otherwise false
//17. boolean startsWith(String prefix) - returns true if the String starts with the specified prefix, otherwise false
//18. boolean endsWith(String suffix) - returns true if the String ends with the specified suffix, otherwise false
//19. String join(CharSequence delimiter, CharSequence... elements) - returns a new String that is a concatenation of the specified elements with the specified delimiter
//20. String format(String format, Object... args) - returns a new String that is a formatted version of the original String, using the specified arguments and format
//21. String repeat(int count) - returns a new String that repeats the original String count times
//22. String strip() - returns a new String that has removed any leading or trailing whitespace from the original String
//23. String stripLeading() - returns a new String that has removed any leading whitespace from the original String
//24. String stripTrailing() - returns a new String that has removed any trailing whitespace from the original String
//25. String indent(int n) - returns a new String that has indented the original String by n characters
//26. String translateEscapes() - returns a new String that has translated any escape sequences in the original String
//27. String stripIndent() - returns a new String that has removed any leading whitespace from every line in the original String
//28. String stripLeading() - returns a new String that has removed any leading whitespace from every line in the original String
//29. String stripTrailing() - returns a new String that has removed any trailing whitespace from every line in the original String
//30. String lines() - returns a Stream of Strings that are the lines of the original String
//31. String repeat(int count) - returns a new String that repeats the original String count times
//32. String strip() - returns a new String that has removed any leading or trailing whitespace from the original String
//33. String stripLeading() - returns a new String that has removed any leading whitespace from the original String
//34. String stripTrailing() - returns a new String that has removed any trailing whitespace from the original String

//

//for (int i = 0; i < Integer.MAX_VALUE; i++) { 
//    sum += i;
//}

// 'int i = 0' represents the starting point of the loop (i.e. the value of i at the start of the loop)
// 'i < Integer.MAX_VALUE' represents the condition that must be met for the loop to continue, 
// 'i++'  represents the incrimination of i by 1 after each iteration of the loop
// 'sum += i' represents the action that is performed on each iteration of the loop, in this case, the sum is incremented by i