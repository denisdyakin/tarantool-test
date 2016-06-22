package ru.denisdyakin.luaLogic;

import org.tarantool.TarantoolConnection16;
import org.apache.commons.io.IOUtils;

import javax.annotation.PreDestroy;

/**
 * Created by ddyakin on 22.06.16.
 */
public class TarantoolScriptCaller extends AbstractScriptCaller {

    private String luaFileName = null;
    private String script;

    public TarantoolScriptCaller(TarantoolConnection16 connection16Base) {
        super(connection16Base);
    }

    public TarantoolScriptCaller(){}

    public Object call() {
        if (this.luaFileName != null)
        {
            loadScript();
            return getConnection16().eval(script);
        }
        return null;
    }

    public Object call(String luaFileName) {
        if (luaFileName != null)
        {
            this.luaFileName = luaFileName;
            loadScript();
            return getConnection16().eval(script);
        }
       return null;
    }

    private void loadScript()
    {
        try {
            this.script = IOUtils.toString(this.getClass().getClassLoader().getResourceAsStream(this.luaFileName));
        } catch (Exception ex) {
            //log
        }
    }

    public String getLuaFileName() {
        return luaFileName;
    }

    public void setLuaFileName(String luaFileName) {
        this.luaFileName = luaFileName;
    }

    @PreDestroy
    private void closeConnection()
    {
        this.getConnection16().close();
    }

}
