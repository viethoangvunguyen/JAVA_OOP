package com.test;

import com.utils.*;

public class TestMyDate {

    public static void main(String[] args) {
        MyDate obj1 = new MyDate();
        obj1.hienThi();

        MyDate obj2 = new MyDate(23, 2, 2020);
        obj2.hienThi();

        MyDate obj3 = new MyDate();
        obj3.nhap();
        obj3.hienThi();
    }
}
