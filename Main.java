import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//1)Write a Java program that accept three numbers from the user and print the largest number
        System.out.println("****Q1)print the largest number****");
        System.out.print("Please Enter First number:");
        int num1=input.nextInt();
        System.out.print("Please Enter second number:");
        int num2=input.nextInt();
        System.out.print("Please Enter third number:");
        int num3=input.nextInt();

        int largest=num1;
        if (num1>num2 && num1>num3){
            largest=num1;
        }
        else if (num2>num1 && num2>num3){
            largest=num2;
        }else largest=num3;
        System.out.println("The largest number is: "+largest);

        //2)Write a Java program that accept a String and a number from the user,
        // then print the character in the given index .
        input.nextLine();
        System.out.println("****Q2)print the character in the given index****");
        System.out.print("Please Enter any String:");
        String sentence =input.nextLine();
        System.out.print("Please Enter index:");
        int index =input.nextInt();

        System.out.println("The character in the given index is: "+sentence.charAt(index));

        //3) Write a program to enter the numbers till the user wants
        // and at the end it should display the sum entered
        System.out.println("****Q3 Enter number to calculate the sum***");
        System.out.print("Enter number or -1 to exist:");
        int number=input.nextInt();
        int sum=0;
        while (number!=-1){
            sum=sum+number;
            System.out.print("Enter number or -1 to exist:");
            number=input.nextInt();
        }
        System.out.println("The sum of numbers user enterd is:"+sum);


        //Q4)Write a Java program to find positive and negative numbers of a given array
        System.out.println("****Q4)positive and negative numbers of a given array****");
        int[] array={10, -21 , 30, 31, -25};
        for (int i = 0; i <array.length ; i++) {
            if(array[i]>0){
                System.out.println(" "+ array[i]+" is a positive number ");
            }
            if(array[i]<0){
                System.out.println(array[i]+" is a negative number ");
            }if(array[i]==0)System.out.println(array[i]+" is a Zero ");

        }

        //Q5)Write a Java program to find a shortest word of a given array:
        System.out.println("****Q5)find a shortest word of a given array****");
        String[] words={"Tuwaiq", "Bootcamp" , "Student","JAVA"};
        int shortest_index=0;
        for (int i = 1; i <words.length ; i++) {
            if(words[shortest_index].length()>words[i].length()){
                shortest_index=i;
            }
        }
        System.out.println("shortest word in the array is: "+ words[shortest_index]);




    }
}