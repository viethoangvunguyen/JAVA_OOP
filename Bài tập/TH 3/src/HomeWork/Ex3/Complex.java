package HomeWork.Ex3;

import java.util.Scanner;

public class Complex {
    private double phanThuc;
    private double phanAo;

    // Không tham số
    public Complex() {
        this.phanThuc = 0;
        this.phanAo = 0;
    }

    // Có 2 tham số
    public Complex(double phanThuc, double phanAo) {
        this.phanThuc = phanThuc;
        this.phanAo = phanAo;
    }

    // Nhập từ bàn phím
    public void nhapSoPhuc() {
        double phanAo, phanThuc;

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap phan thuc: ");
        phanThuc = sc.nextDouble();

        System.out.print("Nhap phan ao: ");
        phanAo = sc.nextDouble();

        setPhanAo(phanAo);
        setPhanThuc(phanThuc);
    }

    public void inSoPhuc() {
        System.out.println("So phuc la: " + getPhanThuc() + " + " + getPhanAo() + "i");
    }

    public static Complex congHaiSoPhuc(Complex cmp1, Complex cmp2) {
        double phanThuc = cmp1.phanThuc + cmp2.phanThuc;
        double phanAo = cmp1.phanAo + cmp2.phanAo;
        Complex sum = new Complex(phanThuc, phanAo);
        return sum;
    }

    public static Complex truHaiSoPhuc(Complex cmp1, Complex cmp2) {
        double phanThuc = cmp1.phanThuc - cmp2.phanThuc;
        double phanAo = cmp1.phanAo - cmp2.phanAo;
        return new Complex(phanThuc, phanAo);
    }

    public static Complex nhanHaiSoPhuc(Complex cmp1, Complex cmp2) {
        double phanThuc = cmp1.phanThuc * cmp2.phanThuc - cmp1.phanAo * cmp2.phanAo;
        double phanAo = cmp1.phanThuc * cmp2.phanAo + cmp1.phanAo * cmp2.phanThuc;
        return new Complex(phanThuc, phanAo);
    }

    public Complex nghichDaoSoPhuc() {
        double mau = phanAo * phanAo + phanThuc * phanThuc;
        return new Complex(phanThuc / mau, -phanAo / mau);
    }

    public static Complex chiaHaiSoPhuc(Complex cmp1, Complex cmp2) {
        if (cmp2.phanThuc == 0 && cmp2.phanAo == 0) {
            return null;
        }
        return nhanHaiSoPhuc(cmp1, cmp2.nghichDaoSoPhuc());
    }

    public double getPhanThuc() {
        return phanThuc;
    }

    public void setPhanThuc(double phanThuc) {
        this.phanThuc = phanThuc;
    }

    public double getPhanAo() {
        return phanAo;
    }

    public void setPhanAo(double phanAo) {
        this.phanAo = phanAo;
    }
}
