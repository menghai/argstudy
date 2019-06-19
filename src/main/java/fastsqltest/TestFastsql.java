package fastsqltest;

import com.alibaba.fastsql.DbType;
import com.alibaba.fastsql.sql.SQLUtils;
import com.alibaba.fastsql.sql.ast.SQLExpr;
import com.alibaba.fastsql.sql.ast.SQLStatement;
import com.alibaba.fastsql.util.JdbcConstants;

import java.util.List;

/**
 * @author haicheng.lhc@alibaba-inc.com 2018/11/09
 * @date 2018/11/09
 */

public class TestFastsql {

    public static void main(String[] args) {
        DbType dbType = JdbcConstants.MYSQL;
//        String sql = "select * from aa";
//        List<SQLStatement> statementList = SQLUtils.parseStatements(sql, dbType);
//        System.out.println(statementList.size());
//        System.out.println(SQLUtils.toSQLString(statementList, dbType));


        SQLExpr expr = SQLUtils.toSQLExpr("id=3", dbType);
        System.out.println(expr.getClass().getName());
        System.out.println(expr);
//        SQLUtils.toSQL
    }
}
