package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan( // AppConfig.class 는 조회되면 안되기 때문에 아래처럼 설정함. (기존 예제코드 남겨두기 위해)
        basePackages = "hello.core", // 이거 지정하나 안하나 똑같음. @ComponentScan가 hello.core 패키지에 있으니!
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {


}
