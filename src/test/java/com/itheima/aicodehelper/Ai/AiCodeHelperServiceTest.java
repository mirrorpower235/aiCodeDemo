package com.itheima.aicodehelper.Ai;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class AiCodeHelperServiceTest {
    @Resource
    private AiCodeHelperService aiCodeHelperService;
    @Test
    void chat() {
        String result = aiCodeHelperService.chat("你好，你是谁");
        System.out.println(result);
    }
    @Test
    void chatWithMemory() {
        String result = aiCodeHelperService.chat("我是谁");
        System.out.println(result);
        result = aiCodeHelperService.chat("我是mirror");
        System.out.println(result);
        result = aiCodeHelperService.chat("我是谁");
        System.out.println(result);
    }

    @Test
    void chatForReport() {
        String useMessage  = "我在学习java,g给我一份学习报告";
        AiCodeHelperService.Report report =aiCodeHelperService.chatForReport("我正在学习java");
        System.out.println(report);
    }

    @Test
    void chatWithRag() {
//        String useMessage  = "怎样学习java，有哪些常见的面试题";
        String report =aiCodeHelperService.chat("怎样学习java，有哪些常见的面试题");
        System.out.println(report);
    }
}