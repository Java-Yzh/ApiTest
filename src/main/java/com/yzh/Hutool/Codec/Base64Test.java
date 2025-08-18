package com.yzh.Hutool.Codec;

import cn.hutool.core.codec.Base64;

public class Base64Test {
    public static void main(String[] args) {
        String str = "我是一个很长的字符串，用于测试Base64编码和解码功能。";
        String encoded = Base64.encode(str);
        System.out.println("Encoded: " + encoded);
        String decoded = Base64.decodeStr(encoded);
        System.out.println("Decoded: " + decoded);
    }
}
