package com.yzh.Hutool.Crypto;

import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.asymmetric.KeyType;
import cn.hutool.crypto.asymmetric.RSA;
import cn.hutool.crypto.digest.Digester;
import cn.hutool.crypto.digest.MD5;
import cn.hutool.crypto.symmetric.AES;
import cn.hutool.crypto.symmetric.DES;

import java.security.KeyPair;
import java.util.Base64;

public class SecureUtilTest {
    public static void main(String[] args) {
        String password = "12345678";
        System.out.println("初始数据为: " + password);
        // 对称加密算法
        // AES
        AES aes = SecureUtil.aes();
        byte[] encrypt1 = aes.encrypt(password);
        System.out.println("使用AES加密后的数据: " + new String(encrypt1));
        byte[] decrypt1 = aes.decrypt(encrypt1);
        System.out.println("使用AES解密后的数据: " + new String(decrypt1));
        // DES
        DES des = SecureUtil.des();
        byte[] encrypt2 = des.encrypt(password);
        System.out.println("使用DES加密后的数据: " + new String(encrypt2));
        byte[] decrypt2 = des.decrypt(encrypt2);
        System.out.println("使用DES解密后的数据: " + new String(decrypt2));

        // 摘要算法
        // MD5
        MD5 md5 = SecureUtil.md5();
        byte[] digest1 = md5.digest(password);
        System.out.println("使用MD5加密后的数据: " + new String(digest1));
        // SHA1
        Digester digester = SecureUtil.sha1();
        byte[] digest2 = digester.digest(password);
        System.out.println("使用SHA1加密后的数据: " + new String(digest2));

        // 非对称加密算法
        // 生成密钥
        KeyPair keyPair = SecureUtil.generateKeyPair("RSA");
        byte[] publicKey = keyPair.getPublic().getEncoded();
        byte[] privateKey = keyPair.getPrivate().getEncoded();
        // RSA
        RSA rsa = SecureUtil.rsa(privateKey,publicKey);
        byte[] encrypt3 = rsa.encrypt(password,KeyType.PublicKey);
        System.out.println("使用RSA公钥加密后的数据: " + new String(encrypt3));
        byte[] decrypt3 = rsa.decrypt(encrypt3, KeyType.PrivateKey);
        System.out.println("使用RSA私钥解密后的数据: " + new String(decrypt3));
    }
}
