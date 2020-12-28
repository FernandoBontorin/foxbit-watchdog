package io.fernandobontorin.foxbitwatchdog.services.foxbit.msg;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MessageFrame {
    private Integer m;
    private Long i;
    private String n;
    private String o;

    public MessageFrame() {
    }

    public MessageFrame(Integer m, Long i, String n, String o) {
        this.m = m;
        this.i = i;
        this.n = n;
        this.o = o;
    }

    public Integer getM() {
        return m;
    }

    public void setM(Integer m) {
        this.m = m;
    }

    public Long getI() {
        return i;
    }

    public void setI(Long i) {
        this.i = i;
    }

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    public String getO() {
        return o;
    }

    public void setO(String o) {
        this.o = o;
    }

    @Override
    public String toString() {
        try {
            return new ObjectMapper().writeValueAsString(this);
        } catch (JsonProcessingException e) {
            return "";
        }
    }
}
