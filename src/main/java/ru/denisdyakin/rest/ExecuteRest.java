package ru.denisdyakin.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.denisdyakin.luaLogic.TarantoolScriptCaller;
import ru.denisdyakin.tarantool.TarantoolTemplate;

import java.util.List;

/**
 * Created by ddyakin on 23.06.16.
 */
@RestController
public class ExecuteRest {

    @Autowired
    TarantoolTemplate tarantoolTemplate;

    @Autowired
    TarantoolScriptCaller tarantoolScriptCaller;

    @RequestMapping(value = "/executeLua", method = RequestMethod.POST)
    public List executeLua(@RequestParam String code)
    {
        tarantoolTemplate.connect("test", "test");

        //init
        tarantoolScriptCaller.setConnection16(tarantoolTemplate.getConnection16());

        return (List) tarantoolScriptCaller.executeCode(code);
    }

}
