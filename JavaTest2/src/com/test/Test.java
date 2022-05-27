package com.test;

public class Test {
	
	public static void main(String[] args) {
//		
//		ArrayListTest t=new ArrayListTest();
//		t.declare();
		
		Calculate c = new CalculateImpl();
		
		System.out.println(c.add(5, 6));
		
		
		Calculate calc = new Calculate() {
			
			
			
			@Override
			public int add(int a, int b) {
				// TODO Auto-generated method stub
				return a+b;
			}
		};
//		
//		
//		Calculate calc2 = (p,q)->
//		{
//			
//			int x=34;
//			int y = 73;
//			System.out.println(x+y);
//			System.out.println("Hello Subhrajeet");
//			return p*q;
//		};
		
//		
		
//		System.out.println(calc2.add(2, 3));
		
//		NewCalc nc = new NewCalc();
//		
//		System.out.print(nc.getValue(4, 5));
//		
		
//		System.out.print(NewCalc.getValue(4,6));
		
		Calculate calc3 = NewCalc::getValue;
		
		System.out.println(calc3.add(4, 5));
//	
		
	}

}
