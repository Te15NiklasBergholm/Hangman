import java.util.Scanner;
import java.util.Arrays;

public class Hangman {
	public static void main (String[] arg){
		String [] words = {"teknik", "nti", "java"};
		//Ordlista med 3 ord.
		int randomWordNumber = (int) (Math.random() * words.length);
		//v�lj ett random ord fr�n listan.
		char [] usedLetters = new char [words[randomWordNumber].length()];
		int guessCount = 0;
		boolean guessedWord = false;
		do {
		//H�ller koll p� vilka bokst�ver som du har gissat.
		
		switch (guessLetter(words[randomWordNumber], guessedLetters)) {
			case 0:
			guessCount++;
			break;
		case 1:
			guessCount++;
			break;
		case 2:
			break;
		case 3;
			guessedWord = true;
			break;
		while (! guessedWord);
		System.out.printIn ("\nOrdet �r " + words[randomWordNumber] + " Du faila " + (guessCount -findEmptyPosition(guessedLetter)) + "g�ng(er)");
			
		
		
	}
			
}
