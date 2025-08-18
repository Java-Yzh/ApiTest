package com.yzh.Hutool.Codec;

import cn.hutool.core.codec.Morse;

public class MorseTest {
    public static void main(String[] args) {
        Morse morse = new Morse();
        String str = "我是一个很长的字符串，用于测试Morse编码和解码功能。";
        String encoded = morse.encode(str);
        System.out.println("Encoded: " + encoded);
        String decoded = morse.decode(encoded);
        System.out.println("Decoded: " + decoded);
    }
}
