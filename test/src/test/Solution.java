package test;

public class Solution {
	static public double Power(double base, int exponent) {
		double result=1;
		for(int i=0;i<Math.abs(exponent);i++){
			result*=base;
		}
		if(exponent<0){
			result=1/result;
		}
		return result;
	}
	public static void main(String[] args) {
		double a = 0.011;
		double b = 0.012;
		double c = 0.023;
		System.out.println(a+b-c);
	}
}
