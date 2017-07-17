package com.myapp;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/7/17
 */
@Configuration
@ComponentScan(excludeFilters = {@Filter(type = FilterType.ANNOTATION,value = Configuration.class)})
public class ComponentScannedConfig {
}
