package com.ttwang.mybatis.util;

public interface FastCopierConverter {
	
	Object convert(Object source, Object target, Class<?> sourceClass,
			Class<?> targetClass, Object context);
	
}
