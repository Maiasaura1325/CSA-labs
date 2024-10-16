/*Assignment name: Pig Latin
 * This assignment requires writing a method, not a class
*/

public String pigLatin(String name) {
    name = name.toLowerCase();
    int firstNameIndex = name.indexOf(" ");
    String firstName = name.substring(0,firstNameIndex);
    String lastName = name.substring(firstNameIndex+1);
    
    String part1 = firstName.charAt(0)+"";
    String part2 = lastName.charAt(0)+"";
    String part3 = firstName.charAt(1)+"";
    part3 = part3.toUpperCase();
    part3 = part3+firstName.substring(2);
    String part4 = lastName.charAt(1)+"";
    part4 = part4.toUpperCase();
    part4 = part4+lastName.substring(2);
    
    firstName = part3+part1+"ay";
    lastName = part4+part2+"ay";
    
    return firstName+ " " + lastName;
    
}