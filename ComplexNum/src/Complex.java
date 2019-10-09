import java.util.Scanner;

public class Complex {
	double real;//Êµ²¿
	double image;//Ðé²¿
	Complex(){
		Scanner input=new Scanner(System.in);
		double real=input.nextDouble();
		double image=input.nextDouble();
		Complex(real,image);	
	}
	private void Complex(double real, double image) {
		// TODO Auto-generated method stub
		this.real=real;
		this.image=image;
	}
	Complex(double real,double image){
		this.real=real;
		this.image=image;
	}
	public double getreal() {
		return real;
	}
	public void setreal(double real) {
		this.real=real;
	}
	public double getimage() {
		return image;
	}
	public void setimage(double image) {
		this.image=image;
	}
	Complex add(Complex a) {
		double real2=a.getreal();
		double image2=a.getimage();
		double newreal=real+real2;
		double newimage=image+image2;
		Complex result=new Complex(newreal,newimage);
		return result;
	}
	Complex sub(Complex a) {
		double real2=a.getreal();
		double image2=a.getimage();
		double newreal=real-real2;
		double newimage=image-image2;
		Complex result=new Complex(newreal,newimage);
		return result;
	}
	Complex mul(Complex a) {
		double real2=a.getreal();
		double image2=a.getimage();
		double newreal=real*real2-image*image2;
		double newimage=image*real2+real*image2;
		Complex result=new Complex(newreal,newimage);
		return result;
	}
	Complex div(Complex a) {
		double real2=a.getreal();
		double image2=a.getimage();
		double newreal=(real*real2+image*image2)/(real2*real2+image2*image2);
		double newimage=(image*real2-real*image2)/(real2*real2+image2*image2);
		Complex result=new Complex(newreal,newimage);
		return result;
	}
	public void print() {
		if(image>0) {
			System.out.println(real+"+"+image+"i");
		}
		else if(image<0) {
			System.out.println(real+""+image+"i");
		}
		else {
			System.out.println(real);
		}
	}

}
