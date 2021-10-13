public class Cartesianuc3{
        public static void main(String[] args)
        {
                double x1=3;
                double x2=5;
                double y1=9;
                double y2=8;
                double first_length;
                double x3=8;
                double x4=5;
                double y3=9;
                double y4=6;
                double second_length;
                first_length=Math.sqrt(Math.pow(x2-x1,2)) + (Math.pow(y2-y1,2));
                System.out.println("First length of line:" +first_length);

                second_length=Math.sqrt(Math.pow(x4-x3,2)) + (Math.pow(y4-y3,2));
                System.out.println("second length of line:" +second_length);
                if (first_length > second_length)
		
			System.out.println("Line one is greater");
		
		else if(first_length == second_length)
		
                        System.out.println("Line one is line two are equal");
		
		else
			System.out.println("Line two is greter");
        }
}
