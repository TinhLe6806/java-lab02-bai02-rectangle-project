/**
 * @description:  Class tinh chu vi va dien tich hinh chu nhat
 * @author:  Le Cao Phu Tinh
 * @version: 1.0
 * @created: Aug 30, 2025 1:14:13 PM
 */
package iuh.fit.it;

public class Rectangle {
	private double length;
	private double width;
	public void setLength(double d) throws Exception {
		if(d>0) {
			this.length=d;
		} else throw new Exception("Loi chieu dai"); 
	}
	public void setWidth(double r) throws Exception {
		if(r>0) {
			this.width=r;
		} else throw new Exception("Loi chieu rong");
	}
	public double getLength() {
		return this.length;
	}
	public double getWidth() {
		return this.width;
	}
			public Rectangle () {}
			public Rectangle(double d, double r) throws Exception {
		if(d>0) {
			this.length=d;
		} else throw new Exception("Loi chieu dai");
		if(r>0) {
			this.width=r;
		} else throw new Exception("Loi chieu rong");
	}
	public double getPerimeter() {
		return (getLength()+getWidth())*2;
	}
	public double getArea(double d, double r) {
		return d*r;
	}
	public static void inTieuDe() {
		System.out.println("Bang tinh dien tich || Chu vi");
		for (int i=0;i<45;i++) {
			System.out.printf("-");
		}
		System.out.println();
		String s = "";
		s=String.format("|%-10s||%-10s||%-10s||%-10s|", "Chieu Dai", "Chieu Rong", "Chu Vi", "Dien Tich");
		System.out.println(s);		
		for (int i=0;i<45;i++) {
			System.out.printf("-");
		}
		System.out.println();
	}
	@Override
	public String toString() {
	    return String.format("|%-10s||%-10s||%-10s||%-10s|",
	        getLength(), getWidth(), getPerimeter(), getArea(length, width));
	}

	public static void main(String[] args) {
		inTieuDe();
	}
}
