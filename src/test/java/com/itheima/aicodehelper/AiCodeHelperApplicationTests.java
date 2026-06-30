package com.itheima.aicodehelper;

import com.itheima.aicodehelper.Ai.AiCodeHelper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import jakarta.annotation.Resource;

@SpringBootTest
class AiCodeHelperApplicationTests {

//    @Test
//    void contextLoads() {
//    }
    @Resource
    private AiCodeHelper aicodeHelper;
    @Test
    void chat() {
        aicodeHelper.chat("helloworld");
    }
}
