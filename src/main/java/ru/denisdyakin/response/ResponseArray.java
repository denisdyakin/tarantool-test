package ru.denisdyakin.response;

import java.util.List;

/**
 * Created by ddyakin on 22.06.16.
 */
public class ResponseArray {

    private List array;

    private List result;

    public ResponseArray(List result, List array) {
        this.result = result;
        this.array = array;
    }

    public List getArray() {
        return array;
    }

    public void setArray(List array) {
        this.array = array;
    }

    public List getResult() {
        return result;
    }

    public void setResult(List result) {
        this.result = result;
    }
}
