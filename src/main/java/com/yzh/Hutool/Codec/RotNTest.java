package com.yzh.Hutool.Codec;

import cn.hutool.core.codec.Rot;

public class RotNTest {
    // RotN（rotate by N places），回转N位密码，是一种简易的替换式密码，其核心原理通过固定偏移量（N）对字母表进行移位，实现字符替换。
    public static void main(String[] args) {
        String str = "Hello, World!";
        String encoded13 = Rot.encode13(str);
        System.out.println("Encoded with ROT13: " + encoded13);
        String decoded13 = Rot.decode13(encoded13);
        System.out.println("Decoded with ROT13: " + decoded13);
    }
}
