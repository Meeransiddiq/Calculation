import java.util.Scanner;
public class CbseCalculator {
       public static void main(String args []) {
              String student_Name;
              float maths_Marks, physics_Marks, chemistry_Marks, english_Marks, hindi_Marks;
              int out_Of;
              System.out.println("Calculate Percentage of a given Student Marks got in their CBSE board Exam -");
              Scanner sc = new Scanner(System.in);
              System.out.print("Enter Name of the Student :");
                     student_Name=sc.next();
              System.out.print("Subject Marks Out Off  : ");
                     out_Of=sc.nextInt();        // Note:for all input subject marks whose variable is float but I take input using (int.) because for reducing decimal length.
              System.out.print("Maths Marks out of "+(out_Of)+":");
                   maths_Marks=sc.nextInt();
              System.out.print("Physics Marks out of "+(out_Of)+":");
                   physics_Marks=sc.nextInt();
              System.out.print("Chemistry Marks out of "+(out_Of)+":");
                   chemistry_Marks=sc.nextInt();
              System.out.print("English Marks out of "+(out_Of)+":");
                   english_Marks=sc.nextInt();
              System.out.print("Hindi Marks out of "+(out_Of)+":");
                   hindi_Marks=sc.nextInt();
              float percentage =(((maths_Marks+physics_Marks+chemistry_Marks+english_Marks+hindi_Marks)/(5*out_Of))*100);
              System.out.println(student_Name +" "+"Got"+" "+ (percentage)+" % in his CBSE Board Exam." );


       }
}