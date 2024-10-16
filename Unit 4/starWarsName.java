/*Assignment name: Star Wars Name
 * requires a method, not a class
*/
public String starWarsName(String name, String street, String car) {
    String part1 = name.substring(name.length()-1);
    part1 = part1.toUpperCase();
    part1 = part1 + (name.substring (name.length()-2, name.length()-1)).toLowerCase();
    part1 = part1 + (name.substring (name.length()-3, name.length()-2)).toLowerCase();
    
    String part2 = street.substring(0,5);
    part2 = part2.toLowerCase();
    String part3 = car.substring(1,2);
    part3 = part3.toUpperCase();
    part3 = part3 + car.substring(2, car.length()-1);
    
    return part1+part2+ " of "+ part3;
    
    
}

/*This is a fun one and I encourage you to integrate it into a program*/