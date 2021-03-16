package com.cjs.sso.util;/*
 *@author
 *@data
 *
 */

import javax.naming.AuthenticationException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReturnPage {
   /* private void ReturnPage(HttpServletRequest request, HttpServletResponse response,
                            AuthenticationException exception){
        String strUrl=request.getContextPath()+"/login";
        String errorMsg=exception.getMessage();
        if("Bad credentials".equals(exception.getMessage())){
            errorMsg="密码错误";
        }
        request.getSession().setAttribute("msg",errorMsg);
    }*/
}
