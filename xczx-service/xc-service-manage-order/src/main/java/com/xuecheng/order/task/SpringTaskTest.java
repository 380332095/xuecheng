package com.xuecheng.order.task;

import com.xuecheng.framework.domain.task.XcTask;
import com.xuecheng.order.mq.ChooseCourseTask;
import com.xuecheng.order.service.TaskService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * @author Kiku
 * @date 2019/7/19 10:57
 */

@Component
public class SpringTaskTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(ChooseCourseTask.class);
    //定义任务调试策略
//   @Scheduled(fixedRate = 3000) //在任务开始后3秒执行下一次调度
//   @Scheduled(fixedDelay = 3000) //在任务结束后3秒后才开始执行
//    @Scheduled(cron="0/3 * * * * *")//每隔3秒去执行
    public void task1(){
        LOGGER.info("===============测试定时任务1开始===============");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LOGGER.info("===============测试定时任务1结束===============");

    }

    //定义任务调试策略
//    @Scheduled(cron="0/3 * * * * *")//每隔3秒去执行
//    @Scheduled(fixedRate = 3000) //在任务开始后3秒执行下一次调度
//    @Scheduled(fixedDelay = 3000) //在任务结束后3秒后才开始执行
    public void task2(){
        LOGGER.info("===============测试定时任务2开始===============");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LOGGER.info("===============测试定时任务2结束===============");

    }
}
