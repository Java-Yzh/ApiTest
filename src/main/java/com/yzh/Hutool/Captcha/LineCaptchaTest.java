package com.yzh.Hutool.Captcha;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.LineCaptcha;

import java.awt.image.BufferedImage;
import java.io.File;

public class LineCaptchaTest {
    public static void main(String[] args) {
        LineCaptcha lineCaptcha = CaptchaUtil.createLineCaptcha(200,100);
        //生成验证码和验证码图片
        lineCaptcha.createCode();
        //获取验证码
        String code = lineCaptcha.getCode();
        System.out.println(code);
        //保存验证码图片
        lineCaptcha.write(new File("src/main/resources/CaptchaImages/" + "lineCaptchaImage-" + code + ".png"));
    }
}
