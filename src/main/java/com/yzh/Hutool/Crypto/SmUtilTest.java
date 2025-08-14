package com.yzh.Hutool.Crypto;

import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.SmUtil;
import cn.hutool.crypto.asymmetric.KeyType;
import cn.hutool.crypto.asymmetric.SM2;

import java.security.KeyPair;

public class SmUtilTest {
    public static void main(String[] args) {
        String password = "123456789";
        // SM2
        // 生成密钥
        KeyPair keyPair = SecureUtil.generateKeyPair("SM2");
        byte[] publicKey = keyPair.getPublic().getEncoded();
        byte[] privateKey = keyPair.getPrivate().getEncoded();
        SM2 sm2 = SmUtil.sm2(privateKey, publicKey);
        byte[] encrypt1 = sm2.encrypt(password, KeyType.PublicKey);
        System.out.println("SM2加密: " + new String(encrypt1));
        byte[] decrypt1 = sm2.decrypt(encrypt1, KeyType.PrivateKey);
        System.out.println("SM2解密: " + new String(decrypt1));
    }
}
