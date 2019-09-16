package com.demo;

public class Combination {
	public static void main(String[] args) {
	     String[] name= {"Amy","Bob","Carl","David","Evan","Frank"};
		 String[] job= {"astronaut","baker","cook","dentist","engineer","flyer"};
		 String[] age= {"18","19","20","21","22","23"};
		 String a;
		 String b;
		 String c;
			int index=(int) (Math.random()*name.length);
			a=name[index];
			int sign=(int) (Math.random()*job.length);
			b=job[sign];
			int guide=(int) (Math.random()*age.length);
			c=age[guide];
			System.out.printf("%s+%s+%s",a,b,c);
	}

}

