package com.elihuang.btctrademachine.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author elihuang
 */
@Controller
public class MarketController {
    /**
     * 获取日志对象，构造函数传入当前类，查找日志方便定位
     */
    private final Logger log = LoggerFactory.getLogger(this.getClass());
    @RequestMapping("/market")
    public String testMarket(Model model) {
        log.info("MarketController log");
//        MarketClient marketClient = MarketClient.create(new HuobiOptions());
//        List<MarketTicker> tickerList = marketClient.getTickers();
//        String tickerStrs = "tickerStrs@@";
//        for (MarketTicker ticker : tickerList){
//            tickerStrs = new StringBuilder().append(tickerStrs).append(ticker.toString()).toString();
//        }
//        model.addAttribute("data", tickerStrs);
        return "marketindex";
    }
}
