/*Assignment name: Quizlab*/
public class Exemptions{
    public static String periodToExempt(double p1, double p2) {
		boolean p1exempt=false;
		boolean p2exempt=false;
		
		if (p1>=89.5||(p1>=79.5&&p1<=86.5)||(p1>=69.5&&p1<=76.5)) {
			p1exempt = true;
		}
		if (p2>=89.5||(p2>=79.5&&p2<=86.5)||(p2>=69.5&&p2<=76.5)) {
			p2exempt = true;
		}
		
		if (p1exempt&&p2exempt) {
			if (p1>p2) {
				return "Exempt 2 with a "+Math.round(p2);
			}else {
				return "Exempt 1 with a "+Math.round(p1);
			}
		}else if(p1exempt||p2exempt) {
			if (p1exempt) {
				return "Exempt 1 with a "+Math.round(p1);
			}else {
				return "Exempt 2 with a "+Math.round(p2);
			}
		}else {
			return "Do not exempt a period";
		}
			
		
	}
}