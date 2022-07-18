package com.jack.annotations.importdemo;

import com.jack.annotations.importselector.ServiceA;
import com.jack.annotations.importselector.ServiceB;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.function.Predicate;

/**
 * @author lanqiu: lanqiu@deloitte.com.cn
 * Created At: 7/18/2022  5:05 PM
 * <p>
 */
public class HelloImport implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[] {ServiceA.class.getName(), ServiceB.class.getName()};
	}

}
