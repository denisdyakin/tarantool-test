package ru.denisdyakin.luaLogic;

import org.tarantool.TarantoolConnection16;
import org.tarantool.TarantoolConnection16Base;

/**
 * Created by ddyakin on 22.06.16.
 */
public abstract class AbstractScriptCaller {

    private TarantoolConnection16 connection16;

    public AbstractScriptCaller(){}

    public AbstractScriptCaller(TarantoolConnection16 connection16) {
        this.connection16 = connection16;
    }

    public abstract Object call();

    public TarantoolConnection16 getConnection16()
    {
        return this.connection16;
    }

    public void setConnection16(TarantoolConnection16 connection16) {
        this.connection16 = connection16;
    }
}
