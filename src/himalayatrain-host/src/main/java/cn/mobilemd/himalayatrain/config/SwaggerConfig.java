package cn.mobilemd.himalayatrain.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    public static final String SWAGGER_SCAN_BASE_PACKAGE = "cn.mobilemd.himalayatrain.api";

    /**
     * 可以定义多个组，比如本类中定义把test和demo区分开了
     * （访问页面就可以看到效果了）
     *
     */
    @Bean
    public Docket testApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage(SWAGGER_SCAN_BASE_PACKAGE))
                .paths(PathSelectors.any())
                .build();
    }
//public static final ApiInfo DEFAULT =
// new ApiInfo("Api Documentation", "Api Documentation", "1.0", "urn:tos", "Contact Email", "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0");
    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfo("SpringBoot学习demo",//大标题
                "基于Springboot+Mybatis+Druid搭建的java项目",//小标题
                "1.0",//版本
                "NO terms of service",
                "Jerry Miao",//作者
                "太美医疗",//链接显示文字
                "http://mobilemd.cn/"//网站链接
        );
        return apiInfo;
    }
}