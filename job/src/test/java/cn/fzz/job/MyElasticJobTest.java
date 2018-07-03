package cn.fzz.job;

import org.junit.Test;
import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Created by fanzezhen on 2018/7/2.
 * Desc:
 */

public class MyElasticJobTest {
    @Test
    public void test(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/spring/applicationContext.xml");
        System.out.println(ctx);
    }
}
