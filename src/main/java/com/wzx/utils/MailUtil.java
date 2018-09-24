package com.wzx.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.internet.MimeMessage;

/**
 * @author WangZX
 * @create 2018-09-21 18:23
 */
@Component
public class MailUtil{
    @Autowired
    private JavaMailSender mailSender;
    public void sendMail(String addr,String subject,String content) throws Exception{
        MimeMessage message = mailSender.createMimeMessage();
        //true代表是multipart类型
        MimeMessageHelper helper = new MimeMessageHelper(message, true);
        helper.setSubject(subject);
        helper.setFrom("l_super_zx@163.com");
        helper.setTo(addr);
        helper.setText(content,true);
        //添加附件
        helper.addAttachment("通知.docx", new FileSystemResource("D:\\develop\\springboot.docx"));
        mailSender.send(message);
    }
}