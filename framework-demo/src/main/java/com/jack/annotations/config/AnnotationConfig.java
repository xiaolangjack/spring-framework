package com.jack.annotations.config;

import com.jack.annotations.importdemo.HelloImport;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author lanqiu: lanqiu@deloitte.com.cn
 * Created At: 7/18/2022  5:03 PM
 * <p>
 */
@Configuration
@Import(HelloImport.class)
public class AnnotationConfig {

}
