package com.lab6;

//Custom Exception Class
class NoVowelsException extends Exception 
{
	public NoVowelsException(String message) 
	{
		super(message);
	}
}


public class Vowel {
 
 public static void checkForVowels(String str) throws NoVowelsException {
     boolean foundVowel = false;
     for (char ch : str.toCharArray()) 
     {
         if ("aeiouAEIOU".indexOf(ch) != -1) 
         {
             foundVowel = true;
             break;
         }
     }
     if (!foundVowel) {
         throw new NoVowelsException("No vowels found in the string!");
     }
 }

 
 public static void main(String[] args) {
     String testString1 = "Kaushik";

     try 
     {
         checkForVowels(testString1);
         System.out.println("String contains vowels!");
     } 
     catch (NoVowelsException e) 
     {
         System.out.println(e.getMessage());
     }

 }
}
