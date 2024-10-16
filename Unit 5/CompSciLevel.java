/*Assignment name: CompSci Level*/
public class CompSciLevel{
    public static int compSciLevel(int grade,int level){
        if (grade == 9){
            if (level == 1){
                return 12;
            }else if (level == 2){
                return 0;
            }else{
                return -1;
            }
        }else if (grade == 10){
            if (level == 1){
                return 35;
            }else if (level == 2){
                return 1;
            }else{
                return -1;
            }
        }else if (grade == 11){
            if (level == 1){
                return 45;
            }else if (level == 2){
                return 17;
            }else{
                return -1;
            }
        }else{
            return -1;
        }
    }
}