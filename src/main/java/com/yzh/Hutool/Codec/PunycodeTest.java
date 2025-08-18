package com.yzh.Hutool.Codec;

import cn.hutool.core.codec.PunyCode;

public class PunycodeTest {
    public static void main(String[] args) {
        String str = "你好";
        String encoded = PunyCode.encode(str);
        System.out.println("Encoded: " + encoded);
        String decoded = PunyCode.decode(encoded);
        System.out.println("Decoded: " + decoded);
    }
}
