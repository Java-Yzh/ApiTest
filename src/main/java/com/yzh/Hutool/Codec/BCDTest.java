package com.yzh.Hutool.Codec;

import cn.hutool.core.codec.BCD;

public class BCDTest {
    public static void main(String[] args) {
        String strForTest = "123456ABCDEF";
        byte[] bcd = BCD.strToBcd(strForTest);
        System.out.println("BCD byte array: " + bcd);
        String str = BCD.bcdToStr(bcd);
        System.out.println("String from BCD: " + str);
    }
}
