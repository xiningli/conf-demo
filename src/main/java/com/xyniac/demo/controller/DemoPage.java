package com.xyniac.demo.controller;
import com.xyniac.abstractconfig.AbstractDynamicConfig$;
import com.xyniac.demo.conf.ServerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoPage {

    @RequestMapping(value = "/name", method = RequestMethod.GET)
    @ResponseBody
    public String getName() {
        return ServerConfig.getInstance().getName();
    }

    @RequestMapping(value = "/configView", method = RequestMethod.GET)
    @ResponseBody
    public String get() {
        return AbstractDynamicConfig$.MODULE$.checkAllConfig().toString();
    }

}
