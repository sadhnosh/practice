package practice;
// when use extends it means IS A relationship..
// when we crrate a obj in class it means has a

// Multi level inheritance 
class Calcultor{ //Super
	
	int add(int i, int j) {
		return i+j;
	}
}

class CalcAdv extends Calcultor{ // Sub
	
	int sub(int i, int j) {
		return i-j;
	}
}

class VeryAdvCalc extends CalcAdv{
	int milti(int i, int j) {
		return i*j;
	}
}



public class InheritanceDemo {

	public static void main(String args[]) {
		
		VeryAdvCalc veryAdvCalc = new VeryAdvCalc();/// has a relation ship
		
		System.out.println(veryAdvCalc.add(2, 2));
		System.out.println(veryAdvCalc.sub(2, 2));
		System.out.println(veryAdvCalc.milti(2, 2));
		
		VeryAdvCalc advCalc= (VeryAdvCalc) new CalcAdv();
		advCalc.add(1, 1);
	}
}
