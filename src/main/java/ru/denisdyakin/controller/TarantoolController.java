package ru.denisdyakin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Created by ddyakin on 22.06.16.
 */
@Controller
public class TarantoolController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getIndex(ModelMap model)
    {
        return "index";
    }

}
