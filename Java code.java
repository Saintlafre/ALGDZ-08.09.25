import java.util.*;
public class FirstFileOnJV {
    public static void main(String[] args) {  
        String input = "AaBbCcDd";  
        StringBuilder uppercase = new StringBuilder();  
        StringBuilder lowercase = new StringBuilder();  
        
        for (char chapter : input.toCharArray()) {
            if (Character.isUpperCase(chapter)) {
                uppercase.append(chapter);
            } else if (Character.isLowerCase(chapter)) {
                lowercase.append(chapter);
            }
        }
        
        System.out.println("Заглавные буквы: " + uppercase.toString());  
        System.out.println("Строчные буквы: " + lowercase.toString()); 
            List<String> inputList = Arrays.asList("a", "1", "b", "2", "c", "3");  
            List<String> letters = new ArrayList<>();  
        List<String> numbers = new ArrayList<>();  
        for (String item : inputList) {  
            if (Character.isLetter(item.charAt(0))) {  
                letters.add(item);  
            } else if (Character.isDigit(item.charAt(0))) {  
                numbers.add(item);  
            }  
        }  
        System.out.println("буквы: " + letters);  
        System.out.println("цифры: " +  numbers);  
    }  
}


