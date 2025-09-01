/**
 * @description:  Kiem thu, du lieu mau
 * @author:  Le Cao Phu Tinh
 * @version: 1.0
 * @created: Aug 30, 2025 1:14:13 PM
 */
package iuh.fit.it;

import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            Rectangle h1 = new Rectangle();
            h1.setLength(10);
            h1.setWidth(3);

            Rectangle h2 = new Rectangle(10, 30);

            Rectangle h3 = new Rectangle();
            System.out.print("Nhập chiều dài cho h3: ");
            double d = sc.nextDouble();
            h3.setLength(d);

            System.out.print("Nhập chiều rộng cho h3: ");
            double r = sc.nextDouble();
            h3.setWidth(r);

            Rectangle.inTieuDe();
            System.out.println(h1);
            System.out.println(h2);
            System.out.println(h3);
        }
    }
}