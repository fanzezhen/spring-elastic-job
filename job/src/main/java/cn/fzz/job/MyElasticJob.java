package cn.fzz.job;

import com.dangdang.ddframe.job.api.JobExecutionMultipleShardingContext;
import com.dangdang.ddframe.job.plugin.job.type.simple.AbstractSimpleElasticJob;

import java.util.List;
import java.util.Map;

public class MyElasticJob extends AbstractSimpleElasticJob {

    public MyElasticJob() {
        System.out.println("MyElasticJob");
    }

    @Override
    public void process(JobExecutionMultipleShardingContext context) {
        System.out.println("context:"+context);
//        String param=context.getJobParameter();
//        Map<Integer, String> map=context.getShardingItemParameters();
//        List<Integer> list=context.getShardingItems();
//        String name=context.getJobName();
//        Map<Integer, String> offset=context.getOffsets();
//        System.out.println(System.currentTimeMillis()/1000+":"+param+",map:"+map+",list:"+list+",name:"+name+",offset:"+offset);
    }

}