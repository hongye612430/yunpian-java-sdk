package com.yunpian.sdk.api;

import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.yunpian.sdk.model.Result;
import com.yunpian.sdk.model.Template;

/**
 * 模版
 * 
 * https://www.yunpian.com/api2.0/api-domestic/tpl_add.html
 * 
 * @author dzh
 * @date Dec 5, 2016 12:33:43 PM
 * @since 1.2.0
 */
public class TestTplApi extends TestYunpianClient {

    @Test
    public void addTest() {
        Map<String, String> param = clnt.newParam(2);
        param.put(TPL_CONTENT, "【云片网】您的验证码是#code#");
        // param.put(NOTIFY_TYPE, "true");
        Result<Template> r = clnt.tpl().add(param);
        System.out.println(r);

        // r = ((TplApi) clnt.tpl().version(VERSION_V1)).add(param);
        // System.out.println(r);
    }

    @Test
    public void getTest() {
        Map<String, String> param = clnt.newParam(1);
        // param.put(tpl_id, "1");
        Result<List<Template>> r = clnt.tpl().get(param);
        System.out.println(r);

        // r = ((TplApi) clnt.tpl().version(VERSION_V1)).get(param);
        // System.out.println(r);
    }

    @Test
    public void delTest() {
        Map<String, String> param = clnt.newParam(1);
        param.put(TPL_ID, "1");
        Result<Template> r = clnt.tpl().del(param);
        System.out.println(r);

        // r = ((TplApi) clnt.tpl().version(VERSION_V1)).del(param);
        // System.out.println(r);
    }

    @Test
    public void get_defaultTest() {
        Map<String, String> param = clnt.newParam(1);
        // param.put(TPL_ID, "1");
        Result<List<Template>> r = clnt.tpl().get_default(param);
        System.out.println(r);

        // r = ((TplApi) clnt.tpl().version(VERSION_V1)).get_default(param);
        // System.out.println(r);
    }

    @Test
    public void updateTest() {
        Map<String, String> param = clnt.newParam(2);
        param.put(TPL_ID, "951");
        param.put(TPL_CONTENT, "【云片网】您的验证码是#code#");
        Result<Template> r = clnt.tpl().update(param);
        System.out.println(r);

        // r = ((TplApi) clnt.tpl().version(VERSION_V1)).update(param);
        // System.out.println(r);
    }

}
