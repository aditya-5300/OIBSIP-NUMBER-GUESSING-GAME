import java.lang.String;
import java.util.Scanner;
import java.util.Random;

 class Guessthenumber
{
public static void main(String args[])
{
Random r = new Random();
int guessnumber = r.nextInt(100);

Scanner sc = new Scanner(System.in);
int guess;

System.out.println("Greetings and welcome to the number number guessing game");
System.out.println("ENTER THE NUMBER BTN 1 TO 100 =");

while(true)
{
guess =sc.nextInt();

if (guess ==guessnumber)
{
System.out.println("Congratulations on guessing the number correctly");
break;
}

else if (guess < guessnumber)
{
System.out.println("The guess you made is to low");
}
else
{
System.out.println("The guess you made is to high");
}
}
sc.close();
}
}