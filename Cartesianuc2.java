public class Cartesianuc2{
	public static void main(String[] args)
	{
		double x1=3;
		double x2=5;
		double y1=9;
		double y2=8;
		double distance1;
		double x3=8;
                double x4=5;
                double y3=9;
                double y4=6;
                double distance2;
                distance1=Math.sqrt(Math.pow(x2-x1,2)) + (Math.pow(y2-y1,2));
                System.out.println("The length of two lines:" +distance1);
		String str1=Double.toString(distance1);

		distance2=Math.sqrt(Math.pow(x4-x3,2)) + (Math.pow(y4-y3,2));
		System.out.println("The length of two lines:" +distance2);
		String str2=Double.toString(distance2);
		System.out.println(str1.equals(str2));
	}
}
