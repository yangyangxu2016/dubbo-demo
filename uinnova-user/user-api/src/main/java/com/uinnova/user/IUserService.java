package com.uinnova.user;

import com.uinnova.user.bean.Response;
import com.uinnova.user.bean.UserLoginRequest;

/**
 * @author xuyangyang
 */
public interface IUserService {

    Response login(UserLoginRequest request);
}
