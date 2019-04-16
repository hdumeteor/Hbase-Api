package com.tensor.api.org.service.spark.statistics;

import com.tensor.api.org.enpity.News;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;

/**
 * 统计功能接口
 *
 * @author LightDance
 * @date 2019/4/3
 */
public interface StatisticsService {
    /**
     * 获取词频
     *
     * @param article 文章
     * @return 词频统计结果rdd
     */
    JavaPairRDD<String , Integer> getWordFrequency(News article);
    /**
     * 获取句子频率
     *
     * @param article 文章
     * @return 将整篇文章分成句子后的统计结果rdd
     */
    JavaPairRDD<String , Integer> getSentenceFrequency(News article);
    /**
     * 重载方法，获取句子频率，并指定作为句子分隔符的正则表达式
     *
     * @param article 文章
     * @param splitPattern 分隔符
     * @return 将整篇文章分成句子后的统计结果rdd
     */
    JavaPairRDD<String , Integer> getSentenceFrequency(News article , String splitPattern);
}
