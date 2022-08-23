package com.oracle.controller;

import com.oracle.car.service.api.CarOrderServiceApi;
import com.oracle.pojo.vo.CarOrderNumVo;
import com.oracle.pojo.vo.Page;
import com.oracle.pojo.vo.RepertoryBo;
import com.oracle.repertory.service.api.RepertoryServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

/**
 * @author ltcstart
 * @date 2022/8/23 - 10:49
 */
@Controller
@RequestMapping("/admin/stock")
public class RepertoryController {

    @Autowired(required = false)
    private RepertoryServiceApi repertoryServiceApi;

    @Autowired(required = false)
    private CarOrderServiceApi carOrderServiceApi;

    @RequestMapping("/list")
    public String list(@RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum,
                       @RequestParam(value = "pageSize",defaultValue = "5")Integer pageSize,
                       Model model){
        Page<List<RepertoryBo>> pageInfo = this.repertoryServiceApi.getRepertoryListPage(pageNum, pageSize);
        model.addAttribute("pageInfo",pageInfo);
        return "";
    }


    @RequestMapping("/carSalesLineChart")
    public String carSalesLineChart(Model model){
        List<CarOrderNumVo> list = this.carOrderServiceApi.getList();
        model.addAttribute("list",list);
        return "repertory/CarSalesLineChart";
    }
}
