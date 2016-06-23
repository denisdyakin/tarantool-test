package ru.denisdyakin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.denisdyakin.luaLogic.TarantoolScriptCaller;
import ru.denisdyakin.response.ResponseArray;
import ru.denisdyakin.tarantool.TarantoolTemplate;

import java.util.List;

/**
 * Created by ddyakin on 22.06.16.
 */
@Controller
public class TarantoolController {

    @Autowired
    TarantoolTemplate tarantoolTemplate;

    @Autowired
    TarantoolScriptCaller tarantoolScriptCaller;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getIndex(ModelMap model)
    {
        return "index";
    }

//    @RequestMapping(value = "/array", method = RequestMethod.GET)
//    public @ResponseBody
//    ResponseArray getArray()
//    {
//        tarantoolTemplate.connect("test", "test");
//
//        //init
//        tarantoolScriptCaller.setConnection16(tarantoolTemplate.getConnection16());
//        tarantoolScriptCaller.setLuaFileName("lua/initArray.lua");
//        tarantoolScriptCaller.call();
//
//        //max
//        tarantoolScriptCaller.setLuaFileName("lua/maxElement.lua");
//        List result = (List) tarantoolScriptCaller.call();
//
//        List array = (List) tarantoolScriptCaller.call("lua/selectAllFromTest.lua");
//        return new ResponseArray(result, array);
//    }


}
