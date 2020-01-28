package com.demo.realm;


import com.demo.entity.Admin;
import com.demo.entity.Customer;
import com.demo.service.AdminService;
import com.demo.service.CustomerService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

public class ShiroRealm extends AuthorizingRealm {

    @Autowired
    private CustomerService customerService;
    @Autowired
    private AdminService adminService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

        String username = (String) authenticationToken.getPrincipal();
        Object credentials = authenticationToken.getCredentials();
        String password = new String((char[]) credentials);
        Customer login = customerService.login(username, password);
        Admin login1 = adminService.login(username, password);
        if (login!=null || login1!=null){
            SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(username, password, "");
            return simpleAuthenticationInfo;
        }

        return null;
    }
}
