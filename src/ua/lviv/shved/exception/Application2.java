package ua.lviv.shved.exception;

public class Application2 {

	public static void main(String[] args) throws MyException {
		Methods m1 = new Methods(-2,-8);
		Methods m2 = new Methods(0,2);
		Methods m3 = new Methods(0,0);
		Methods m4 = new Methods(213,123);

		try {
		m1.multiply();
		
		}
		catch(IllegalStateException e){
			System.out.println("Illegal State is here");
		}
		catch(MyException e){
			System.out.println("My Exception is here");
		}
		catch(ArithmeticException e){
			System.out.println("Arithmetic Exception is here");
		} finally {
			System.out.println("---Ñalculation is done");;
		}
		try {
			m2.divide();
			
			}
			catch(IllegalStateException e){
				System.out.println("Illegal State is here");
			}
			catch(MyException e){
				System.out.println("My Exception is here");
			}
			catch(ArithmeticException e){
				System.out.println("Arithmetic Exception is here");
			} finally {
				System.out.println("---Ñalculation is done");;
			}
		try {
			m3.substract();
			
			}
			catch(IllegalStateException e){
				System.out.println("Illegal State is here");
			}
			catch(MyException e){
				System.out.println("My Exception is here");
			}
			catch(ArithmeticException e){
				System.out.println("Arithmetic Exception is here");
			} finally {
				System.out.println("---Ñalculation is done");;
			}
		try {
			m4.add();
			
			}
			catch(IllegalStateException e){
				System.out.println("Illegal State is here");
			}
			catch(MyException e){
				System.out.println("My Exception is here");
			}
			catch(ArithmeticException e){
				System.out.println("Arithmetic Exception is here");
			} finally {
				System.out.println("---Ñalculation is done");;
			}
	}

}
