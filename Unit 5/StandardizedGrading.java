/*Assignment name: Standardized Grading*/
public class StandardizedGrading{
    public static String getGrade(int grade){
        if (grade>=93){
            return "A";
        }else if ((grade>=90)&&(grade<93)){
            return "A-";
        }else if ((grade>=87)&&(grade<90)){
            return "B+";
        }else if ((grade>=83)&&(grade<87)){
            return "B";
        }else if ((grade>=80)&&(grade<83)){
            return "B-";
        }else if ((grade>=77)&&(grade<80)){
            return "C+";
        }else if ((grade>=73)&&(grade<77)){
            return "C";
        }else if ((grade>=70)&&(grade<73)){
            return "C-";
        }else if ((grade>=67)&&(grade<70)){
            return "D+";
        }else if ((grade>=63)&&(grade<67)){
            return "D";
        }else if ((grade>=60)&&(grade<63)){
            return "D-";
        }else{
            return "F";
        }
    }
}