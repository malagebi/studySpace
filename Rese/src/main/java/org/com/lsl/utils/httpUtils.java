package org.com.lsl.utils;


import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class httpUtils {
    public static void httpPost(String url) {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpPost post = new HttpPost(url);
        RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(30000).setConnectTimeout(30000).build();
        post.setConfig(requestConfig);
        post.setHeader("Content-Type", " application/json; charset=UTF-8");

        List<NameValuePair> formparams = new ArrayList<NameValuePair>();
        formparams.add(new BasicNameValuePair("username", "admin"));
        formparams.add(new BasicNameValuePair("password", "123456"));
        UrlEncodedFormEntity uefEntity;

        try {
            uefEntity = new UrlEncodedFormEntity(formparams, "UTF-8");
            post.setEntity(uefEntity);
            CloseableHttpResponse resp = httpclient.execute(post);
            HttpEntity entity = resp.getEntity();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(entity.getContent()));
            System.out.println(entity.getContentType());
            System.out.println(entity.getContentEncoding());
            String val = "";
            while ((val = bufferedReader.readLine()) != null) {

            }
            System.out.println(EntityUtils.toString(entity));
            resp.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        //贝蒂测试冲突
        httpPost("http://www.baidu.com");
        //远程测试冲突123
        //远程测试冲突456
        //就是测试1
        //呵呵哒
        //我磊哥擦擦
    }
}
