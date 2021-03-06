package com.project.trackzilla.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    private static final String SNAPSHOT = "1.0-SNAPSHOT";
    private static final String HTTP_WWW_APACHE_ORG_LICENSES_LICENSE_2_0_HTML = "Usage of these application code is forbidden without creator's approval";
    private static final String APACHE_2_0 = "Apache 2.0";

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiEndPointsInfo());
    }

    private ApiInfo apiEndPointsInfo() {

        return new ApiInfoBuilder().title("Api Documentation")
                .contact(new Contact("Daniela Beltran", null,  "danielamarcelabeltran@gmail.com"))
                .license(APACHE_2_0)
                .licenseUrl(HTTP_WWW_APACHE_ORG_LICENSES_LICENSE_2_0_HTML)
                .version(SNAPSHOT)
                .build();
    }
}
