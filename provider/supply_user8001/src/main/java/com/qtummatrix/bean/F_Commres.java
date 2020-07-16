package com.qtummatrix.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class F_Commres<T> {
    private Integer code;//编码
    private String msg;//信息
    private T   data;

    public F_Commres(Integer code, String msg)
    {
        this(code,msg,null);
    }

    public F_Commres(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}

