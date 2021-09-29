package org.apache.shenyu.springboot.starter.plugin.sureness;


/**
 * @ClassName org.apache.shenyu.springboot.starter.plugin.sureness.SurenessPluginConfiguration
 * Description TODO
 * @Author hqgor
 * @Date 2021/9/2915:45
 * @Version 1.0
 */
@Configuration
public class SurenessPluginConfiguration {
    @Bean
    public ShenyuPlugin surenessPlugin() {
        return new SurenessPlugin();
    }
}
