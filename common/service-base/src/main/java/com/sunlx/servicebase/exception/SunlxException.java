package com.sunlx.servicebase.exception;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SunlxException extends RuntimeException {

    @ApiModelProperty("状态码")
    private Integer code;

    private String msg;

}
