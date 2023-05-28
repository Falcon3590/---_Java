package seminar_7_OOP.HomeWork;

public class ComplexNumber {
	private double realPart;
	private double imaginaryPart;

	public double getRealPart() {
		return realPart;
	}

	public void setRealPart(double realPart) {
		this.realPart = realPart;
	}

	public double getImaginaryPart() {
		return imaginaryPart;
	}

	public void setImaginaryPart(double imaginaryPart) {
		this.imaginaryPart = imaginaryPart;
	}

	public ComplexNumber(double realPart, double imaginaryPart) {
		this.realPart = realPart;
		this.imaginaryPart = imaginaryPart;
	}

	// геттеры и сеттеры

	public ComplexNumber add(ComplexNumber other) {
		return new ComplexNumber(this.realPart + other.getRealPart(), this.imaginaryPart + other.getImaginaryPart());
	}

	public ComplexNumber subtract(ComplexNumber other) {
		return new ComplexNumber(this.realPart - other.getRealPart(), this.imaginaryPart - other.getImaginaryPart());
	}

	public ComplexNumber multiply(ComplexNumber other) {
		double real = this.realPart * other.getRealPart() - this.imaginaryPart * other.getImaginaryPart();
		double imaginary = this.realPart * other.getImaginaryPart() + this.imaginaryPart * other.getRealPart();
		return new ComplexNumber(real, imaginary);
	}

	public ComplexNumber divide(ComplexNumber other) {
		double denominator = Math.pow(other.getRealPart(), 2) + Math.pow(other.getImaginaryPart(), 2);
		double real = (this.realPart * other.getRealPart() + this.imaginaryPart * other.getImaginaryPart()) / denominator;
		double imaginary = (this.imaginaryPart * other.getRealPart() - this.realPart * other.getImaginaryPart()) / denominator;
		return new ComplexNumber(real, imaginary);
	}

	@Override
	public String toString() {
		return "(" + this.realPart + ", " + this.imaginaryPart + "i)";
	}
}