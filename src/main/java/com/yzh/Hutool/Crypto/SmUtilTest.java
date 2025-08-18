package com.yzh.Hutool.Crypto;

import cn.hutool.core.codec.Base64;
import cn.hutool.crypto.KeyUtil;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.SmUtil;
import cn.hutool.crypto.asymmetric.KeyType;
import cn.hutool.crypto.asymmetric.SM2;
import cn.hutool.crypto.digest.SM3;
import cn.hutool.crypto.symmetric.SM4;

import java.security.KeyPair;

public class SmUtilTest {
    public static void main(String[] args) {
        String password = "123456789";
        // SM2（非对称加密）
        // 生成密钥
        KeyPair keyPair = SecureUtil.generateKeyPair("SM2");
        byte[] publicKey = keyPair.getPublic().getEncoded();
        byte[] privateKey = keyPair.getPrivate().getEncoded();
        SM2 sm2 = SmUtil.sm2(privateKey, publicKey);
        byte[] encrypt1 = sm2.encrypt(password, KeyType.PublicKey);
        System.out.println("SM2加密: " + new String(encrypt1));
        byte[] decrypt1 = sm2.decrypt(encrypt1, KeyType.PrivateKey);
        System.out.println("SM2解密: " + new String(decrypt1));
        System.out.println("----------------------");

        // SM3（摘要算法）
        SM3 sm3 = SmUtil.sm3();
        byte[] digest = sm3.digest(password);
        System.out.println("SM3摘要: " + new String(digest));
        System.out.println(Base64.encode(digest));
        System.out.println("----------------------");

        // SM4（对称加密）（随机密钥）
        SM4 sm4 = SmUtil.sm4();
        byte[] encrypt2 = sm4.encrypt(password);
        System.out.println("SM4加密: " + new String(encrypt2));
        byte[] decrypt2 = sm4.decrypt(encrypt2);
        System.out.println("SM4解密: " + new String(decrypt2));
        System.out.println("----------------------");

        // SM4（对称加密）（自定义密钥）
        byte[] key = KeyUtil.generateKey(SM4.ALGORITHM_NAME, 128).getEncoded();
        SM4 sm4ByKey = SmUtil.sm4(key);
        byte[] encrypt3 = sm4ByKey.encrypt(password);
        System.out.println("SM4加密: " + new String(encrypt3));
        byte[] decrypt3 = sm4ByKey.decrypt(encrypt3);
        System.out.println("SM4解密: " + new String(decrypt3));

    }
}
