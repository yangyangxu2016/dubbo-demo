package com.uinnova.user;

import com.uinnova.user.bean.UserLoginRequest;
import com.uinnova.user.bean.UserLoginResponse;
import com.uinnova.user.validator.UserValidator;
import org.springframework.stereotype.Service;

/**
 * @author xuyangyang
 */

@Service(value = "userService")
public class UserServiceImpl implements IUserService {

    public UserLoginResponse login(UserLoginRequest request) {
        //参数校验
        UserLoginResponse response = new UserLoginResponse();
        if (UserValidator.checkUserLoginRequest(request)) {
            response.setCode("000000");
            response.setMemo("请求参数校验失败");
            return response;
        }
        if ("root".equals(request.getUsername()) && "root".equals(request.getPassword())) {
            response.setCode("000000");
            return response;
        }
        response.setCode("100002");
        response.setMemo("登录失败，账号或密码错误！");
        return response;
    }
}
