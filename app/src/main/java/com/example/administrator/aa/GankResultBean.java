package com.example.administrator.aa;

import java.util.List;

/**
 * Created by Administrator on 2017/10/11.
 */

public class GankResultBean {


    /**
     * error : false
     * results : [{"_id":"59db479d421aa94e032b1ea6","createdAt":"2017-10-09T17:55:41.830Z","desc":"Kotlin 语言下设计模式的不同实现","publishedAt":"2017-10-10T12:41:34.882Z","source":"web","type":"Android","url":"http://johnnyshieh.me/posts/kotlin-design-pattern-impl/","used":true,"who":"Johnny Shieh"},{"_id":"59db4f71421aa94e04c2adc4","createdAt":"2017-10-09T18:29:05.420Z","desc":"Kotlin 1.2 Beta 发布了","publishedAt":"2017-10-10T12:41:34.882Z","source":"web","type":"Android","url":"https://mp.weixin.qq.com/s/INbaqAjjY5AlmGvKg7_6pw","used":true,"who":" Thunder Bouble"},{"_id":"59db52ab421aa94e032b1ea7","createdAt":"2017-10-09T18:42:51.991Z","desc":"一个用 Kotlin 实现的简单 Material design  的\u201c滑动解锁\u201d小部件","publishedAt":"2017-10-10T12:41:34.882Z","source":"web","type":"Android","url":"https://github.com/cortinico/slidetoact","used":true,"who":" Thunder Bouble"},{"_id":"59db6938421aa94e0053bdd9","createdAt":"2017-10-09T20:19:04.768Z","desc":"See what the GitHub community is most excited about today.","images":["http://img.gank.io/daf8a302-11e2-45a5-a54b-448b7847fba0"],"publishedAt":"2017-10-10T12:41:34.882Z","source":"web","type":"Android","url":"https://github.com/Werb/G-Trending","used":true,"who":"Werb"},{"_id":"59dc3296421aa94e07d1848d","createdAt":"2017-10-10T10:38:14.886Z","desc":"Android 彻底组件化 demo 发布","publishedAt":"2017-10-10T12:41:34.882Z","source":"web","type":"Android","url":"http://mp.weixin.qq.com/s/aWUixHMhU8g0W4dapr0HPg","used":true,"who":null},{"_id":"59dc4dd0421aa94e07d1848e","createdAt":"2017-10-10T12:34:24.701Z","desc":"Android 展开型布局菜单。","images":["http://img.gank.io/b39a4adf-b48a-4f2e-990f-b672027bf643","http://img.gank.io/a7b25e90-63ba-4703-bd6c-dc4483fa5172"],"publishedAt":"2017-10-10T12:41:34.882Z","source":"chrome","type":"Android","url":"https://github.com/iammert/ScalingLayout","used":true,"who":"代码家"},{"_id":"59cb9375421aa972879d1218","createdAt":"2017-09-27T20:03:01.65Z","desc":"Transition学习笔记","publishedAt":"2017-10-09T13:07:56.458Z","source":"web","type":"Android","url":"http://rkhcy.github.io/2017/09/27/TransitionNote2/","used":true,"who":"HuYounger"},{"_id":"59cf9a87421aa972845f20aa","createdAt":"2017-09-30T21:22:15.570Z","desc":"A retrofit extension written in kotlin","publishedAt":"2017-10-09T13:07:56.458Z","source":"web","type":"Android","url":"https://github.com/jaychang0917/SimpleApiClient","used":true,"who":"Jay"},{"_id":"59d05467421aa974b047d425","createdAt":"2017-10-01T10:35:19.789Z","desc":"知乎 x RxJava Meetup 活动 PPT。","images":["http://img.gank.io/404c29df-df48-4c43-aaec-b60fa1256388"],"publishedAt":"2017-10-09T13:07:56.458Z","source":"chrome","type":"Android","url":"https://github.com/zhihu/zhihu-rxjava-meetup","used":true,"who":"代码家"},{"_id":"59d45ebe421aa94e04c2adb7","createdAt":"2017-10-04T12:08:30.118Z","desc":"What are Coroutines in Kotlin?","publishedAt":"2017-10-09T13:07:56.458Z","source":"web","type":"Android","url":"https://blog.mindorks.com/what-are-coroutines-in-kotlin-bf4fecd476e9","used":true,"who":"AMIT SHEKHAR"}]
     */

    private boolean error;
    private List<ResultsBean> results;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "GankResultBean{" +
                "error=" + error +
                ", results=" + results +
                '}';
    }
}
