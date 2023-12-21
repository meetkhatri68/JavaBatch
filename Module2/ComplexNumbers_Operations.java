package Module2;

/*Print the sum, difference and product of two complex numbers by creating a class named 'Complex' 
with separate methods for each operation whose real and imaginary parts are entered by user.*/

public class ComplexNumbers_Operations 
{
		// Declare the data members for real and imaginary parts
		private double real;
		private double imag;
		
		// Define a constructor to initialize the data members
		public ComplexNumbers_Operations(double real, double imag) {
		 this.real = real;
		 this.imag = imag;
		}
		
		// Define a method to print the complex number
		public void print() {
		 System.out.println(real + " + " + imag + "i");
		}
		
		// Define a method to add two complex numbers
		public ComplexNumbers_Operations add(ComplexNumbers_Operations other) {
		 // Add the real and imaginary parts separately
		 double newReal = this.real + other.real;
		 double newImag = this.imag + other.imag;
		 // Return a new Complex object with the result
		 return new ComplexNumbers_Operations(newReal, newImag);
		}
		
		// Define a method to subtract two complex numbers
		public ComplexNumbers_Operations subtract(ComplexNumbers_Operations other) {
		 // Subtract the real and imaginary parts separately
		 double newReal = this.real - other.real;
		 double newImag = this.imag - other.imag;
		 // Return a new Complex object with the result
		 return new ComplexNumbers_Operations(newReal, newImag);
		}


//Define the main method to test the code
public static void main(String[] args) 
{
		// Create two Complex objects with some values
		ComplexNumbers_Operations c1 = new ComplexNumbers_Operations(3, 2);
		ComplexNumbers_Operations c2 = new ComplexNumbers_Operations(5, 4);
		
		// Print the two complex numbers
		System.out.println("The first complex number is:");
		c1.print();
		System.out.println("The second complex number is:");
		c2.print();
		
		// Perform the operations and print the results
		ComplexNumbers_Operations sum = c1.add(c2);
		System.out.println("The sum of the two complex numbers is:");
		sum.print();
		
		ComplexNumbers_Operations difference = c1.subtract(c2);
		System.out.println("The difference of the two complex numbers is:");
		difference.print();
}
}
