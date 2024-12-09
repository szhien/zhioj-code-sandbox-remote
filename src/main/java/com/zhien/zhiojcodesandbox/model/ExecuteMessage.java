package com.zhien.zhiojcodesandbox.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Zhien
 * @version 1.0
 * @name ExecuteMessage
 * @description 进程执行返回信息
 * @createDate 2024/11/18 16:11
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExecuteMessage {
    // 进程执行返回码
    private int exitValue;

    // 进程执行返回成功信息
    private String message;

    // 进程执行错误信息
    private String errorMessage;

    // 执行时间
    private Long executeTime;

    // 占用内存
    private Long usageMemory;

}
