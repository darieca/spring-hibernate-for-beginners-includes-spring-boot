package com.luv2code.springdemo.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CourseCodeContraintValidator.class)
@Target( {ElementType.METHOD, ElementType.FIELD  })
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
	
	// define default course code value and message
	public String value() default "LUV";
	public String message() default "must start with LUV";
	
	// define default groups
	public Class<?>[] groups() default {};
	
	// define defalt payload (error message)
	public Class<? extends Payload>[] payload() default{};

}
