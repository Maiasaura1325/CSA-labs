/*Assignment name: Presidents for 100, Alex*/
import static java.lang.System.*;
import java.util.*;

public class Presidents {
	public static void main(String[] args) 
	{
	    Scanner input = new Scanner(in);
		int year;
		String x;
		
		year = input.nextInt();
		x = getPresident(year);
		out.println(x);
	}

    // Put method here
    public static String getPresident(int year){
        if ((year<1900)||(year>2025)){
            return "Not a valid year";
        }else{
            if (year == 1900){
                return "William McKinley";
            }else if (year == 1901){
                return "William McKinley and Theodore Roosevelt";
            }else if ((year>1901)&&(year<1909)){
                return "Theodore Roosevelt";
            }else if (year == 1909){
                return "Theodore Roosevelt and William Taft";
            }else if ((year>1909)&&(year<1913)){
                return "William Taft";
            }else if (year == 1913){
                return "William Taft and Woodrow Wilson";
            }else if ((year>1913)&&(year<1921)){
                return "Woodrow Wilson";
            }else if (year == 1921){
                return "Woodrow Wilson and Warren Harding";
            }else if ((year>1921)&&(year<1923)){
                return "Warren Harding";
            }else if (year == 1923){
                return "Warren Harding and Calvin Coolidge";
            }else if ((year>1923)&&(year<1929)){
                return "Calvin Coolidge";
            }else if (year == 1929){
                return "Calvin Coolidge and Herbert Hoover";
            }else if ((year>1929)&&(year<1933)){
                return "Herbert Hoover";
            }else if (year == 1933){
                return "Herbert Hoover and Franklin Roosevelt";
            }else if ((year>1933)&&(year<1945)){
                return "Franklin Roosevelt";
            }else if (year == 1945){
                return "Franklin Roosevelt and Harry Truman";
            }else if ((year>1945)&&(year<1953)){
                return "Harry Truman";
            }else if (year == 1953){
                return "Harry Truman and Dwight Eisenhower";
            }else if ((year>1953)&&(year<1961)){
                return "Dwight Eisenhower";
            }else if (year == 1961){
                return "Dwight Eisenhower and John Kennedy";
            }else if ((year>1961)&&(year<1963)){
                return "John Kennedy";
            }else if (year == 1963){
                return "John Kennedy and Lyndon Johnson";
            }else if ((year>1963)&&(year<1969)){
                return "Lyndon Johnson";
            }else if (year == 1969){
                return "Lyndon Johnson and Richard Nixon";
            }else if ((year>1969)&&(year<1974)){
                return "Richard Nixon";
            }else if (year == 1974){
                return "Richard Nixon and Gerald Ford";
            }else if ((year>1974)&&(year<1977)){
                return "Gerald Ford";
            }else if (year == 1977){
                return "Gerald Ford and Jimmy Carter";
            }else if ((year>1977)&&(year<1981)){
                return "Jimmy Carter";
            }else if (year == 1981){
                return "Jimmy Carter and Ronald Reagan";
            }else if ((year>1981)&&(year<1989)){
                return "Ronald Reagan";
            }else if (year == 1989){
                return "Ronald Reagan and George Bush";
            }else if ((year>1989)&&(year<1993)){
                return "George Bush";
            }else if (year == 1993){
                return "George Bush and Bill Clinton";
            }else if ((year>1993)&&(year<2001)){
                return "Bill Clinton";
            }else if (year == 2001){
                return "Bill Clinton and George W. Bush";
            }else if ((year>2001)&&(year<2009)){
                return "George W. Bush";
            }else if (year == 2009){
                return "George W. Bush and Barack Obama";
            }else if ((year>2009)&&(year<2017)){
                return "Barack Obama";
            }else if (year == 2009){
                return "Barack Obama and Donald Trump";
            }else if ((year>2017)&&(year<2021)){
                return "Donald Trump";
            }else if (year == 2021){
                return "Donald Trump and Joseph Biden";
            }else if ((year>2021)&&(year<2025)){
                return "Joseph Biden";
            }else{
                return "Barack Obama and Donald Trump";
            }
        }
    }

}