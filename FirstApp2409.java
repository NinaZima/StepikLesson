/**
 * Java 1. Home work 2. 
 * @autor Ilyukhina Natalia
 * @version 24.09.21
 */
class FirstApp2209 {
public static void main(String[]args){
	within10and20(3, 8);
    isPositiveOrNegative(-3);
	isNegative(-8);
	printWordNString("Hello, my dog!", 5);
    }
	
    static boolean within10and20(int a, int b) {
            return a + b >= 10 && a + b <= 20;
		
	    }

	static void isPositiveOrNegative(int y) {
	if (y < 0) {
		System.out.println ("YES");
	} else {
		System.out.println ("NOW");
	}	
	}
	
    static boolean isNegative(int w){ 
	    return w <= 0;
	}

	static void  printWordNString(String str, int word) {
	    for (int i = 0; i < word; i++) {	
	        System.out.println(str);
	}
}
}		
	
	

	
	

	

