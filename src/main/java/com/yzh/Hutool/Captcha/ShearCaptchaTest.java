package com.yzh.Hutool.Captcha;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.ShearCaptcha;

import java.io.File;

public class ShearCaptchaTest {
    public static void main(String[] args) {
        ShearCaptcha shearCaptcha = CaptchaUtil.createShearCaptcha(200,100);
        shearCaptcha.createCode();
        String code = shearCaptcha.getCode();
        System.out.println(code);
        shearCaptcha.write(new File("src/main/resources/CaptchaImages/" + "ShearCaptchaImage-" + code + ".png"));
    }
}
