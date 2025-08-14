package com.yzh.Hutool.Captcha;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.CircleCaptcha;

import java.io.File;

public class CircleCaptchaTest {
    public static void main(String[] args) {
        CircleCaptcha circleCaptcha = CaptchaUtil.createCircleCaptcha(200,100);
        circleCaptcha.createCode();
        String code = circleCaptcha.getCode();
        System.out.println(code);
        circleCaptcha.write(new File("src/main/resources/CaptchaImages/" + "CircleCaptchaImage-" + code + ".png"));
    }
}
