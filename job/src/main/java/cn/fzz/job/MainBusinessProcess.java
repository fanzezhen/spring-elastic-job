package cn.fzz.job;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainBusinessProcess {

    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
    }

}
