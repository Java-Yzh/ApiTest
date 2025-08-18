package com.yzh.Hutool.Codec;

import cn.hutool.core.codec.Base32;

public class Base32Test {
    public static void main(String[] args) {
        String str = "我是一个很长的字符串，用于测试Base32编码和解码功能。";
        String encoded = Base32.encode(str);
        System.out.println("Encoded: " + encoded);
        String decoded = Base32.decodeStr(encoded);
        System.out.println("Decoded: " + decoded);
    }
}
