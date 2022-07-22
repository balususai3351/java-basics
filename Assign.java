
public class Assign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calci ca;
		ca=new Calci();
	    ca.help();
	    System.out.println(ca.add(5,4));
	    ca.subtract(5, 4);
	    System.out.println(ca.multipy(2, 3));
	    System.out.println(ca.division(5, 4));
	    System.out.println(ca.complete());
	    ca.subtract(ca.multipy(5, 4),ca.add(5, 4));
        System.out.println("-----------------");
        System.out.println(ca.square(ca.add(3,4)));
        System.out.println(ca.distributive(6, 5, 4));
        System.out.println(ca.equal(4,4));
	}

}
 class Calci {
	 void help() {
		 System.out.println("hey i am calci i am here to help you");
	 }
	 int add(int x,int y) {
		 int z=x+y;
		 return z;
	 }
	 void subtract(int x,int y) {
		 System.out.println(x-y);
	 }
	 int multipy(int x,int y) {
		 return x*y;
	 }
	 float division(int x, int y) {
		 return x/y;
	 }
	 String complete() {
		 return "THANK U";
	 }
	 int square(int x) {
		 return x*x;
	 }
	 float distributive(int x,int y,int z) {
		 return multipy(add(x,y),z);
	 }
	 boolean equal(int x ,int y) {
		 if(x==y) {
			 return true;
		 }else {
			 return false;
		 
	 }
}}
