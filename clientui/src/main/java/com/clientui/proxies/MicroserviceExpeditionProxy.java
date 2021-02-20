package com.clientui.proxies;

import com.clientui.beans.ExpeditionBean;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "zuul-server")
@RibbonClient(name = "microservice-expedition")
public interface MicroserviceExpeditionProxy {

    @PostMapping(value = "/microservice-expedition/expeditions")
    ExpeditionBean addExpedition(@RequestBody ExpeditionBean expedition);

    @GetMapping(value = "/microservice-expedition/expeditions")
    List<ExpeditionBean> listAll();

    @GetMapping(value = "/microservice-expedition/expeditions/{id}")
    ExpeditionBean getStatus(@PathVariable("id") int id);

}
