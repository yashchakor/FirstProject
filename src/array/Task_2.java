package array;

import java.util.Arrays;

public class Task_2 {
	
	
	
	public static Boys[]getPassBoys(Boys[]b) {
		
		int count=0;
		
		for(Boys y:b) {
			
			
			
			if(y.getMarks()>=35) {
				
				count++;
				
				
			}
		
			
		}
		
		Boys [] pass=new Boys[count];
		
		
		int index =0;
			for(Boys y:b) {
			
			
			
			if(y.getMarks()>=35) {
				
				pass[index]=y;
				
				index++;
				
			}
		
			
		}
		
		
		
		return pass;
		
	}
	
	
	public static void main(String[] args) {
		
		Boys a=new Boys(101,"yash",35);
		Boys b=new Boys(102,"mahesh",90);
		Boys c=new Boys(103,"prateek",100);
		Boys d=new Boys(104,"sahil",20);
		Boys e=new Boys(105,"aditya",30);

		
		Boys[] pass = getPassBoys(new Boys[] {a,b,c,d,e});
		
		for(Boys y:pass) {
			
			System.out.println(y.getId()+"   "+y.getName()+"   "+y.getMarks());
			
		}
		
		System.out.println("------------------------------");
		
		Arrays.stream(pass).forEach(s->{
			
			
			System.out.println(s.getId()+"  "+s.getName()+"  "+s.getMarks());
		});
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
