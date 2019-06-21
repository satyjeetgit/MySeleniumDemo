package javaBasic;

public class Switch_Demo {

	public static void main(String[] args) {
		//Decleare variable for switch statement
		int a= 1;

		//Switch statement
		switch(a) {
		//Case statement

		case 1: System.out.println("case 1 executed");
		break;
		case 2: System.out.println("case 2 executed");
		break;
		case 3: System.out.println("case 3 executed");
		break;
		default:System.out.println("No case is match");
		}
		FindVowel();
	}


	public static void FindVowel()
	{
		char o= 'A';


		switch(o) {

		case 'a': System.out.println("Letter is vowel");
		break;
		case 'e': System.out.println("Letter is vowel");
		break;
		case 'i': System.out.println("Letter is vowel");
		break;
		case 'o': System.out.println("Letter is vowel");
		break;
		case 'u': System.out.println("Letter is vowel");
		break;
		case 'A': System.out.println("Letter is vowel");
		break;
		case 'E': System.out.println("Letter is vowel");
		break;
		case 'I': System.out.println("Letter is vowel");
		break;
		case 'O': System.out.println("Letter is vowel");
		break;
		case 'U': System.out.println("Letter is vowel");
		break;
		default: System.out.println("Letter is Consonant");


		}

	}

}
