package space.qmen.lot;

/**
 * Created by Luo_0412 on 2017/5/1.
 */
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Spring Boot 应用启动类
 *
 * Created by bysocket on 16/4/26.
 */
// Spring Boot 应用的标识
@SpringBootApplication

// 此注解解决 Unable to infer base url
//@EnableSwagger2

// mapper 接口类扫描包配置
@ComponentScan(basePackages={"space.qmen.lot"})
@MapperScan("space.qmen.lot.mapper")
public class ApiApplication {

    public static void main(String[] args) {
        // 程序启动入口
        // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
        SpringApplication.run(ApiApplication.class, args);
    }

}