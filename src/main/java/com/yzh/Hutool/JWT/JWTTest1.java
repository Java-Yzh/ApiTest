package com.yzh.Hutool.JWT;

import cn.hutool.jwt.JWT;

public class JWTTest1 {
    public static void main(String[] args) {
        // 密钥
        byte[] key = "12345678901234567890123456789012".getBytes();
        // 使用HS256(HmacSHA256)算法生成
        String token = JWT.create()
                .setPayload("sub", "1234567890")
                .setPayload("name", "looly")
                .setPayload("admin", true)
                .setKey(key)
                .sign();
        System.out.println("使用HS256(HmacSHA256)算法生成的JWT Token: " + token);

        // 解析JWT
        JWT jwt = JWT.of(token);
        System.out.println("JWT Token解析结果:" + jwt);
        System.out.println(jwt.getHeader());
        System.out.println(jwt.getPayloads());

        // 验证签名
        boolean verify = jwt.setKey(key).verify();
        System.out.println("验证签名结果: " + verify);
    }
}
