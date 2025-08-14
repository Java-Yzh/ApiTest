package com.yzh.Hutool.QrCode;

import cn.hutool.extra.qrcode.QrCodeUtil;
import cn.hutool.extra.qrcode.QrConfig;

import java.awt.*;
import java.io.File;

public class QrCodeTest1 {
    public static void main(String[] args) {
        // 生成普通二维码
        // 定义二维码配置
        QrConfig config = new QrConfig(300, 300);
        // 设置边距，既二维码和背景之间的边距
        config.setMargin(10);
        // 设置前景色，既二维码颜色
        config.setForeColor(Color.BLUE.getRGB());
        // 设置背景色，既二维码背景颜色
        config.setBackColor(Color.GRAY.getRGB());
        //生成二维码文件
        QrCodeUtil.generate("www.baidu.com",config, new File("src/main/resources/QrCodeImages/qrcode1.png"));
    }
}
