package com.dapeng.flow.workhour.utils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class HttpUtils
{
  private static Log log = LogFactory.getLog(HttpUtils.class);
  private static PoolingHttpClientConnectionManager cm;
  private static String EMPTY_STR = "";

  private static void init() {
    if (cm == null) {
      cm = new PoolingHttpClientConnectionManager();
      cm.setMaxTotal(50);
      cm.setDefaultMaxPerRoute(5);
    }
  }

  public static String httpPostRequest(String url)
    throws UnsupportedEncodingException
  {
    return httpPostRequest(url, null, null, null);
  }

  public static String httpPostRequest(String url, String jsonData, String enc)
    throws UnsupportedEncodingException
  {
    return httpPostRequest(url, null, jsonData, enc);
  }

  public static String httpPostRequest(String url, Map<String, Object> headers, String jsonData, String enc)
    throws UnsupportedEncodingException
  {
    HttpPost httpPost = new HttpPost(url);
    if (headers != null) {
      for (Map.Entry param : headers.entrySet()) {
        httpPost.addHeader((String)param.getKey(), String.valueOf(param.getValue()));
      }
    }
    if (jsonData != null) {
      if (enc == null) enc = "UTF-8";
      StringEntity stringEntity = new StringEntity(jsonData, enc);
      httpPost.setEntity(stringEntity);
    }
    return getResult(httpPost);
  }

  public static String httpPutRequest(String url, Map<String, Object> headers, String jsonData, String enc)
    throws UnsupportedEncodingException
  {
    HttpPut httpPut = new HttpPut(url);
    if (headers != null) {
      for (Map.Entry param : headers.entrySet()) {
        httpPut.addHeader((String)param.getKey(), String.valueOf(param.getValue()));
      }
    }
    if (jsonData != null) {
      if (enc == null) enc = "UTF-8";
      StringEntity stringEntity = new StringEntity(jsonData, enc);
      httpPut.setEntity(stringEntity);
    }

    return getResult(httpPut);
  }

  public static String httpDeleteRequest(String url, Map<String, Object> headers, String enc) throws UnsupportedEncodingException
  {
    HttpDelete httpDelete = new HttpDelete(url);
    if (headers != null) {
      for (Map.Entry param : headers.entrySet()) {
        httpDelete.addHeader((String)param.getKey(), String.valueOf(param.getValue()));
      }
    }
    return getResult(httpDelete);
  }

  public static String httpGetRequest(String url)
  {
    HttpGet httpGet = new HttpGet(url);
    return getResult(httpGet);
  }

  public static String httpGetRequest(String url, Map<String, Object> params, String enc)
    throws ClientProtocolException, IOException, URISyntaxException
  {
    URIBuilder ub = new URIBuilder();
    ub.setPath(url);
    List pairs = covertParams2NVPS(params);
    ub.setParameters(pairs);
    HttpGet httpGet = new HttpGet(ub.build());
    return getResult(httpGet);
  }

  public static String httpGetRequest(String url, Map<String, Object> headers, Map<String, Object> params, String enc)
    throws URISyntaxException
  {
    URIBuilder ub = new URIBuilder();
    ub.setPath(url);

    List pairs = covertParams2NVPS(params);
    ub.setParameters(pairs);

    HttpGet httpGet = new HttpGet(ub.build());
    for (Map.Entry param : headers.entrySet()) {
      httpGet.addHeader((String)param.getKey(), String.valueOf(param.getValue()));
    }
    return getResult(httpGet);
  }

  private static List<NameValuePair> covertParams2NVPS(Map<String, Object> params)
  {
    ArrayList pairs = new ArrayList();
    for (Map.Entry param : params.entrySet()) {
      pairs.add(new BasicNameValuePair((String)param.getKey(), String.valueOf(param.getValue())));
    }

    return pairs;
  }

  private static String getResult(HttpRequestBase request)
  {
    CloseableHttpClient httpClient = getHttpClient();
    try {
      CloseableHttpResponse response = httpClient.execute(request);
      if (response.getStatusLine().getStatusCode() == 200) {
        HttpEntity entity = response.getEntity();
        if (entity != null)
        {
          String result = EntityUtils.toString(entity);
          response.close();
          String str1 = result;
          return str1;
        }
      }
    } catch (ClientProtocolException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    finally
    {
    }
    return EMPTY_STR;
  }

  private static CloseableHttpClient getHttpClient()
  {
    init();
    return HttpClients.custom().setConnectionManager(cm).build();
  }
}