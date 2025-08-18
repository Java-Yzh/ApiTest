package com.yzh.Hutool.Codec;

import cn.hutool.core.codec.Base62;

public class Base62Test {
    public static void main(String[] args) {
        String str = "我是一个很长的字符串，用于测试Base62编码和解码功能。";
        String encoded = Base62.encode(str);
        System.out.println("Encoded: " + encoded);
        String decoded = Base62.decodeStr(encoded);
        System.out.println("Decoded: " + decoded);
    }
}
