package org.example.utils;


import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

public class LoggerUtil {

    /**
     * 获取最原始被调用的堆栈信息
     *
     * @return
     */
    public static StackTraceElement findCaller() {
        // 获取堆栈信息
        StackTraceElement[] callStack = Thread.currentThread().getStackTrace();
        if (null == callStack) return null;

        // 最原始被调用的堆栈信息
        StackTraceElement caller = null;
        // 日志类名称
        String logClassName = LoggerUtil.class.getName();
        // 循环遍历到日志类标识
        boolean isEachLogClass = false;
        // 遍历堆栈信息，获取出最原始被调用的方法信息
        for (StackTraceElement s : callStack) {
            // 遍历到日志类
            if (logClassName.equals(s.getClassName())) {
                isEachLogClass = true;
            }
            // 下一个非日志类的堆栈，就是最原始被调用的方法
            if (isEachLogClass) {
                if (!logClassName.equals(s.getClassName())) {
                    isEachLogClass = false;
                    caller = s;
                    break;
                }
            }
        }
        return caller;
    }

    /**
     * 自动匹配请求类名，生成logger对象，此处 logger name 值为 [className].[methodName]()
     *
     * @return
     */
    private static Logger logger() {
        // 最原始被调用的堆栈对象
        StackTraceElement caller = findCaller();
         return LoggerFactory.getLogger(LoggerUtil.class);
    }


    public static void debug(String msg) {
        debug(msg, null);
    }

    public static void debug(String msg, Throwable e) {
        logger().debug(msg, e);
    }


    public static void warn(String msg) {
        warn(msg, null);
    }

    public static void warn(String msg, Throwable e) {
        logger().warn(msg, e);
    }

    public static void error(String msg) {
        error(msg, null);
    }

    public static void error(String msg, Throwable e) {
        logger().error(msg, e);
    }


}
