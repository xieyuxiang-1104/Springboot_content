package xie.controller;

import com.alibaba.fastjson.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import xie.pojo.Content;
import xie.service.ContentService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/content")
public class testContent {
    @Autowired
    @Qualifier("contentServiceimp")
    public ContentService contentService;

    /*查询*/
    @RequestMapping(value = "/getList",method = RequestMethod.GET)
    @ResponseBody
    public String getList(){
        List<Content> list= contentService.selectcont(null);
        List<Object> l=new ArrayList<>();
        for(int a =0;a<list.size();a++){
            l.add(list.get(a));
        }
        JSONArray json =new JSONArray(l);
        System.out.println(json.toJSONString());
        return json.toJSONString();
    }



    /*评论*/
    @RequestMapping(value = "subMit")
    @ResponseBody
    public String subMit( Content c ){
        Integer i=contentService.insertContent(c);
        if (i==1){
            return "{\"success\":true,\"msg\":\"评论成功\"}";

        }
        return "{\"success\":false,\"msg\":\"评论失败\"}";
    }


}
