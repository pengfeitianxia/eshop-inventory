package com.roncoo.eshop.cache.ha.Controller;

import com.roncoo.eshop.cache.ha.util.HttpClientUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/8/28 0028.
 */
@Controller
public class CacheController {
    @RequestMapping("/change/product")
    @ResponseBody
    public String changeProduct(Long productId){
        String url = "http://127.0.0.1:8080/getProductInfo?productId=" + productId;
        String response = HttpClientUtils.sendGetRequest(url);
        System.out.println(response);
        return "success";
    }
}
