package com.rabbit.ucenter.model.vo;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName SysUserVo
 * @Description 用户视图
 * @Author LZQ
 * @Date 2019/1/20 15:58
 **/
public class SysUserVo implements Serializable {

    private String id;
    private String loginName;
    private String name;
    private String no;
    private String officeId;
    private String officeName;
    private DataScopes dataScopes;
    private List<Role> roleList;
    private List<App> appList;

    public String getNo()
    {
        return this.no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public List<App> getAppList() {
        return this.appList;
    }

    public void setAppList(List<App> appList) {
        this.appList = appList;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginName() {
        return this.loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getOfficeId() {
        return this.officeId;
    }

    public void setOfficeId(String officeId) {
        this.officeId = officeId;
    }

    public List<Role> getRoleList() {
        return this.roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }

    public String getOfficeName() {
        return this.officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public DataScopes getDataScopes() {
        return this.dataScopes;
    }

    public void setDataScopes(DataScopes dataScopes) {
        this.dataScopes = dataScopes;
    }

    public static enum DataScopes
            implements Serializable
    {
        ALL(1, "所有数据"), DEPANDALL(4, "所在部门及以下数据"), DEP(5, "所在部门数据"), SELF(8, "仅本人数据");

        private int code;
        private String description;

        private DataScopes(int code, String description) { this.code = new Integer(code).intValue();
            this.description = description; }

        public static DataScopes getByCode(int code)
        {
            for (DataScopes dataScopes : values()) {
                if (code == dataScopes.getCode()) {
                    return dataScopes;
                }
            }
            return null;
        }

        public int getCode() {
            return this.code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getDescription() {
            return this.description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }

    public class App
            implements Serializable
    {
        private String id;
        private String appName;
        private String code;
        private String url;
        private int sort;

        public App()
        {
        }

        public String getCode()
        {
            return this.code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public int getSort() {
            return this.sort;
        }

        public void setSort(int sort) {
            this.sort = sort;
        }

        public String getId() {
            return this.id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getAppName() {
            return this.appName;
        }

        public void setAppName(String appName) {
            this.appName = appName;
        }

        public String getUrl() {
            return this.url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }

    public class Role
            implements Serializable
    {
        private String id;
        private String roleName;

        public Role()
        {
        }

        public String getId()
        {
            return this.id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getRoleName() {
            return this.roleName;
        }

        public void setRoleName(String roleName) {
            this.roleName = roleName;
        }
    }

    public static class User
            implements Serializable
    {
        private String id;
        private String loginName;
        private String name;
        private String no;
        private String officeId;
        private String officeName;

        public String getNo()
        {
            return this.no;
        }

        public void setNo(String no) {
            this.no = no;
        }

        public String getId() {
            return this.id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getLoginName() {
            return this.loginName;
        }

        public void setLoginName(String loginName) {
            this.loginName = loginName;
        }

        public String getOfficeId() {
            return this.officeId;
        }

        public void setOfficeId(String officeId) {
            this.officeId = officeId;
        }

        public String getOfficeName() {
            return this.officeName;
        }

        public void setOfficeName(String officeName) {
            this.officeName = officeName;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
