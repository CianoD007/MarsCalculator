public class WeightCalculatorMars {
    public static void main (String[] args){
         float earthWeight;
         int weightMarsInt;
         double marsWeightInDouble;
         float marsWeight;

         earthWeight = 83;
         marsWeight=(earthWeight * 0.38F);
         System.out.println(earthWeight+ "kg on Earth is"+marsWeight+"kg on Mars");

         //assignment(compatible types)from float to double
         marsWeightInDouble=marsWeight;
         System.out.println("kg on Mars after converting to double" + marsWeightInDouble);

         //printing a variable limiting the length of printing to 4 decimal place
         System.out.printf("Kilogram on Mars to four decimal:%.4f %n", marsWeightInDouble);

         //a floating point type cast to integer
         weightMarsInt=(int)marsWeightInDouble;
         System.out.println("kg on Mars when casted to int"+weightMarsInt);

         //casting an int type to char
         int c = (char)weightMarsInt;
         System.out.println("The ASCII table equivalent of weightMarsInt is:"+c);

         //assign the value of performing some mathematical operation on the char character to the new int variable
         int exampleofMathOnChar=c*c;
         System.out.println("An example of a mathematical operation on the char type:"+exampleofMathOnChar);




    }

}
