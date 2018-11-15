package com.draper.common.aspect;

import com.github.pagehelper.util.StringUtil;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Aspect
@Component
public class NotNullAspect {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Pointcut("execution(* com.draper.web.*.*(String,..))")
    public void pointCut() {
    }

    @Before("pointCut()")
    public void before(JoinPoint joinPoint) {
        LOGGER.warn("切面捕获");
        int length = joinPoint.getArgs().length;
        for (int i = 0; i < joinPoint.getArgs().length; i++) {
            if (!StringUtils.hasText(joinPoint.getArgs()[i].toString()))
                new IllegalArgumentException("Parameter should not be null");
        }


        LOGGER.warn("DeclaringType = {}", joinPoint.getSignature().getDeclaringType().toString());
        LOGGER.warn("Name = {}", joinPoint.getSignature().getName());
        LOGGER.warn("Args = {}", joinPoint.getArgs().toString());
        LOGGER.warn("length =  {}", length);
        LOGGER.warn("arg1 = {}", joinPoint.getArgs()[0].toString());
        LOGGER.warn("arg2 = {}", joinPoint.getArgs()[1].toString());
    }
}
