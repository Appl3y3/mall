package com.appleye.mall.controller;


import com.appleye.mall.common.utils.SignUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Appleye
 * @time 2019/10/14 0014 14:07
 */
@Controller
@RequestMapping("/wechat")
public class WechatSecurityController {
    private static Logger logger = LoggerFactory.getLogger(WechatSecurityController.class);

    @GetMapping("security")
    public void doGet(
            HttpServletRequest request,
            HttpServletResponse response,
            @RequestParam(value = "signature", required = true) String signature,
            @RequestParam(value = "timestamp", required = true) String timestamp,
            @RequestParam(value = "nonce", required = true) String nonce,
            @RequestParam(value = "echostr", required = true) String echostr) {

        PrintWriter out = null;
        try {
            if (SignUtil.checkSignature(signature, timestamp, nonce))
            out = response.getWriter();
            out.print(echostr);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @PostMapping("security")
    public void DoPost() {
        System.out.println("这是post方法！");
    }

}
