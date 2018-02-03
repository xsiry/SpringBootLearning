package com.x.proc.utils;

/**
 * Created by IntelliJ IDEA.
 * User: xsiry
 * Date: 03/02/2018
 * Time: 10:52 AM
 */

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.x.proc.entity.sys.SysUser;
import org.apache.log4j.Logger;
import org.springframework.web.util.WebUtils;

import sun.misc.BASE64Encoder;


/**
 * WEB帮助类
 * SQL查询帮助类
 * 页面客户端设置
 *
 * @author bxh
 */
public class AppHelper {

    private static final Logger logger = Logger.getLogger(AppHelper.class);

    public static final String SessUsid = "AdPublishSid";

    private static final Map<String, Object> sessionMap = new HashMap<>();

    public static void saveSession(HttpServletRequest request, Object object) {
        WebUtils.setSessionAttribute(request, SessUsid, object);
    }

//	 public static Sys_User getSessionUser(HttpServletRequest request){
//		 Object obj = sessionMap.get(SessUsid) ;
//		 if (obj!=null ){
//			 return (Sys_User)obj ;
//		 }
//
////		 Cookie[] cookies = request.getCookies();
////	     if(null!=cookies){
////	         for(Cookie cookie : cookies){
////	        	Object obj = sessionMap.get(cookie.getName());
////	        	if (obj!=null){
////	        		return (Sys_User)obj ;
////	        	}
////	         }
////	     }
//	     return null ;
//	 }


    public static SysUser getSessionUser(HttpServletRequest request) {
        Object obj = WebUtils.getSessionAttribute(request, SessUsid);
        return obj != null ? (SysUser) obj : null;
    }

    public static void removeSessionUser(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        if (session != null) {
            session.removeAttribute(SessUsid);
            session.invalidate();
        }
    }


    /**
     * 设置cookie
     *
     * @param response
     * @param name     cookie名字
     * @param value    cookie值
     * @param maxAge   cookie生命周期  以秒为单位
     */
    public static void addCookie(HttpServletResponse response, String name, String value, int maxAge) {
        Cookie cookie = new Cookie(name, value);
        cookie.setPath("/");
        if (maxAge > 0) cookie.setMaxAge(maxAge);
        response.addCookie(cookie);
    }

    /**
     * 根据名字获取cookie
     *
     * @param request
     * @param name    cookie名字
     * @return
     */
    public static Cookie getCookieByName(HttpServletRequest request, String name) {
        Map<String, Cookie> cookieMap = ReadCookieMap(request);
        if (cookieMap.containsKey(name)) {
            Cookie cookie = (Cookie) cookieMap.get(name);
            return cookie;
        } else {
            return null;
        }
    }

    /**
     * 将cookie封装到Map里面
     *
     * @param request
     * @return
     */
    private static Map<String, Cookie> ReadCookieMap(HttpServletRequest request) {
        Map<String, Cookie> cookieMap = new HashMap<String, Cookie>();
        Cookie[] cookies = request.getCookies();
        if (null != cookies) {
            for (Cookie cookie : cookies) {
                cookieMap.put(cookie.getName(), cookie);
            }
        }
        return cookieMap;
    }

    public static String MD5(String pwd) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        //确定计算方法
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        BASE64Encoder base64en = new BASE64Encoder();
        //加密后的字符串
        String newstr = base64en.encode(md5.digest(pwd.getBytes("utf-8")));
        return newstr;
    }
}

