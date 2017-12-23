package dm.dao;

import java.sql.*;
import java.util.List;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

@SuppressWarnings("unchecked")
public class BaseDao {
	public static Connection getCon() {
        PreparedStatement ps=null;     
        Connection ct=null;
        ResultSet rs=null;
        try {
            //1. 加载驱动
        	String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            String url="jdbc:sqlserver://localhost:1433;databaseName=Dorm_System";
            String user="sa";//sa 超级管理员
            String password="0000";// 密码
            Class.forName(driver);
            //2. 连接
            ct=DriverManager.getConnection(url,user,password);
        } catch (ClassNotFoundException | SQLException e) {
        }finally{
            try {
                if(rs!=null){
                    rs.close();
                }
                if(ps!=null){
                    ps.close();
                }
            } catch (Exception e) {
            }
        }
        return ct;
    }
	/**
     * 执行更新的sql语句,插入,修改,删除
     * @param sql
     * @param params
     * @return
     */
 
    public boolean update(String sql,Object[] params) {
        Connection conn = null;
        boolean flag = false;
        try {
            conn = getCon();
            QueryRunner qRunner = new QueryRunner();
            int i = qRunner.update(conn,sql,params);
            if (i > 0) {
                flag = true;
            }
        } catch (SQLException e) {
        } finally {
            DbUtils.closeQuietly(conn);
        }
        return flag;
    }
    /**
     * 查找多个对象
     * @param sql
     * @param clazz
     * @return
     */
	public List query(String sql, Class clazz) {
        List beans = null;
        Connection conn = null;
        try {
            conn = getCon();
            QueryRunner qRunner = new QueryRunner();
            beans =
                (List) qRunner.query(
                    conn,
                    sql,
                    new BeanListHandler(clazz));
            //BeanListHandler处理了从ResultSet中获取数据，封装对象并存入List集合
            //源码同样需要用到ResultSet
        } catch (SQLException e) {
        } finally {
            DbUtils.closeQuietly(conn);
        }
        return beans;
    }
    /**
     * 重载查询多个对象方法
     * @param sql
     * @param clazz
     * @param params
     * @return
     */
    public List query(String sql, Class clazz,Object[] params) {
        List beans = null;
        Connection conn = null;
        try {
            conn = getCon();
            QueryRunner qRunner = new QueryRunner();
            beans = (List)qRunner.query(conn,sql, new BeanListHandler(clazz) ,params);
            
            //BeanListHandler处理了从ResultSet中获取数据，封装对象并存入List集合
            //源码同样需要用到ResultSet
        } catch (SQLException e) {
        } finally {
            DbUtils.closeQuietly(conn);
        }
        return beans;
    }
    /**
     * 查找对象
     * @param sql
     * @param clazz
     * @return
     */
    public Object get(String sql, Class clazz) {
        Object obj = null;
        Connection conn = null;
        try {
            conn = getCon();
            QueryRunner qRunner = new QueryRunner();
            obj = qRunner.query(conn, sql,new BeanHandler(clazz));
        } catch (SQLException e) {
        } finally {
            DbUtils.closeQuietly(conn);
        }
        return obj;
    }
    /**
     * 重载查询单对象方法
     * @param sql
     * @param clazz
     * @param params
     * @return
     */
    public Object get(String sql, Class clazz,Object[] params) {
        Object obj = null;
        Connection conn = null;
        try {
            conn = getCon();
            QueryRunner qRunner = new QueryRunner();
            obj = qRunner.query(conn, sql, new BeanHandler(clazz),params);
        } catch (SQLException e) {
        } finally {
            DbUtils.closeQuietly(conn);
        }
        return obj;
    }
    
    
}

