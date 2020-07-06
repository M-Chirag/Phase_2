
// class Outer{
// 	private int var;

// 	class Inner{

// 		boolean flag;
// 		int var;

// 		void in(){
// 			int var = 10;
// 			System.out.println("Inside Inner's in...");
// 			System.out.println("var : " + var); //Local var
// 			System.out.println("Instance var : " + this.var); //Instance var
// 			System.out.println("Outer's var: " + Outer.this.var); //Outer's var
// 		}
// 	}

// 	// void func(){
// 	// 	Inner ref = new Inner();
// 	// 	ref.in();
// 	// }
// }

// Method Local Inner Classes

class Outer{
	void met(){
		int v = 7;
		class Inner{
			void in(){
				System.out.println("Inside Inner's in..., v= " + v);
			}
		}
		new Inner().in();
	}
}

class inner_classes{
	public static void main(String[] args) {
		new Outer().met();
	}
}

// class inner_classes{
// 	public static void main(String[] args) {
// 		// Have a requirement to call Inner's in from here
// 		// Outer out = new Outer();

// 		Outer.Inner ref =new Outer().new Inner();

// 		ref.in();
//     }
// }

//AnonymousVersion1

// interface Remote{
// 	void doSomething();
// }


// class inner_classes{
// 	public static void main(String[] args) {
// 		Remote ref = new Remote(){
// 			@Override
// 			public void doSomething(){
// 				System.out.println("Magical stuff this...");
// 			}
// 		};
// 		ref.doSomething();
// 	}
// }


//AnonymousVersion2

// interface R{
// 	void doSomething();
// }

// class Other{
// 	void cal(R ref){
// 		ref.doSomething();
// 	}
// }

// class inner_classes{
// 	public static void main(String[] args) {
// 		Other other = new Other();
// 		other.cal(new R(){
// 			@Override
// 			public void doSomething(){
// 				System.out.println("Truly magical this...");
// 			}
// 		});
// 	}
// }