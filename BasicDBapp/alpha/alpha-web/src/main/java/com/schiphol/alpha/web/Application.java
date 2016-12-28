package com.schiphol.alpha.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackageClasses = {
                PackageMarker.class,
                com.schiphol.alpha.persistence.PackageMarker.class,
                com.schiphol.alpha.service.PackageMarker.class,
                })
@EnableAutoConfiguration(exclude = {
                org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration.class})
@EnableJpaRepositories(basePackageClasses = {com.schiphol.alpha.persistence.repository.ExampleRepository.class})
@EntityScan(basePackageClasses = {com.schiphol.alpha.persistence.entity.Sample.class})
@EnableTransactionManagement(proxyTargetClass = true)
@Slf4j
public class Application {
}