package com.zhu.itoken.common.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class BaseResoult implements Serializable {
    private static final String RESOULT_OK="ok";
    private static final String RESOULT_NOT_OK="not_ok";
    private static final String SUCCESS="成功操作";
    private String resoult;
    private Object data;
    private String success;
    private Cursor cursor;
    private List<Error> errors;

    public static BaseResoult ok(){
        return createBaseResoult(RESOULT_OK,null,SUCCESS, null, null);
    }
    public static BaseResoult ok(Object data){
        return createBaseResoult(RESOULT_OK,data,SUCCESS, null, null);
    }
    public static BaseResoult notok(){
        return createBaseResoult(RESOULT_NOT_OK,null,null, null, null);
    }

    public static BaseResoult notok(List<Error> errors){
        return createBaseResoult(RESOULT_NOT_OK,null,null, null, errors);

    }



    private static BaseResoult createBaseResoult(String resoult, Object data, String success,
    Cursor cursor, List<Error> errors){
        BaseResoult baseResoult = new BaseResoult();
        baseResoult.setResoult(resoult);
        baseResoult.setSuccess(success);
        baseResoult.setData(data);
        baseResoult.setCursor(cursor);
        baseResoult.setErrors(errors);
        return baseResoult;
    }

    @Data
    public static class Cursor{
        private int total;

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public int getOffset() {
            return offset;
        }

        public void setOffset(int offset) {
            this.offset = offset;
        }

        public int getLimit() {
            return limit;
        }

        public void setLimit(int limit) {
            this.limit = limit;
        }

        private int offset;
        private int limit;
    }

    @Data
    public static class Error{
        private String filed;
        private String message;

        public Error(String filed, String message) {
            this.filed = filed;
            this.message = message;
        }

        public String getFiled() {
            return filed;
        }

        public void setFiled(String filed) {
            this.filed = filed;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        @Override
        public String toString() {
            return "Error{" +
                    "filed='" + filed + '\'' +
                    ", message='" + message + '\'' +
                    '}';
        }
    }

    public String getResoult() {
        return resoult;
    }

    public void setResoult(String resoult) {
        this.resoult = resoult;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public Cursor getCursor() {
        return cursor;
    }

    public void setCursor(Cursor cursor) {
        this.cursor = cursor;
    }

    public List<Error> getErrors() {
        return errors;
    }

    public void setErrors(List<Error> errors) {
        this.errors = errors;
    }

    @Override
    public String toString() {
        return "BaseResoult{" +
                "resoult='" + resoult + '\'' +
                ", data=" + data +
                ", success='" + success + '\'' +
                ", cursor=" + cursor +
                ", errors=" + errors +
                '}';
    }
}
