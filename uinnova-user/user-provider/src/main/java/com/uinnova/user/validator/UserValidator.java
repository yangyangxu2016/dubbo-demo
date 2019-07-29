package com.uinnova.user.validator;

import com.uinnova.user.bean.UserLoginRequest;
import org.springframework.util.StringUtils;

/**
 * @author xuyangyang
 */
public class UserValidator {


    public static boolean checkUserLoginRequest(UserLoginRequest request) {
        if (StringUtils.isEmpty(request.getUsername()) || StringUtils.isEmpty(request.getPassword())) {
            return false;
        }
        return true;
    }
}
