package com.rabbit.ucenter.model.enums;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @ClassName EntityEnumTypeHandler
 * @Description TODO
 * @Author LZQ
 * @Date 2019/1/29 21:47
 **/
public class EntityEnumTypeHandler<E extends Enum<E>>
        extends BaseTypeHandler<BaseEntityEnum> {

    private Class<E> type;

    public EntityEnumTypeHandler(Class<E> type) {
        if (type == null) {
            throw new IllegalArgumentException("Type argument cannot be null");
        }
        this.type = type;
    }

    private BaseEntityEnum convert(int status) {
        BaseEntityEnum[] objs = (BaseEntityEnum[]) this.type.getEnumConstants();
        for (BaseEntityEnum em : objs) {
            if (em.getIntValue() == status) {
                return em;
            }
        }
        return null;
    }

    public BaseEntityEnum getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return convert(rs.getInt(columnName));
    }

    public BaseEntityEnum getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return convert(rs.getInt(columnIndex));
    }

    public BaseEntityEnum getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return convert(cs.getInt(columnIndex));
    }

    public void setNonNullParameter(PreparedStatement ps, int i, BaseEntityEnum parameter, JdbcType jdbcType)
            throws SQLException {
        ps.setInt(i, parameter.getIntValue());
    }

}
